package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej09OtroSwitch {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int a=0; int b=0;
		String opcion;
		
		System.out.println("introduce un numero A: ");
		a=leer.nextInt();
		System.out.println("introduce un numero B");
		b=leer.nextInt();
		System.out.println("Escoge: triangulo, rectangulo o circulo ");
		opcion=leer.next();
		
		switch (opcion.toLowerCase()) {
		
			case "triangulo":
				System.out.println("El area es " + (a*b/2));
				break;
			case "rectangulo":
				System.out.println("El perimetro es: " + (2*(a+b)));
				System.out.println("EL area es: " + (a*b));
				break;
			case "circulo":
				System.out.println("La circunferencia de radio A es: " + (2*Math.PI*a));
				System.out.println("El área del circulo de radio A es: " + (Math.PI*(Math.pow(a, 2))));
		
		}
		
		leer.close();
		
		
	}

}
