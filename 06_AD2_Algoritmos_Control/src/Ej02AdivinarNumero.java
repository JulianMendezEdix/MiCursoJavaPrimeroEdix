import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número. Para ello pedir un número N aleatorio de 1 a 40, 
 * y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
 * El proceso termina cuando el usuario acierta. Y escribimos la cantidad de intentos antes del número exacto.
 */
public class Ej02AdivinarNumero {
	
	private static Scanner leer;
	
	static {
		
		leer = new Scanner (System.in);
		
	}
	
	public static void main (String[] args) {
		
		int n, x, contador=0;
		

		n=(int)(Math.random()*40+1);
		
		System.out.println(n);
		
		System.out.println("A ver si aciertas el numero de 1 a 40: ");
		x=leer.nextInt();
		
		
		while (x!=n) {
			
			
			if (x>n)
				System.out.println("Es mayor que n");
			else
				System.out.println("Es menor que n");
			
			contador++;
			
			System.out.println("prueba otra vez:");
			x=leer.nextInt();

			
		}
		
		System.out.println("has acertado");
		System.out.println("n de intentos: " + contador);
	}
	
	

}
