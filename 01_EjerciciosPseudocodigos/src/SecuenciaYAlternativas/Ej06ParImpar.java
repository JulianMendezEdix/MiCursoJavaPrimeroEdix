package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej06ParImpar {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num=0;
	
		System.out.println("Mete un numero: ");
		num = leer.nextInt();
		
		if (num%2==0)
			System.out.println("es par.");
		else
			System.out.println("es impar.");
		
		leer.close();
		
	}

}
