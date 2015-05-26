package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ClienteBean;
import dao.interfaces.ClienteDao;
import daofactory.DaoFactory;

/**
 * Servlet implementation class RegistrarCliente
 */
@WebServlet("/RegistrarCliente")
public class RegistrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nombre = request.getParameter("name");
			String last_name1 = request.getParameter("last_name1");
			String last_name2 = request.getParameter("last_name2");
			String user = request.getParameter("user");
			String pwd = request.getParameter("pwd");
			String mes = request.getParameter("mes");
			String dia = request.getParameter("dia");
			String ano = request.getParameter("ano");
			char gender = request.getParameter("gender").charAt(0);
			
			ClienteBean a=new ClienteBean();
			a.setName(nombre);
			a.setLast_name1(last_name1);
			a.setLast_name2(last_name2);
			a.setUser(user);
			a.setPwd(pwd);
			a.setGender(gender);
			a.setDate_birth(ano+"-"+mes+"-"+dia);
			
			
			DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
			ClienteDao cd = mysqldao.obtenerClienteDao();
			boolean flag = cd.insertCliente(a);
			
			if(flag){
				request.setAttribute("mensaje", "Registrado...");
			}else{
				request.setAttribute("mensaje", "Ocurrió un error");
			}
			
			getServletContext().getRequestDispatcher("/index.jsp")
													.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

}
