package modelo.dao;

import modelo.javabean.Cuenta;
import java.util.List;

public interface CuentaDao {
	
	/*CRUDS*/
	int alta (Cuenta cuenta);
	Cuenta buscar (int id);
	List<Cuenta> buscarTodos();
	int modificar (Cuenta cuenta);
	int eliminar (int id);
	
	/*READ ESPECIFICOS, (buscarPOR)*/
	List<Cuenta> buscarPorTipo (String tipo);
	List<Cuenta> buscarPorCliente (String idCliente);
}
