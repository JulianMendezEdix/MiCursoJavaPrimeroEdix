package testing;

import modelo.dao.EmpleadoDao;
import modelo.dao.implList.EmpleadoDaoImplList;
import modelo.javabeans.Empleado;

public class TestingEmpleadoDao {

	public static void main(String[] args) {

		EmpleadoDao empDao = new EmpleadoDaoImplList("Plantilla");
		
		System.out.println(empDao.masaSalarial());
		
		for(Empleado ele: empDao.buscarPorSexo('h'))
				System.out.println(ele);
		System.out.println(" ");
		
		for(Empleado ele: empDao.buscarPorSexo('M'))
			System.out.println(ele);		
		
		System.out.println();
		
		for (Empleado ele: empDao.buscarPorPais(null))
				System.out.println(ele);
	}

}
