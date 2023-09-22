import java.util.Scanner;

/*
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */

public class Ej02Calificaciones {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int nota;
		
		System.out.println("Mete la nota: ");
		nota=leer.nextInt();
		
		switch (nota) {
		
			case 0,1,2,3,4:
				System.out.println("insuficiente");
				break;
			case 5:
				System.out.println("suficiente");
			break;
			case 6:
				System.out.println("bien");
				break;
			case 7,8:
				System.out.println("notable");
				break;
			case 9,10:
				System.out.println("sobresaleinte");
				break;
		}
		
		leer.close();
		
		
		
	}

}
