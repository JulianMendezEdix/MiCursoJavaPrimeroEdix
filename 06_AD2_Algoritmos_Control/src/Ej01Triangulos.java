import java.util.Scanner;

/**
 * Para que tres números enteros den un triángulo válido, se tiene que dar la circunstancia de que la suma de 
 * dos cualquiera de los tiene que ser mayor que la del otro. Por tanto, el ejercicio consta de:
Pedir tres números por consola, e informar si el triángulo es correcto, o no es correcto.
Y si es correcto además decir si es:
Equilátero: los tres lados iguales.
Isósceles: dos iguales y uno desigual
Escaleno: los tres lados distintos
 */
public class Ej01Triangulos {
	
	private static Scanner leer;
	
	static {
		leer = new Scanner (System.in);
	}
	
	public static void main (String[] args) {
		
		boolean esValido;
		int a,b,c;
		
		System.out.println("Mete el lado a: ");
		a=leer.nextInt();
		System.out.println("Mete el lado b: ");
		b=leer.nextInt();
		System.out.println("mete el lado c: ");
		c=leer.nextInt();
		
		if ((a+b)>c&&(a+c)>b&&(b+c)>a)
			esValido=true;
		else
			esValido=false;
		System.out.println("¿Es valido?: " + esValido);
		
		if (esValido) {
			
			if (a==b&&a==c)
				System.out.println("equilatero");
			else
				if (a!=b&&b!=c&&a!=c)
					System.out.println("escaleno");
				else
					System.out.println("isosceles");	
		}
		
	}
	
	

}
