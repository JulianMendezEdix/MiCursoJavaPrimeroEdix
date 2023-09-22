package modelo.dao.implList;
import modelo.dao.DepartamentoDao;
import modelo.javabeans.Departamento;
import java.util.ArrayList;

public class DepartamentoDaoImplList implements DepartamentoDao{
	
	private ArrayList<Departamento> lista;
	
	public DepartamentoDaoImplList () {
		super();
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		
		LocalidadDaoImplList ldao = new LocalidadDaoImplList();
		
		lista.add(new Departamento(1, "Administracion", ldao.buscar(1)));
		lista.add(new Departamento(2, "RRHH", ldao.buscar(2)));
		lista.add(new Departamento(3, "Direccion", ldao.buscar(4)));
		lista.add(new Departamento(4, "IT", ldao.buscar(3)));

	}

	@Override
	public boolean alta(Departamento dep) {
		if (lista.indexOf(dep)==-1)
			return lista.add(dep);
		else
		return false;
		
	}

	@Override
	public Departamento buscar(int id) {
		
		int i = lista.indexOf(new Departamento(id));
		if (i!=-1)
			return lista.get(i);
		else
			return null;
	}

	@Override
	public ArrayList<Departamento> buscarTodos() {
		return lista;
	}

	@Override
	public boolean modificar(Departamento dep) {
	
		int i= lista.indexOf(dep);
		if (i!=-1) {
			lista.set(i, dep);
			return true;
		}
		else
			return false;	
	}

	@Override
	public boolean eliminar(int id) {
		int i = lista.indexOf(new Departamento(id));
		return lista.remove(lista.get(i));
	}

	@Override
	public ArrayList<Departamento> buscarPorCiudad(String ciudad) {
		ArrayList<Departamento> aux = new ArrayList<>();
		for (Departamento ele: lista) {
			
			if (ele.getLocalidad().getCiudad().equalsIgnoreCase(ciudad))
				aux.add(ele);			
		}
		return aux;
	}
	

}
