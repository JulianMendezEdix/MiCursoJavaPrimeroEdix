package SecuenciaYAlternativas;
import java.util.Scanner;

public class Ej01Operaciones {
	
	public static void main (String [] args) {
		
		Scanner leer = new Scanner (System.in);
		int a=0, b=0;
		
		System.out.println("Introduzca un numero entero, A: ");
		a = leer.nextInt();
		System.out.println("Introduzca otro numero entero, B: ");
		b = leer.nextInt();
		
		/* suma */
		System.out.println("A + B = " + (a+b));
		/* resta*/
		System.out.println("A - B = " + (a-b));
		/* producto */
		System.out.println("A * B = " + (a*b));
		/* division*/
		if (b!=0) {
			System.out.println("A / B = " + (a/b));
			System.out.println("A MOD B = " + (a%b));
			}
		else 
			System.out.println("A / B = Error (No se puede dividir por 0)");
			System.out.println("A % B = Error (No se puede dividir por 0)");
		/* módulo */
		leer.close();
		
		System.out.println("Programa finalizado.");
	}

}
