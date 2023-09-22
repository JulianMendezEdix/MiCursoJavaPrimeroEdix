package SecuenciaYAlternativas;
import java.util.Scanner;

public class Ej02Rectangulo {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int a=0, b=0;
		
		System.out.println("Mete un lado:");
		a=leer.nextInt();
		System.out.println("Mete otro lado:");
		b=leer.nextInt();
		System.out.println("El perimetro es: " + 2*(a+b));
		System.out.println("El area es: " + (a*b));
		System.out.println("La hipotenusa es: " + Math.hypot(a, b));
		System.out.println("La hipotenusa es: " + Math.sqrt((Math.pow(a, 2))+ Math.pow(b, 2)));
		
		leer.close();
		
	}

}
