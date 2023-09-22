package testing;

import modelo.dao.TrabajoDao;
import modelo.dao.implList.TrabajoDaoImplList;
import modelo.javabeans.Trabajo;

public class TestTrabajoDao {

	public static void main(String[] args) {

		TrabajoDao traDao = new TrabajoDaoImplList();
		
		System.out.println(traDao.alta(new Trabajo("5")));
		
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println(traDao.eliminar("3"));
		
		System.out.println();
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println();
		System.out.println(traDao.buscarPorMaxSalario(10_000));
		
		System.out.println();
		System.out.println(traDao.modificar(new Trabajo("2")));
		
		System.out.println();
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println();
		System.out.println(traDao.buscar("4"));
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		/*



		
		
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		

		
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		


		
		for (Trabajo ele: traDao.buscarTodos()) {
			System.out.println(ele);
		}
		*/

	}

}
