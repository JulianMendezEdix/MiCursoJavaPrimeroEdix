package modelo.dao;

import modelo.javabean.Oficina;
import java.util.ArrayList;

public interface OficinaDao {
	/*
	 * Explica que estos métodos los configura él a su antojo. Forman parte de un diseño, que, o nos lo darán clarito 
	 * con unas especificaciones, o bien tendremos que hacer nosotros el diseño. En cualquier caso se suele basar en 
	 * CRUD (Create alta, Read leer buscar , Update modificar, Delete eliminar)
	 * 
	 * 
	 */
	
	boolean altaOficina (Oficina oficina);
	boolean eliminarOficina (Oficina oficina);
	Oficina modificarOficina (Oficina oficina); /*devuelve la oficina que habia antes de la modificacion por si la quieres para algo...*/
	Oficina buscarOficina (int idOficina);
	ArrayList <Oficina> buscarTodos ();
	ArrayList <Oficina> buscarPorPrefijo (String prefijo);
	ArrayList <Oficina> buscarPorCiudad (String ciudad);
}
