package modelo.dao.ImplList;

import java.util.ArrayList;

import modelo.dao.ClienteDao;
import modelo.javabean.Cliente;

public class ClienteDaoImplList implements ClienteDao {
	
	/* VAriables de objeto o instancia */
	
	private String nombre;
	private ArrayList<Cliente> lista;
	
	/* Constructor especial*/
	
	public ClienteDaoImplList (String nombre ){
		super();
		this.nombre = nombre;
		lista = new ArrayList<>();
		cargarDatos();		
	}
	
	private void cargarDatos() {
		OficinaDaoImplList odao = new OficinaDaoImplList("hola"); /* No tengo que importarla pq está en el mismo paqeuete*/
		lista.add(new Cliente("14628069T", "Julian", "Mendez Podadera", "Calle pez", "jj@jj.com", odao.buscarOficina(9001)));
		lista.add(new Cliente("14628070T", "Klaus", "Strauss Fujur", "calle agua", "jja@gmail.com", odao.buscarOficina(9002)));
	}
	
	public String getNombre () {
		return nombre;	
	}
	
	public void setNombre (String nombre) {		
		this.nombre=nombre;
	}
	
	/*Implementamos los métodos del Interface*/
	
	@Override
	public boolean alta (Cliente cliente) {
		
		if (lista.indexOf(cliente)==-1) {
			lista.add(cliente);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public Cliente buscar (String idCliente) {
		
		int i= lista.indexOf(new Cliente(idCliente, null, null, null, null, null));
		if (i!=-1)
			return lista.get(i);
		else
			return null;
		
	}
	
	@Override
	public ArrayList<Cliente> buscarTodos () {	
		return lista;
	}
	
	@Override
	public boolean modificar (Cliente cliente) {
		
		int i= lista.indexOf(cliente);
		if (i!=-1) {
			lista.set(i, cliente);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public boolean eliminar (String idCliente) {
		return lista.remove(new Cliente(idCliente, null, null, null, null, null));
	}
	
	@Override 
	public ArrayList<Cliente> buscarPorOficina (int idOficina){
		
		ArrayList<Cliente> aux = new ArrayList<>();
		for (Cliente ele: lista) {
			if (ele.getOficina().getIdOficina()==idOficina) {
				aux.add(ele);
			}	
		}		
		return aux;
	}
	
	
	
	
	
	
	
	
	

}
