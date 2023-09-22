package modelo.dao.ImplList;

import modelo.javabean.Cuenta;
import java.util.ArrayList;
import modelo.dao.CuentaDao;

public class CuentaDaoImplList implements CuentaDao {
	
	private String nombre;
	private ArrayList<Cuenta> lista;
	
	/*Constructor Especial*/
	public CuentaDaoImplList (String nombre) {
		super();
		this.nombre=nombre;
		this.lista=new ArrayList<>(); /*El this no hace falta*/
		cargarDatos();
	}
	
	private void cargarDatos () {
		
		ClienteDaoImplList clidao = new ClienteDaoImplList("hola");
		lista.add(new Cuenta(1, "corriente", 20_000, clidao.buscar("14628069T")));
		lista.add(new Cuenta(2, "empresarial", 1_000, clidao.buscar("14628069T")));
		lista.add(new Cuenta(1, "juvenil", 20_000, clidao.buscar("14628070T")));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*Implemento CRUD*/
	
	@Override
	public boolean alta (Cuenta cuenta) {
		
		if (lista.indexOf(cuenta)==-1)
			return lista.add(cuenta);
		else
			return false;
	}
	
	@Override
	public Cuenta buscar (int id) {
		
		int i=lista.indexOf(new Cuenta(id));
		
		if (i!=-1)
			return lista.get(i);
		else
			return null;
	}
	
	@Override
	public ArrayList<Cuenta> buscarTodos () {	
		return lista;
	}
	
	@Override
	public boolean modificar (Cuenta cuenta) {
		
		int i=lista.indexOf(cuenta);
		if (i!=-1) {
			lista.set(i, cuenta);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public boolean eliminar (int id) {	
		return lista.remove(new Cuenta(id));
	}
	
	@Override
	public ArrayList<Cuenta> buscarPorTipo (String tipo) {
		ArrayList<Cuenta> aux = new ArrayList<>();
		for (Cuenta ele: lista) {
			if (ele.getTipoCuenta().equalsIgnoreCase(tipo))
				aux.add(ele);	
		}		
		return aux;
		
	}
	
	@Override
	public ArrayList<Cuenta> buscarPorCliente (String idCliente) {
		ArrayList<Cuenta> aux = new ArrayList<>();
		for (Cuenta ele: lista) {
			
			if (ele.getCliente().getIdCliente().equalsIgnoreCase(idCliente)) {
				aux.add(ele);
			}
		}
		return aux;
	}
	

}
