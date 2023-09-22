package modelo.dao;

import modelo.javabeans.Empleado;

import java.util.ArrayList;

public interface EmpleadoDao {
	
	/*CRUD*/
	
	boolean altaUno (Empleado empleado);
	Empleado buscarUno (int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	boolean modificarUno (Empleado empleado);
	boolean eliminarUno (int idEmpleado);
	ArrayList<Empleado> buscarPorSexo (char sexo);
	double masaSalarial ();
	ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	ArrayList<Empleado> buscarPorTrabajo (String idTrabajo);
	ArrayList<Empleado> buscarPorPais (String pais);
	
	
}
