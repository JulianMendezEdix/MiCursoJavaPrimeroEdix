package modelo.dao.implList;

import modelo.javabeans.Localidad;
import java.util.ArrayList;
import modelo.dao.LocalidadDao;


public class LocalidadDaoImplList implements LocalidadDao {
	
	private ArrayList<Localidad> lista;
	
	/*Constructor especial*/
	
	public LocalidadDaoImplList () {
		super();
		lista=new ArrayList<>();
		cargarDatos();
		
	}
	
	private void cargarDatos () {
		
		lista.add(new Localidad(1, "calle agua", "Marbella", "España"));
		lista.add(new Localidad(2, "calle tierra", "Malaga", "España"));
		lista.add(new Localidad(3, "calle agua", "Londres", "Inglaterra"));
		lista.add(new Localidad(4, "calle tierra", "Moscu", "Rusia"));
	
	}

	@Override
	public boolean alta(Localidad localidad) {
		
		if (lista.indexOf(localidad)==-1)
			return lista.add(localidad);
		else
			return false;
	}

	@Override
	public Localidad buscar(int id) {
		
		int i = lista.indexOf(new Localidad(id));
		
		if (i!=-1)
			return lista.get(i);
		else
			return null; 
	}

	@Override
	public ArrayList<Localidad> buscarTodos() {
		return lista;
	}

	@Override
	public boolean modificar(Localidad localidad) {
		
		int i = lista.indexOf(localidad);
		if (i!=-1) {
			lista.set(i, localidad);
			return true;}
		else 
			return false;
	}

	@Override
	public boolean eliminar(int id) {
		
		int i=lista.indexOf(new Localidad(id));
		return lista.remove(lista.get(i));	
	}

	@Override
	public ArrayList<Localidad> buscarPorCiudad(String ciudad) {
		ArrayList<Localidad> aux = new ArrayList<>();
		for (Localidad ele: lista) {
			if (ele.getCiudad().equalsIgnoreCase(ciudad)) {
				aux.add(ele);
			}
		}
		return aux;
	}
	
	
	
	
	
	

}
