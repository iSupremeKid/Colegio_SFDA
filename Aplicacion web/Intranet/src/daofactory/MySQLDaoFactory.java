package daofactory;

import java.sql.Connection; 
import java.sql.DriverManager;
import dao.interfaces.PersonaDao;
import dao.mysql.MySQL_PersonaDao;



public class MySQLDaoFactory extends DaoFactory {

	public static Connection obtenerConexion(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			String url = "jdbc:mysql://localhost:3306/bd_Intranet";
			con = DriverManager.getConnection(url, "root", "root");		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return con;
	}

	@Override
	public PersonaDao obtenerPersonaDao() {
		return new MySQL_PersonaDao();
	}
	
	
}
