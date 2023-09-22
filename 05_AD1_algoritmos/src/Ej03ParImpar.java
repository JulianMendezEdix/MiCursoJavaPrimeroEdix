
import java.util.Scanner;

/*
 * Leer números, de uno en uno, hasta que se introduzca un 0. Para cada uno indicar si es par o impar. 
 * Al final del proceso Escribir, cuantos números pares hemos leído, cuantos números impares, 
 * cuanto suman los pares y cuanto suman los impares.
 */
public class Ej03ParImpar {
	
	/*
	 * Declaro la variable leer como variable de clase privada y estática.
	 */
	private static Scanner leer;

	static  {
		leer = new Scanner (System.in);
	}

	public static void main(String[] args) {
		
		int num, pares=0, impares=0, sumaPares=0, sumaImpares=0;
		
		System.out.println("mete un numero");
		
		num=leer.nextInt();
		
		while (num!=0) {
			
			if (num%2==0) {
				System.out.println("es par");
				pares++;
				sumaPares+=num;
			}
				
			else {
				System.out.println("es impar");
				impares++;
				sumaImpares+=num;
			}
			System.out.println("mete un numero");
			num=leer.nextInt();
		}
		
		System.out.println("pares: " + pares);
		System.out.println("impares: " + impares);
		System.out.println("sumaPares: "+ sumaPares);
		System.out.println("sumaImpares: " + sumaImpares);

	}

}
