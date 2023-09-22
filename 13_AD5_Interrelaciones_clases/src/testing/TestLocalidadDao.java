package testing;

import modelo.dao.LocalidadDao;
import modelo.dao.implList.LocalidadDaoImplList;
import modelo.javabeans.Localidad;

public class TestLocalidadDao {

	public static void main(String[] args) {

		LocalidadDao locDao = new LocalidadDaoImplList();
		
		System.out.println();
		System.out.println(locDao.buscarPorCiudad("Moscu"));
		

		for (Localidad ele: locDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println(locDao.eliminar(3));
		
		
		for (Localidad ele: locDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println(locDao.alta(new Localidad(5)));
		
		for (Localidad ele: locDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println();
		System.out.println(locDao.buscar(4));
		
		System.out.println();
		System.out.println(locDao.modificar(new Localidad(2)));
		
		for (Localidad ele: locDao.buscarTodos()) {
			System.out.println(ele);
		}
		

		
	}

}
