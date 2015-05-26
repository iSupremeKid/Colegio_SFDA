package dao.interfaces;

import java.util.Vector;

import beans.ColorBean;

public interface ColorDao {

	public boolean insertar (String name);	
	public boolean actualizar (ColorBean color);
	public boolean eliminar (int id);
	public Vector<ColorBean> listar ();
	public ColorBean obtenerporID (int id);
}
