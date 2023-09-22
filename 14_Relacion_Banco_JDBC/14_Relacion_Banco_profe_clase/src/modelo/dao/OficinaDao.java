package modelo.dao;

import modelo.javabean.Oficina;
import java.util.List;

public interface OficinaDao {
	/*
	 * Explica que estos métodos los configura él a su antojo. Forman parte de un diseño, que, o nos lo darán clarito 
	 * con unas especificaciones, o bien tendremos que hacer nosotros el diseño. En cualquier caso se suele basar en 
	 * CRUD (Create alta, Read leer buscar , Update modificar, Delete eliminar)
	 * 
	 * 
	 */
	int alta (Oficina oficina);
	Oficina buscar (int idOficina);
	List <Oficina> buscarTodos ();
	int modificar (Oficina oficina);
	int eliminar (Oficina oficina);

	List <Oficina> buscarPorPrefijo (String prefijo);
	List <Oficina> buscarPorCiudad (String ciudad);
}
