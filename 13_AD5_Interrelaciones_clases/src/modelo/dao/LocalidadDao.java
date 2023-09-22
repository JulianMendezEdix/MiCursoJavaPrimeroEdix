package modelo.dao;

import modelo.javabeans.Localidad;
import java.util.ArrayList;

public interface LocalidadDao {
	
	/*CRUD*/
	
	boolean alta (Localidad localidad);
	Localidad buscar (int id);
	ArrayList<Localidad> buscarTodos ();
	boolean modificar (Localidad localidad);
	boolean eliminar (int id);

	ArrayList<Localidad> buscarPorCiudad (String ciudad);
	
}
