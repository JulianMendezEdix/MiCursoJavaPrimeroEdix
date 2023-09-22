package testing;

import modelo.dao.DepartamentoDao;
import modelo.dao.implList.DepartamentoDaoImplList;
import modelo.javabeans.Departamento;

public class TestDepartamentoDao {

	public static void main(String[] args) {
		
		DepartamentoDao depDao = new DepartamentoDaoImplList();
		
		System.out.println(depDao.alta(new Departamento(5)));
		
		for (Departamento ele: depDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println(depDao.eliminar(5));
		
		System.out.println();
		for (Departamento ele: depDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println();
		System.out.println(depDao.buscarPorCiudad("marbella"));
		
		System.out.println();
		System.out.println(depDao.modificar(new Departamento(2)));
		
		System.out.println();
		for (Departamento ele: depDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println();
		System.out.println(depDao.buscar(4));

	}

}
