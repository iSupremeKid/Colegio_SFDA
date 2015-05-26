package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.PoloBean;
import dao.interfaces.PoloDao;
import daofactory.DaoFactory;

@WebServlet("/Polo")
public class Polo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Polo() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("editar")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PoloDao cd = mysqldao.obtenerPoloDao();
				PoloBean cb = cd.obtenerporID(id);
				request.setAttribute("polo", cb);

				getServletContext().getRequestDispatcher(
						"/admin/actualizarpolo.jsp").forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
		} else if (action.equals("eliminar")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PoloDao cd = mysqldao.obtenerPoloDao();
				boolean flag = cd.eliminar(id);

				if (flag) {
					request.setAttribute("mensaje_polo", "Se elimino :)");
				} else {
					request.setAttribute("mensaje_polo", "Ocurrió un error");
				}

				getServletContext().getRequestDispatcher("/admin/polo.jsp")
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
				int id = Integer.parseInt(request.getParameter("id"));
				String nombre = request.getParameter("name");
				String descripcion = request.getParameter("description");
				double precio = Double.parseDouble(request
						.getParameter("price"));
				PoloBean a = new PoloBean();
				a.setIdt_shirt(id);
				a.setName(nombre);
				a.setDescription(descripcion);
				a.setPrice(precio);

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PoloDao cd = mysqldao.obtenerPoloDao();
				boolean flag = cd.actualizar(a);

				if (flag) {
					request.setAttribute("mensaje_polo", "Datos guardados");
				} else {
					request.setAttribute("mensaje_polo", "Ocurrió un error");
				}

				getServletContext().getRequestDispatcher("/admin/polo.jsp")
						.forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
		} else if (action.equals("registrar")) {
			
			try {
				String nombre = request.getParameter("name");
				String descripcion = request.getParameter("description");
				double precio = Double.parseDouble(request
						.getParameter("price"));
				PoloBean a = new PoloBean();
				a.setName(nombre);
				a.setDescription(descripcion);
				a.setPrice(precio);

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PoloDao cd = mysqldao.obtenerPoloDao();
				boolean flag = cd.insertar(a);

				if (flag) {
					request.setAttribute("mensaje_polo", "Guardado!");
				} else {
					request.setAttribute("mensaje_polo", "Ocurrió un error");
				}

				getServletContext().getRequestDispatcher("/admin/polo.jsp")
						.forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
		}
	}

}
