package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import beans.ColorBean;
import dao.interfaces.ColorDao;
import daofactory.MySQLDaoFactory;

public class MySql_ColorDao extends MySQLDaoFactory implements ColorDao{

	@Override
	public boolean insertar(String name) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "insert into color (name) values ('"+name+"')";
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
	public boolean actualizar(ColorBean color) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "update color set name='"+color.getName()+"' where idcolor="+color.getIdcolor();
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
	public boolean eliminar(int id) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "delete from color where idcolor="+id;
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
	public Vector<ColorBean> listar() {
		Vector<ColorBean> colores = new Vector<ColorBean>();
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from color";
			
			ResultSet rs = stmt.executeQuery(sql);
			ColorBean color = null;
			while (rs.next()) {
				color = new ColorBean();
				color.setIdcolor(rs.getInt("idcolor"));
				color.setName(rs.getString("name"));
				
				colores.add(color);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return colores;
	}

	@Override
	public ColorBean obtenerporID(int id) {
		ColorBean color = null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from color where idcolor="+id;
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				color = new ColorBean();
				color.setIdcolor(rs.getInt("idcolor"));
				color.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		return color;
	}

}
