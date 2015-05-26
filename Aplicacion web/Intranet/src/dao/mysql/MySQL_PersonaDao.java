package dao.mysql;

import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.Statement;
import dao.interfaces.PersonaDao;
import daofactory.MySQLDaoFactory;
import beans.PersonaBean;

public class MySQL_PersonaDao implements PersonaDao {

	public PersonaBean validarDatos(PersonaBean persona){
		PersonaBean bean = null;
		
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM T_Persona WHERE user = '"+persona.getUser()+"' AND password = '"+persona.getPassword()+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				bean = new PersonaBean();
				bean.setId_Persona(rs.getInt("id_Persona"));
				bean.setNombres(rs.getString("nombres"));
				bean.setApePat(rs.getString("apePat"));
				bean.setApeMat(rs.getString("apeMat"));
				bean.setTelefono(rs.getString("telefono"));
				bean.setDni(rs.getString("dni"));
				bean.setCorreo(rs.getString("correo"));
				bean.setFec_nac(rs.getString("fec_nac"));
				bean.setGenero(rs.getString("genero").charAt(0));
				bean.setFoto(rs.getString("foto"));
				bean.setUser(rs.getString("user"));
				bean.setPassword(rs.getString("password"));
			}else{
				
			}
			
		} catch (Exception e) {
			System.out.print(e);
		}
		
		return bean;
		
	}
	
	public PersonaBean validarEmail(String email){
		PersonaBean bean = null;
		
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql="SELECT nombres, apePat, apeMat,user, password FROM T_Persona WHERE correo ='"+email+"'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				bean = new PersonaBean();
				bean.setNombres(rs.getString("nombres"));
				bean.setApePat(rs.getString("apePat"));
				bean.setApeMat(rs.getString("apeMat"));
				bean.setUser(rs.getString("user"));
				bean.setPassword(rs.getString("password"));
				
				return bean;
			}
				
			
		} catch (Exception e) {
			return bean;
		}
		
	return bean;	
		
	}
	
	
}

