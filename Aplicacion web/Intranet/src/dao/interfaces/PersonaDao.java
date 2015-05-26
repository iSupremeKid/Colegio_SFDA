package dao.interfaces;

import beans.PersonaBean;

public interface PersonaDao {
	
	public PersonaBean validarDatos(PersonaBean persona);
	
	public PersonaBean validarEmail(String email);
}
