package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.AdministradorBean;
import dao.interfaces.AdministradorDao;
import daofactory.MySQLDaoFactory;

public class MySql_AdministradorDao
					extends MySQLDaoFactory
						implements AdministradorDao{

	@Override
	public AdministradorBean validarDatos(AdministradorBean admin) {
		AdministradorBean adminbean = null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from manager " +
					" where user= '"+admin.getUser()+"' " +
					" and pwd = '"+admin.getPwd()+"' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				adminbean = new AdministradorBean();
				adminbean.setIdmanager(rs.getInt("idmanager") );
				adminbean.setName(rs.getString("name"));
				adminbean.setLast_name(rs.getString("last_name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return adminbean;
	}

}
