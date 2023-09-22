package testing;


import modelo.dao.CuentaDao;
import modelo.dao.ImplList.CuentaDaoImplList;
import modelo.javabean.Cuenta;

public class TestingAll {

	public static void main(String[] args) {

		CuentaDao cdao = new CuentaDaoImplList("hola");
		
		for(Cuenta ele: cdao.buscarPorCliente("14628069T")) 
		System.out.println(ele);
		
		System.out.println();
		
		for(Cuenta ele: cdao.buscarPorCliente("14628070T")) 
		System.out.println(ele);

	}

}
