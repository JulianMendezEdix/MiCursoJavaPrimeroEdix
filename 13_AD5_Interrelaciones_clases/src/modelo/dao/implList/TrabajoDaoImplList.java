package modelo.dao.implList;
import java.util.ArrayList;
import modelo.javabeans.Trabajo;
import modelo.dao.*;

public class TrabajoDaoImplList implements TrabajoDao{
	
	ArrayList <Trabajo> lista;
	
	/*Constrctor especial*/
	
	public TrabajoDaoImplList () {
		super();
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos () {
		lista.add(new Trabajo("1", "Panadero", 10_000, 20_000));
		lista.add(new Trabajo("2", "mecanico", 5_000, 15_000));
		lista.add(new Trabajo("3", "fontanero", 12_000, 25_000));
		lista.add(new Trabajo("4", "mecenas", 7_000, 10_000));
	}

	
	/*Implemnto metodos del interface*/
	
	
	@Override
	public boolean alta(Trabajo trabajo) {
		if (lista.indexOf(trabajo)==-1)
			return lista.add(trabajo);
		else
			return false;
	}

	@Override
	public Trabajo buscar(String id) {

		int i = lista.indexOf(new Trabajo(id));
		if (i!=-1)
			return lista.get(i);
		else
			return null;
	}

	@Override
	public ArrayList<Trabajo> buscarTodos() {
		return lista;
	}

	@Override
	public boolean modificar(Trabajo trabajo) {
		
		int i = lista.indexOf(trabajo);
		if (i!=-1) {
			lista.set(i, trabajo);
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean eliminar(String idTrabajo) {
		int i = lista.indexOf(new Trabajo (idTrabajo));
		return lista.remove(lista.get(i));
	}

	@Override
	public ArrayList<Trabajo> buscarPorMaxSalario(double MaxSalario) {
		
		ArrayList<Trabajo> aux = new ArrayList<>();
		
		for (Trabajo ele: lista) {
			if (ele.getMaxSalario()==MaxSalario)
				aux.add(ele);
		}
		
		return aux;
	}
	

	
	
	
	

}
