package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej07MiniMenu {
	
	public static void main (String[] args) {
		
		
		Scanner leer = new Scanner (System.in);
		int num=0;
		
		System.out.println("mete un numero: ");
		num = leer.nextInt();
		
		switch (num) {
		
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			default:
				System.out.println("otro numero");
		}
		
		leer.close();
		
	}
	
	

}
