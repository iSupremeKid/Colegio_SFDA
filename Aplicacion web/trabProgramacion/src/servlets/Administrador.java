package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AdministradorBean;
import dao.interfaces.AdministradorDao;
import daofactory.DaoFactory;

/**
 * Servlet implementation class Administrador
 */
@WebServlet("/Administrador")
public class Administrador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Administrador() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesiones = request.getSession();
		sesiones.removeAttribute("adminid");
		sesiones.removeAttribute("adminnombre");
		sesiones.invalidate();
		response.sendRedirect("admin/index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			AdministradorBean admin = new AdministradorBean();
			admin.setUser( request.getParameter("usuario") );
			admin.setPwd( request.getParameter("clave") );
			
			DaoFactory dao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
			AdministradorDao admindao = dao.obtenerAdministradorDao();
			AdministradorBean admin1 = admindao.validarDatos(admin);
			
			if(admin1 == null){
				request.setAttribute("mensaje", "Datos incorrectos");
				getServletContext().
								getRequestDispatcher("/admin/index.jsp")
											.forward(request, response);
			}else{
				HttpSession sesiones = request.getSession();

				sesiones.setAttribute("adminid", admin1.getIdmanager());
				sesiones.setAttribute("adminnombre", admin1.getName()+" "+admin1.getLast_name());
								
				getServletContext().
								getRequestDispatcher("/admin/escritorio.jsp")
											.forward(request, response);
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
