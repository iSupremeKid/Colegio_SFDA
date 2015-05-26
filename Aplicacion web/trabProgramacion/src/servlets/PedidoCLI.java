package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.PedidoBean;
import dao.interfaces.PedidoDao;
import daofactory.DaoFactory;

@WebServlet("/PedidoCLI")
public class PedidoCLI extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PedidoCLI() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession sesiones = request.getSession();
			int i=(Integer)sesiones.getAttribute("clienteid");
			int id = Integer.parseInt(request.getParameter("id"));

			DaoFactory mysqldao = DaoFactory
					.obtenerFactory(DaoFactory.MYSQL);
			PedidoDao cd = mysqldao.obtenerPedidoDao();
			PedidoBean cb = cd.getPedido(id);
			if(cb.getIdperson()==i){
				request.setAttribute("pedido", cb);
				getServletContext().getRequestDispatcher(
						"/pedido_detalle.jsp").forward(request, response);
			}else{
				response.sendRedirect(getServletContext().getContextPath()+"/mispedidos.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
