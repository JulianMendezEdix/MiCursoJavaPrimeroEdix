package modelo.dao.implList;

import modelo.dao.EmpleadoDao;
import modelo.javabeans.*;
import java.util.ArrayList;

public class EmpleadoDaoImplList implements EmpleadoDao {
	
	private String nombre;
	private ArrayList <Empleado> lista;
	
	public EmpleadoDaoImplList (String nombre) {
		super();
		this.nombre=nombre;
		lista = new ArrayList<>(); /*Arranco la lista del objeto con
		 el metodo constructor de ArrayList;*/
		cargarDatos();
	}
	
	public void cargarDatos () {
		
		lista.add(new Empleado(1, "julian", "Mendez Podadera", 'M', "jm@jj.com", 20_000, 5_000, null, null));
		lista.add(new Empleado(2, "klaus", "Strauss Podadera", 'h', "kl@jj.com", 30_000, 6_000, null, null));
		lista.add(new Empleado(3, "julian", "Mendez Podadera", 'M', "jm@jj.com", 20_000, 5_000, null, null));
		lista.add(new Empleado(4, "klaus", "Strauss Podadera", 'h', "kl@jj.com", 30_000, 6_000, null, null));
		
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;		
	}
	
	@Override
	public boolean altaUno (Empleado empleado) {
		if (!lista.contains(empleado))
			return lista.add(empleado);
		else
			return false;
	}
	
	@Override
	public Empleado buscarUno (int idEmpleado) {
		int i;
		i = lista.indexOf(new Empleado(idEmpleado, null, null, '0', null, 0, 0, null, null));
		return lista.get(i);
	}
	
	@Override
	public ArrayList<Empleado> buscarTodos() {
		return lista;
	}
	
	@Override
	public boolean modificarUno (Empleado empleado) {
		
		int i = lista.indexOf(empleado);
		if (i!=-1) {
			lista.set(i, empleado);
			return true; 
		}
		else
			return false;
	}
	
	@Override
	public boolean eliminarUno (int idEmpleado) {
		
		int i=lista.indexOf(new Empleado(idEmpleado, null, null, 'h', null, 0, 0, null, null));
		if (i!=-1) {
			lista.remove(i);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public ArrayList<Empleado> buscarPorSexo (char sexo) {
		
		ArrayList<Empleado> aux = new ArrayList<>(); 
		for (Empleado ele: lista) {
			if (ele.getGenero()==sexo)
				aux.add(ele);
		}
		return aux;
	}
	
	@Override
	public double masaSalarial () {
		double masaSalarial=0.0;
		for (Empleado ele: lista) {
			masaSalarial+=ele.getSalario();
		}
		return masaSalarial;
	}
	
	@Override
	public ArrayList<Empleado> buscarPorDepartamento (int idDepar) {
		
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado ele: lista) {
			
			if (ele.getDepartamento().getIdDepar()==idDepar)
				aux.add(ele);
		}
		
		return aux;
	}
	
	@Override
	public ArrayList<Empleado> buscarPorTrabajo (String idTrabajo) {
		
		ArrayList<Empleado> aux = new ArrayList<>();
		for (Empleado ele: lista) {
			
			if (ele.getTrabajo().getIdTrabajo().equalsIgnoreCase(idTrabajo)) {
				lista.add(ele);	
			}
		}
		
		return aux;
		
	}
	
	@Override
	public ArrayList<Empleado> buscarPorPais (String pais) {
		
		/*
		 * 1)Creo un ArrayList auxiliar para volcar los elementos que conicidan con el parametro-
		 * 2)Hago una busqueda medinte un for each y uso el metodo add de arraylist para insertar
		 *  en el arrayList los elementos coincidentes.
		 */
		ArrayList<Empleado> aux = new ArrayList<>();
		
		for (Empleado ele: lista) {
			
			if (ele.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais))
				lista.add(ele);		
		}
		
		return aux;
		
	}

}
