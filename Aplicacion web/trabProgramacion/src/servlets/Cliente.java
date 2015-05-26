package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import beans.ClienteBean;
import dao.interfaces.ClienteDao;
import daofactory.DaoFactory;

@WebServlet("/Cliente")
public class Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Cliente() {
        super();
     }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesiones = request.getSession();
		sesiones.removeAttribute("clienteid");
		sesiones.removeAttribute("clientenombre");
		sesiones.invalidate();
		response.sendRedirect("index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ClienteBean cli = new ClienteBean();
			cli.setUser( request.getParameter("usuario") );
			cli.setPwd( request.getParameter("clave") );
			
			DaoFactory dao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
			ClienteDao clidao = dao.obtenerClienteDao();
			ClienteBean cli2 = clidao.validarDatos(cli);
			
			if(cli2 == null){
				request.setAttribute("mensaje", "Datos incorrectos");
				getServletContext().
								getRequestDispatcher("/index.jsp")
											.forward(request, response);
			}else{
				HttpSession sesiones = request.getSession();

				sesiones.setAttribute("clienteid", cli2.getIdperson());
				sesiones.setAttribute("clientenombre", cli2.getName()+" "+cli2.getLast_name1()+" "+cli2.getLast_name2());
								
				getServletContext().
								getRequestDispatcher("/escritorio.jsp")
											.forward(request, response);
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
