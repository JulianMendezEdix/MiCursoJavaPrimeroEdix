package testingjdbc;

import java.sql.Date;

import modelo.daojdbc.ClienteDao;
import modelo.daojdbc.ClienteDaoImplMy8;
import modelo.daojdbc.CuentaDao;
import modelo.daojdbc.CuentaDaoImplMy8;
import modelo.javabean.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		ClienteDao cdao = new ClienteDaoImplMy8();
		CuentaDao cudao = new CuentaDaoImplMy8();
		/*
	 	Cuenta cuenta = new Cuenta(1005, "juvenil", 6000, 
				cdao.buscarUno("12222222A"), 
 				new Date(new java.util.Date().getTime()))
				new Date(System.currentTimeMillis()));
		
	 	System.out.println(cudao.alta(cuenta));
		Cuenta c1005 = cudao.buscarUno(1005);
		System.out.println(c1005);
		System.out.println(c1005.getCliente().getOficina().getDireccion());
		
		System.out.println();
		*/
		System.out.println("TODOS");
		for (Cuenta ele: cudao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("POR CLIENTE");
		for (Cuenta ele: cudao.buscarPorClientes("13333333A"))
			System.out.println(ele);
		
		System.out.println("POR PREFIJO IDCLIENTE");
		for (Cuenta ele: cudao.buscarPorClientesPrefijo("111"))
			System.out.println(ele);
		
		System.out.println("suma saldos");
		System.out.println(cudao.sumaSaldos());
	/*	
	 	System.out.println(cudao.diasEntreHoyFechaAlta(1005));
		
	 	Cuenta cuenta = cudao.buscarUno(1005);
		
		cuenta.setSaldo(7000);
		cuenta.getCliente().setIdCliente("11111111A");
		System.out.println(cudao.modificarCuenta(cuenta));
		System.out.println(cudao.buscarUno(1005));
		 
		
	 	System.out.println(cudao.eliminarCuenta(1005));
		
	 	Cuenta cuenta =cudao.buscarUno(1004);
	 	System.out.println(cuenta.getCliente().getOficina().getCiudad());
	*/	
		
	}

}
