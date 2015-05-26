package dao.interfaces;

import java.util.Vector;

import beans.PedidoBean;

public interface PedidoDao {
	public boolean insertar (PedidoBean pedido);	
	public Vector<PedidoBean> getAll ();	
	public Vector<PedidoBean> getPedidoUsuario (int id_user);
	public PedidoBean getPedido (int id_order);
	public boolean actualizar(PedidoBean pedido);

}
