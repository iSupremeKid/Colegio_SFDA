package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.ColorBean;
import dao.interfaces.ColorDao;
import daofactory.DaoFactory;

@WebServlet("/Color")
public class Color extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Color() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("editar")){
			try {
				int id  = Integer.parseInt(request.getParameter("id"));
				
				DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
				ColorDao cd = mysqldao.obtenerColorDao();
				ColorBean cb = cd.obtenerporID(id);
				request.setAttribute("color", cb);
				
				getServletContext().getRequestDispatcher("/admin/actualizarcolor.jsp")
														.forward(request, response);
				
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}else if(action.equals("eliminar")){
			try {
				int id  = Integer.parseInt(request.getParameter("id"));
				
				DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
				ColorDao cd = mysqldao.obtenerColorDao();
				boolean flag = cd.eliminar(id);
				
				if(flag){
					request.setAttribute("mensaje_color", "Se elimino :)");
				}else{
					request.setAttribute("mensaje_color", "Ocurrió un error");
				}
				
				getServletContext().getRequestDispatcher("/admin/color.jsp")
														.forward(request, response);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}			
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("actualizar")) {
			try {
				String nombre = request.getParameter("name");
				int id = Integer.parseInt(request.getParameter("id"));

				ColorBean color = new ColorBean();
				color.setIdcolor(id);
				color.setName(nombre);

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				ColorDao cd = mysqldao.obtenerColorDao();
				boolean flag = cd.actualizar(color);

				if (flag) {
					request.setAttribute("mensaje_color", "Datos actualizados");
				} else {
					request.setAttribute("mensaje_color",
							"Ocurrió un error al actualizar");
				}

				getServletContext().getRequestDispatcher("/admin/color.jsp")
						.forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
		} else if (action.equals("registrar")) {
			try {
				String nombre = request.getParameter("name");
				int id = Integer.parseInt(request.getParameter("id"));

				ColorBean color = new ColorBean();
				color.setIdcolor(id);
				color.setName(nombre);

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				ColorDao cd = mysqldao.obtenerColorDao();
				boolean flag = cd.actualizar(color);

				if (flag) {
					request.setAttribute("mensaje_color", "Datos actualizados");
				} else {
					request.setAttribute("mensaje_color",
							"Ocurrió un error al actualizar");
				}

				getServletContext().getRequestDispatcher("/admin/color.jsp")
						.forward(request, response);

			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		} 
	}

}
