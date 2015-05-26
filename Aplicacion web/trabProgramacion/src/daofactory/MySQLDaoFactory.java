package daofactory;

import java.sql.Connection;
import java.sql.DriverManager;

import dao.interfaces.AdministradorDao;
import dao.interfaces.ClienteDao;
import dao.interfaces.ColorDao;
import dao.interfaces.PedidoDao;
import dao.interfaces.PoloDao;
import dao.interfaces.TallaDao;
import dao.mysql.MySql_AdministradorDao;
import dao.mysql.MySql_ClienteDao;
import dao.mysql.MySql_ColorDao;
import dao.mysql.MySql_PedidoDao;
import dao.mysql.MySql_PoloDao;
import dao.mysql.MySql_TallaDao;



public class MySQLDaoFactory extends DaoFactory {

	public static Connection obtenerConexion(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url, "root", "root");		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return con;
	}
	
	public AdministradorDao obtenerAdministradorDao() {
		return new MySql_AdministradorDao();
	}
	public ClienteDao obtenerClienteDao() {
		return new MySql_ClienteDao();
	}
	public ColorDao obtenerColorDao() {
		return new MySql_ColorDao();
	}
	public PoloDao obtenerPoloDao() {
		return new MySql_PoloDao();
	}
	public TallaDao obtenerTallaDao() {
		return new MySql_TallaDao();
	}
	public PedidoDao obtenerPedidoDao() {
		return new MySql_PedidoDao();
	}
}
