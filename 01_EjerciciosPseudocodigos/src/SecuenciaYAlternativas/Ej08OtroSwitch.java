package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej08OtroSwitch {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int a=0, b=0;
		String opcion;
		
		System.out.println("introduce un numero A: ");
		a=leer.nextInt();
		System.out.println("introduce un numero B");
		b=leer.nextInt();
		System.out.println("¿Que quieres hacer (sumar, restar, multiplicar, dividir, resto): ");
		opcion=leer.next();
		
		switch (opcion.toLowerCase()) {
		
			case "sumar":
				System.out.println("la suma es: " + (a+b));
				break;
			case "restar":
				System.out.println("la resta es: " + (a-b));
				break;
			case "multiplicar":
				System.out.println("el producto es: " + (a*b));
				break;
			case "dividir":
				if (b!=0)
					System.out.println("la division es: " + (a/b));
				else
					System.out.println("no se puede dividir por 0");
				break;
			case "resto":
				if (b!=0)
					System.out.println("el resto es: " + (a%b));
				else
					System.out.println("no se puede dividir por 0");
				break;
			default:
				System.out.println("opcion erronea");
		}
		System.out.println("programa finalziado");
		leer.close();	
	}
}
