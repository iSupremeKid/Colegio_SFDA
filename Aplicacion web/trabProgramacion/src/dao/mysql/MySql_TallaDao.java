package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import beans.Talla;
import dao.interfaces.TallaDao;
import daofactory.MySQLDaoFactory;

public class MySql_TallaDao extends MySQLDaoFactory implements TallaDao{

	@Override
	public Vector<Talla> listar() {
		Vector<Talla> tallas = new Vector<Talla>();
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from size";
			
			ResultSet rs = stmt.executeQuery(sql);
			Talla talla = null;
			while (rs.next()) {
				talla = new Talla();
				talla.setIdsize(rs.getString("idsize"));
				talla.setSize_mame(rs.getString("size_name"));
				
				tallas.add(talla);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return tallas;
	}
	
	

}
