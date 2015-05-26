package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.ClienteBean;
import dao.interfaces.ClienteDao;
import daofactory.MySQLDaoFactory;

public class MySql_ClienteDao extends MySQLDaoFactory implements ClienteDao{

	@Override
	public ClienteBean validarDatos(ClienteBean cliente) {
		ClienteBean clientebean = null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from client " +
					" where user= '"+cliente.getUser()+"' " +
					" and pwd = '"+cliente.getPwd()+"' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				clientebean = new ClienteBean();
				clientebean.setIdperson(rs.getInt("idperson") );
				clientebean.setName(rs.getString("name"));
				clientebean.setLast_name1(rs.getString("last_name1"));
				clientebean.setLast_name2(rs.getString("last_name2"));
				clientebean.setGender(rs.getString("gender").charAt(0));
				clientebean.setDate_birth(rs.getNString("date_birth"));
				clientebean.setUser(rs.getString("user"));
				clientebean.setPwd(rs.getString("pwd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return clientebean;
	}

	@Override
	public boolean insertCliente(ClienteBean cliente) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "insert into client (name,last_name1,last_name2,user,pwd,gender,date_birth) values ("
					+ "'"+cliente.getName()+"',"
					+ "'"+cliente.getLast_name1()+"',"
					+ "'"+cliente.getLast_name2()+"',"
					+ "'"+cliente.getUser()+"',"
					+ "'"+cliente.getPwd()+"',"
					+ "'"+cliente.getGender()+"',"
					+ "'"+cliente.getDate_birth()+"')";
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
	public ClienteBean obtenerCliente(int id) {
		ClienteBean clientebean=null;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "select * from client "+
					" where idperson="+id;
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				clientebean = new ClienteBean();
				clientebean.setIdperson(rs.getInt("idperson") );
				clientebean.setName(rs.getString("name"));
				clientebean.setLast_name1(rs.getString("last_name1"));
				clientebean.setLast_name2(rs.getString("last_name2"));
				clientebean.setGender(rs.getString("gender").charAt(0));
				clientebean.setDate_birth(rs.getNString("date_birth"));
				clientebean.setUser(rs.getString("user"));
				clientebean.setPwd(rs.getString("pwd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return clientebean;
	}

}
