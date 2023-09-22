package testing;

import javabeans.Persona;

public class TestPersonas {

	public static void main(String[] args) {
		Persona p1 = new Persona(1.76, 80);
		Persona p2 = new Persona(2, 180);
		
		System.out.println(p1.calcularImc());
		
		System.out.println(Persona.calcularImc(1.90, 100));
		
		System.out.println(p1.EMAIL_COMPANY);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p2.getNumeroPersona());

	}

}
