package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.interfaces.PersonaDao;
import daofactory.DaoFactory;

import beans.PersonaBean;
import beans.ProfesorBean;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("logoff")){
			HttpSession sesiones = request.getSession();
			sesiones.removeAttribute("id_Persona");
			sesiones.removeAttribute("nombres");
			sesiones.removeAttribute("apePat");
			sesiones.removeAttribute("apeMat");
			sesiones.removeAttribute("rol");
			response.sendRedirect("inicio.jsp");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("ingresar")){
			try {
				PersonaBean testBean= new PersonaBean();
				testBean.setUser(request.getParameter("user"));
				testBean.setPassword(request.getParameter("password"));
				
				
				DaoFactory dao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
				PersonaDao perDao = dao.obtenerPersonaDao();
				PersonaBean bean = perDao.validarDatos(testBean);
				
				
				
				if(bean == null){
					request.setAttribute("mensaje", "Usuario o contraseña incorrectos");
					getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
					
				}else{
					HttpSession sesiones = request.getSession();
					sesiones.setAttribute("id_Persona", bean.getId_Persona());
					sesiones.setAttribute("nombres", bean.getNombres());
					sesiones.setAttribute("apePat", bean.getApePat());
					sesiones.setAttribute("apeMat", bean.getApeMat());
					sesiones.setAttribute("rol", bean.getId_Rol());
					
					
					getServletContext().getRequestDispatcher("/inicio.jsp").forward(request, response);
				}
				
				
			} catch (Exception e) {
				System.out.print(e);
			}
	
		}else if(action.equals("recuperar")){
			response.sendRedirect("recuperar.jsp");
		}
				
	}

}
