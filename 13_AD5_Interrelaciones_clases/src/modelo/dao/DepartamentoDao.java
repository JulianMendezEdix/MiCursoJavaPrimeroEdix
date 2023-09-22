package modelo.dao;

import modelo.javabeans.Departamento;
import java.util.ArrayList;

public interface DepartamentoDao {
	
	boolean alta (Departamento dep);
	Departamento buscar (int id);
	ArrayList<Departamento> buscarTodos ();
	boolean modificar (Departamento dep);
	boolean eliminar (int id);
	ArrayList<Departamento> buscarPorCiudad(String ciudad);
}
