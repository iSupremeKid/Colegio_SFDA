package dao.interfaces;

import java.util.Vector;
import beans.PoloBean;

public interface PoloDao {
	public boolean insertar (PoloBean polo);	
	public boolean actualizar (PoloBean polo);
	public boolean eliminar (int id);
	public Vector<PoloBean> listar ();
	public PoloBean obtenerporID (int id);
}


