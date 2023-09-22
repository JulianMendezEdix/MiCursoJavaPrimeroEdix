package modelo.dao.ImplList;

import modelo.dao.OficinaDao;
import modelo.javabean.Oficina;
import java.util.ArrayList;

public class OficinaDaoImplList implements OficinaDao {
	
	private String nombre;
	private ArrayList <Oficina> lista;
	
	/*
	 * Vamoa a hacerun CONSTRUCTOR que va a hacer 3 cosas:
	 * 1. nombrar el objeto
	 * 2. Arrancar la lista del objeto con el metodo constructor de ArrayList; 
	 * 3. LLamar a un método propio y privado de la clases que cargará una serie de registros en el array;
	 *    este metodo tenemos que crearlo obviamente. cargarDAtos();
	 */
	
	
	public OficinaDaoImplList (String nombre) {
		super();
		this.nombre=nombre;
		lista = new ArrayList<>();
		cargarDatos();
		
	}
	
	private void cargarDatos () {
		lista.add(new Oficina(9001, "Madrid 1", "calle gato", "Madrid", "912030332"));
		lista.add(new Oficina(9002, "Madrid 2", "calle pez", "Madrid", "912030332"));
		lista.add(new Oficina(9003, "Guadalajara 1", "calle morsa", "guadalajara", "949030332"));
		lista.add(new Oficina(9004, "Guadalajara 2", "calle agua", "guadalajara", "949030332"));
		
	};
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	/*
	 * REDEFINO LOS MÉTODOS DE BANCODAO
	 */
	
	@Override
	public boolean altaOficina (Oficina oficina) {
		if (lista.contains(oficina))
			return false;
		else {
			lista.add(oficina);
			return true;
		}
	}
	;
	@Override
	public boolean eliminarOficina (Oficina oficina) {
		return lista.remove(oficina);
	}
	
	@Override
	public Oficina modificarOficina (Oficina oficina) {
		int i;
		i=lista.indexOf(oficina);
		if (i!=-1)
			return lista.set(i, oficina); 
		else
			System.out.println("Oficina no existe");
			return null;		
	}
	
	@Override
	public Oficina buscarOficina (int idOficina) {
		int i;
		i=lista.indexOf(new Oficina(idOficina, null, null, null, null));
		if (i!=-1)
			return lista.get(i);
		else
			return null;
	}
	
	@Override
	public ArrayList <Oficina> buscarTodos () {
		return lista;
	}
	
	@Override
	public ArrayList <Oficina> buscarPorPrefijo (String prefijo) {
		
		ArrayList<Oficina> aux = new ArrayList<>();
		for(Oficina ele: lista) {
			if (ele.getTelefono().substring(0, 2).equals(prefijo)) {
				aux.add(ele);
			}
		}
		
		return aux;
	}
	
	@Override
	public ArrayList<Oficina> buscarPorCiudad (String ciudad) {
		
		ArrayList<Oficina> aux = new ArrayList<>();
		
		for (Oficina ele: lista) {
			
			if (ele.getCiudad().equalsIgnoreCase(ciudad))
				aux.add(ele);
			
		}
			
		
		return null;
	}
	
}
