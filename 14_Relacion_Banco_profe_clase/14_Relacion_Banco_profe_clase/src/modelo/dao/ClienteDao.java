package modelo.dao;

import modelo.javabean.Cliente;
import java.util.ArrayList;

public interface ClienteDao {
	
	/*CRUDS*/
	
	boolean alta (Cliente cliente);
	Cliente buscar (String id);
	ArrayList<Cliente> buscarTodos ();
	boolean modificar (Cliente cliente);
	boolean eliminar (String id);
	
	/*Read especificos, (buscarPor)*/
	ArrayList<Cliente> buscarPorOficina (int idOficina);

}
