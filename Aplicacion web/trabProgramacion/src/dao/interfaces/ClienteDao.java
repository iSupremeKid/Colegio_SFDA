package dao.interfaces;

import beans.ClienteBean;

public interface ClienteDao {

	public ClienteBean validarDatos(ClienteBean cliente);
	public boolean insertCliente(ClienteBean cliente);
	public ClienteBean obtenerCliente(int id);
	
	
}
