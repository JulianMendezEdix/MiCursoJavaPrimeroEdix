package testing;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;
import modelo.javabean.Oficina;

public class TestAsociacion {

	public static void main(String[] args) {
		Oficina of1 = new Oficina(9282, "Madrid2", "calle del pez,3, madrid", "madrid", "914167899");
		Cliente cli1 = new Cliente("72345665B", "Angel", "Uria benitez", "madrid", "ab@ii.es", of1);
		
		Cuenta cuenta1 = new Cuenta(1000, "ahorro", 2000, cli1);
		Cuenta cuenta2 = new Cuenta(2000, "corriente", 4000, new Cliente("88776655A", "Sara", "Perez Alvarez", "sevilla", "sara@ee.es", of1));

		/*
		 * desde cuenta 2 vamos a sacar: el codigo cuenta, saldo, el nombre del titular cuenta, apellido del cliente , telefono de la oficina
		 */
		
		System.out.println("codigo cuenta y salado : " + cuenta2.getIdCuenta() + " - "+ cuenta2.getSaldo()  );
		System.out.println("apellido del cliente : " + cuenta2.getCliente().getAplellidos());
		System.out.println("telefono oficina cliente de la cuenta 2 : " + cuenta2.getCliente().getOficina().getTelefono());
		
	
	}

}
