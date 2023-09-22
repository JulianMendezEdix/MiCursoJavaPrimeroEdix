package modelo.dao;

import modelo.javabean.Cuenta;
import java.util.ArrayList;

public interface CuentaDao {
	
	/*CRUDS*/
	boolean alta (Cuenta cuenta);
	Cuenta buscar (int id);
	ArrayList<Cuenta> buscarTodos();
	boolean modificar (Cuenta cuenta);
	boolean eliminar (int id);
	
	/*READ ESPECIFICOS, (buscarPOR)*/
	ArrayList<Cuenta> buscarPorTipo (String tipo);
	ArrayList<Cuenta> buscarPorCliente (String idCliente);
}
