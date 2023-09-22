package testing;

import modelo.dao.OficinaDao;
import modelo.dao.implMySql.OficinaDaoImplMySql8;
import modelo.javabean.Oficina;

public class TestOficinaDao {

	public static void main(String[] args) {	

		OficinaDao odao = new OficinaDaoImplMySql8();
		
		System.out.println(odao.modificar(new Oficina(10, "CARACOLA", "BORRADAAAAA", "aldklaksj", "askjladj")));
		
		for (Oficina ele: odao.buscarTodos())
		System.out.println(ele); 
		
		System.out.println(odao.eliminar(new Oficina(10, "CARACOLA", "alskdjladj", "aldklaksj", "askjladj")));
		
		for (Oficina ele: odao.buscarTodos())
		System.out.println(ele); 

		/*
		
		System.out.println(odao.buscarPorCiudad("MADRID"));
		for (Oficina ele: odao.buscarPorCiudad("MAdir")) {
			System.out.println(ele); 
		}
				

		
		System.out.println(odao.buscar(15));

		System.out.println();
			

		*/
	}

}
