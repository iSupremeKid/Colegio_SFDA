package daofactory;

import dao.interfaces.AdministradorDao;
import dao.interfaces.ClienteDao;
import dao.interfaces.ColorDao;
import dao.interfaces.PedidoDao;
import dao.interfaces.PoloDao;
import dao.interfaces.TallaDao;


public abstract class DaoFactory {

	public static final int MYSQL = 1; 
	public static final int SQLSERVER = 2; 
	public static final int ORACLE = 3; 

	public abstract ClienteDao obtenerClienteDao(); 
	public abstract ColorDao obtenerColorDao(); 
	public abstract PoloDao obtenerPoloDao(); 
	public abstract AdministradorDao obtenerAdministradorDao();
	public abstract TallaDao obtenerTallaDao();
	public abstract PedidoDao obtenerPedidoDao();

	public static DaoFactory obtenerFactory (int factory) {
		
		switch (factory) {
			case MYSQL:
				return new MySQLDaoFactory();
				//break;
			case SQLSERVER:
				return null;
				//break;
			case ORACLE:
				return null;
				//break;
	
			default:
				return null;
		}
		
	}
}
