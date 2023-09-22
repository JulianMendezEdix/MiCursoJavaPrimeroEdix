package modelo.dao;
import modelo.javabeans.Trabajo;
import java.util.ArrayList;

public interface TrabajoDao {
	
	boolean alta (Trabajo trabajo);
	Trabajo buscar (String id);
	ArrayList<Trabajo> buscarTodos();
	boolean modificar (Trabajo trabajo);
	boolean eliminar (String idTrabajo);
	ArrayList<Trabajo> buscarPorMaxSalario (double MaxSalario);
	
}
