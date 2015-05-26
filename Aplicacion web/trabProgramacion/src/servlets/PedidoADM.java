package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.PedidoBean;
import dao.interfaces.PedidoDao;
import dao.interfaces.PoloDao;
import daofactory.DaoFactory;

@WebServlet("/PedidoADM")
public class PedidoADM extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PedidoADM() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("detalle")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PedidoDao cd = mysqldao.obtenerPedidoDao();
				PedidoBean cb = cd.getPedido(id);
				request.setAttribute("pedido", cb);

				getServletContext().getRequestDispatcher(
						"/admin/pedido_detalle.jsp").forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}
		} else if (action.equals("editar")) {
			try {
				int id = Integer.parseInt(request.getParameter("id"));

				DaoFactory mysqldao = DaoFactory
						.obtenerFactory(DaoFactory.MYSQL);
				PedidoDao cd = mysqldao.obtenerPedidoDao();
				PedidoBean cb = cd.getPedido(id);
				request.setAttribute("pedido", cb);

				getServletContext().getRequestDispatcher(
						"/admin/pedido_editar.jsp").forward(request, response);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.print(e.getMessage());
			}

		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
