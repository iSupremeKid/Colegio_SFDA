package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import beans.PoloBean;
import dao.interfaces.PoloDao;
import daofactory.MySQLDaoFactory;



public class MySql_PoloDao extends MySQLDaoFactory implements PoloDao{

	@Override
	public boolean insertar(PoloBean polo) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "insert into t_shirt (name,description,price) values ("
					+ "'"+polo.getName()+"',"
					+ "'"+polo.getDescription()+"',"
					+polo.getPrice()+")";
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
	public boolean actualizar(PoloBean polo) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "update t_shirt set name='"+polo.getName()+"',"
					+ "description='"+polo.getDescription()+"',"
					+"price="+polo.getPrice()
					+" where idt_shirt="+polo.getIdt_shirt();
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
	public boolean eliminar(int id) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "delete from t_shirt where idt_shirt="+id;
			System.out.print(sql);
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
	public Vector<PoloBean> listar() {
		Vector<PoloBean> polos = new Vector<PoloBean>();
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from t_shirt";
			
			ResultSet rs = stmt.executeQuery(sql);
			PoloBean polo = null;
			while (rs.next()) {
				polo = new PoloBean();
				polo.setIdt_shirt(rs.getInt("idt_shirt"));
				polo.setName(rs.getString("name"));
				polo.setDescription(rs.getString("description"));
				polo.setPrice(rs.getDouble("price"));
				polos.add(polo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return polos;
	}

	@Override
	public PoloBean obtenerporID(int id) {
		PoloBean polo = null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from t_shirt where idt_shirt="+id;
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				polo = new PoloBean();
				polo.setIdt_shirt(rs.getInt("idt_shirt"));
				polo.setName(rs.getString("name"));
				polo.setDescription(rs.getString("description"));
				polo.setPrice(rs.getDouble("price"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return polo;
	}

}
