package modelo.dao;

import modelo.javabean.Cliente;
import java.util.List;

public interface ClienteDao {
	
	/*CRUDS*/
	
	int alta (Cliente cliente);
	Cliente buscar (String id);
	List<Cliente> buscarTodos ();
	int modificar (Cliente cliente);
	int eliminar (String id);
	
	/*Read especificos, (buscarPor)*/
	List<Cliente> buscarPorOficina (int idOficina);

}
