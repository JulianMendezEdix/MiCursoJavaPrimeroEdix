package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej03Circunferencia {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int radio=0;
		
		System.out.println("mete el radio: ");
		radio = leer.nextInt();
		
		System.out.println("La circunferencia es: " + (2*Math.PI*radio));
		System.out.println("El área del circulo es: " + (Math.PI*(Math.pow(radio, 2))));
		
		leer.close();
		
	}
	
	

}
