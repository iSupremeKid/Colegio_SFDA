package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import beans.PedidoBean;
import dao.interfaces.PedidoDao;
import daofactory.MySQLDaoFactory;

public class MySql_PedidoDao extends MySQLDaoFactory implements PedidoDao{

	@Override
	public boolean insertar(PedidoBean pedido) {
		boolean flag = false;
		int idcolor=pedido.getIdcolor();
		int idt_shirt=pedido.getIdt_shirt();
		String idsize=pedido.getIdsize();
		String first_name=pedido.getFirst_name();
		String last_name=pedido.getLast_name();
		String email=pedido.getEmail();
		String adress=pedido.getAdress();
		String city=pedido.getCity();
		String region=pedido.getRegion();
		String zip_code=pedido.getZip_code();
		int gift=pedido.getGift();
		double sale_price=pedido.getSale_price();
		int idperson=pedido.getIdperson();
		
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "insert into order_detail (idcolor,idt_shirt,idsize,first_name,last_name,email,adress,city,region,zip_code,gift,sale_price,order_date,idperson) values"
					+ "("+idcolor+","+idt_shirt+",'"+idsize+"','"+first_name+"','"+last_name+"','"+email+"','"+adress+"','"+city+"','"+region+"','"+zip_code+"',"+gift+","+sale_price+",CURDATE(),"+idperson+")";
			int filas = stmt.executeUpdate(sql);
			if(filas == 1){
				flag = true;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return flag;
	}
	
	public boolean actualizar(PedidoBean pedido) {
		boolean flag = false;
		int idcolor=pedido.getIdcolor();
		int idt_shirt=pedido.getIdt_shirt();
		String idsize=pedido.getIdsize();
		String first_name=pedido.getFirst_name();
		String last_name=pedido.getLast_name();
		String email=pedido.getEmail();
		String adress=pedido.getAdress();
		String city=pedido.getCity();
		String region=pedido.getRegion();
		String zip_code=pedido.getZip_code();
		int gift=pedido.getGift();
		double sale_price=pedido.getSale_price();
		int idperson=pedido.getIdperson();
		
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
						
			String sql = "update order_detail set idcolor='"+pedido.getIdcolor()+"',"
			        + "idt_shirt='"+pedido.getIdt_shirt()+"',"
			        + "idsize='"+pedido.getIdsize()+"',"
			        + "first_name='"+pedido.getFirst_name() +"',"
			        + "last_name='"+pedido.getLast_name() +"',"
			        +" email='"+pedido.getEmail() +"',"
			        +" adress='"+pedido.getAdress() +"',"
			        +" city='"+pedido.getCity() +"',"
			        +" region='"+pedido.getRegion() +"',"
			        +" zip_code='"+pedido.getZip_code() +"',"
			        +" gift='"+pedido.getGift() +"',"
			        +" sale_price='"+pedido.getSale_price() +"',"
			        +" order_date='"+pedido.getOrder_date() +"',"
			        + " where idperson=" + pedido.getIdperson();
			        
			int filas = stmt.executeUpdate(sql);
			if(filas == 1){
				flag = true;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return flag;
	}


	@Override
	public Vector<PedidoBean> getAll() {
		Vector<PedidoBean> pedidos = new Vector<PedidoBean>();
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from order_detail";
			
			ResultSet rs = stmt.executeQuery(sql);
			PedidoBean pedido = null;
			while (rs.next()) {
				pedido = new PedidoBean();
				pedido.setIdcolor(rs.getInt("idcolor"));
				pedido.setIdt_shirt(rs.getInt("idt_shirt"));
				pedido.setIdsize(rs.getString("idsize"));
				pedido.setFirst_name(rs.getString("first_name"));
				pedido.setLast_name(rs.getString("last_name"));
				pedido.setEmail(rs.getString("email"));
				pedido.setAdress(rs.getString("adress"));
				pedido.setCity(rs.getString("city"));
				pedido.setRegion(rs.getString("region"));
				pedido.setZip_code(rs.getString("zip_code"));
				pedido.setGift(rs.getInt("gift"));
				pedido.setSale_price(rs.getDouble("sale_price"));
				pedido.setOrder_date(rs.getString("order_date"));
				pedido.setIdperson(rs.getInt("idperson"));
				pedido.setId(rs.getInt("idorder"));
				pedidos.add(pedido);
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return pedidos;
	}

	@Override
	public Vector<PedidoBean> getPedidoUsuario(int id_user) {
		Vector<PedidoBean> pedidos = new Vector<PedidoBean>();
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from order_detail where idperson="+id_user;
			
			ResultSet rs = stmt.executeQuery(sql);
			PedidoBean pedido = null;
			while (rs.next()) {
				pedido = new PedidoBean();
				pedido.setIdcolor(rs.getInt("idcolor"));
				pedido.setIdt_shirt(rs.getInt("idt_shirt"));
				pedido.setIdsize(rs.getString("idsize"));
				pedido.setFirst_name(rs.getString("first_name"));
				pedido.setLast_name(rs.getString("last_name"));
				pedido.setEmail(rs.getString("email"));
				pedido.setAdress(rs.getString("adress"));
				pedido.setCity(rs.getString("city"));
				pedido.setRegion(rs.getString("region"));
				pedido.setZip_code(rs.getString("zip_code"));
				pedido.setGift(rs.getInt("gift"));
				pedido.setSale_price(rs.getDouble("sale_price"));
				pedido.setOrder_date(rs.getString("order_date"));
				pedido.setIdperson(rs.getInt("idperson"));
				pedido.setId(rs.getInt("idorder"));
				pedidos.add(pedido);
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return pedidos;
	}
	public PedidoBean getPedido (int id_order){
		PedidoBean pedido = null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from order_detail where idorder="+id_order;
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				pedido = new PedidoBean();
				pedido.setIdcolor(rs.getInt("idcolor"));
				pedido.setIdt_shirt(rs.getInt("idt_shirt"));
				pedido.setIdsize(rs.getString("idsize"));
				pedido.setFirst_name(rs.getString("first_name"));
				pedido.setLast_name(rs.getString("last_name"));
				pedido.setEmail(rs.getString("email"));
				pedido.setAdress(rs.getString("adress"));
				pedido.setCity(rs.getString("city"));
				pedido.setRegion(rs.getString("region"));
				pedido.setZip_code(rs.getString("zip_code"));
				pedido.setGift(rs.getInt("gift"));
				pedido.setSale_price(rs.getDouble("sale_price"));
				pedido.setOrder_date(rs.getString("order_date"));
				pedido.setIdperson(rs.getInt("idperson"));
				pedido.setId(rs.getInt("idorder"));
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return pedido;
	}

	
}
