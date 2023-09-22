package Repetitivas;

import java.util.Scanner;

public class Ej01LeerNumeros {
	
	static Scanner leer;
	static {
		leer = new Scanner (System.in);
	}
	
	public static void main (String[] args) {
		

		
		

		int contador=0, suma=0;
		int num;
		
		System.out.println("mete un numero:");
		num = leer.nextInt();
		
		while (num!=0) {
			
			contador++;
			suma+=num;
			System.out.println("mete un numero:");
			num = leer.nextInt();
			
		}
		
		System.out.println("Numeros leidos: " + contador);
		System.out.println("Suma de  numeros leidos: " + suma);
		if (contador!=0)
			System.out.println("Media: " + (suma/contador));
		else 
			System.out.println("La media no se puede calcular");
		System.out.println("programa finalizado");
		
		leer.close();
		
		
	}

}
