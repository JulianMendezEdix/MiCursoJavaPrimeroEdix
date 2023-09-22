package testing;

import modelo.dao.*;
import modelo.dao.implMySql.*;
import modelo.javabean.*;
public class TestClienteDao {

	public static void main(String[] args) {
		
		ClienteDao cdao = new ClienteDaoImplMySql8 ();
		OficinaDao odao = new OficinaDaoImplMySql8 ();
	


		for (Cliente ele: cdao.buscarPorOficina(2)) {
			System.out.println(ele);}
		
		
		/* 
		 * 	
		 * 		
		Oficina of1=odao.buscar(1);
		System.out.println(cdao.alta(new Cliente("1","Julian","Mendez","calle agua", "jj@gmail.com", of1)));	
		

		*/
		
			
		
	}

}
