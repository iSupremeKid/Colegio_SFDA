package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.PedidoBean;
import beans.PoloBean;
import dao.interfaces.PedidoDao;
import dao.interfaces.PoloDao;
import daofactory.DaoFactory;

/**
 * Servlet implementation class Comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Comprar() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		try {
			if(action.equals("Enviar")){
			
			int idcolor= Integer.parseInt(request.getParameter("color"));
			int idt_shirt= Integer.parseInt(request.getParameter("polos"));
			String idsize= request.getParameter("size");
			String first_name= request.getParameter("first");
			String last_name= request.getParameter("last");
			String email= request.getParameter("email");
			String adress= request.getParameter("adress");
			String city= request.getParameter("city");
			String region= request.getParameter("region");
			String zip_code= request.getParameter("zip_code"); 
			int gift=-1;
			try{
			if(request.getParameter("gift").equals("on")){
				gift=1;
			}
			}catch(Exception e){
				gift = 0;
			}
			HttpSession sesiones = request.getSession();
			int idperson= (int)sesiones.getAttribute("clienteid");
			
			PedidoBean a=new PedidoBean();
			a.setIdcolor( idcolor);
			a.setIdt_shirt( idt_shirt);
			a.setIdsize( idsize);
			a.setFirst_name( first_name);
			a.setLast_name( last_name);
			a.setEmail( email);
			a.setAdress( adress);
			a.setCity( city);
			a.setRegion( region);
			a.setZip_code( zip_code);
			a.setGift( gift);
			
			a.setIdperson( idperson);		
			
			DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
			PedidoDao cd = mysqldao.obtenerPedidoDao();
			PoloDao pd=mysqldao.obtenerPoloDao();
			PoloBean tmp=pd.obtenerporID(idt_shirt);
				
			a.setSale_price(tmp.getPrice());
			
			boolean flag = cd.insertar(a);
			
			if(flag){
				request.setAttribute("mensaje_pedido", "Compra realizada!!!");
			}else{
				request.setAttribute("mensaje_pedido", "No se pudo hacer el pedido");
			}
			
			getServletContext().getRequestDispatcher("/escritorio.jsp")
													.forward(request, response);
			}else if(action.equals("Editar")){
				
				int idcolor= Integer.parseInt(request.getParameter("color"));
				int idt_shirt= Integer.parseInt(request.getParameter("polos"));
				String idsize= request.getParameter("size");
				String first_name= request.getParameter("first");
				String last_name= request.getParameter("last");
				String email= request.getParameter("email");
				String adress= request.getParameter("adress");
				String city= request.getParameter("city");
				String region= request.getParameter("region");
				String zip_code= request.getParameter("zip_code"); 
				int gift=-1;
				try{
				if(request.getParameter("gift").equals("on")){
					gift=1;
				}
				}catch(Exception e){
					gift = 0;
				}
				HttpSession sesiones = request.getSession();
				int idperson= (int)sesiones.getAttribute("clienteid");
				
				PedidoBean b=new PedidoBean();
				b.setIdcolor( idcolor);
				b.setIdt_shirt( idt_shirt);
				b.setIdsize( idsize);
				b.setFirst_name( first_name);
				b.setLast_name( last_name);
				b.setEmail( email);
				b.setAdress( adress);
				b.setCity( city);
				b.setRegion( region);
				b.setZip_code( zip_code);
				b.setGift( gift);
				
				b.setIdperson( idperson);		
				
				DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
				PedidoDao cd = mysqldao.obtenerPedidoDao();
				PoloDao pd=mysqldao.obtenerPoloDao();
				PoloBean tmp=pd.obtenerporID(idt_shirt);
					
				b.setSale_price(tmp.getPrice());
				
				boolean flag = cd.actualizar(b);
				
				if(flag){
					request.setAttribute("mensaje_pedido", "Actualizacion realizada!!!");
				}else{
					request.setAttribute("mensaje_pedido", "No se pudo hacer la actualizacion");
				}
				
				getServletContext().getRequestDispatcher("/escritorio.jsp")
														.forward(request, response);
				// en donde va no se si es en pedidos o en compras XD
							}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}
}
