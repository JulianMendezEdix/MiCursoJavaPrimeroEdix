package Repetitivas;

import java.util.Scanner;

public class Ej03Multiplos2y3 {

	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int mul2=0, mul3=0, contador=0;
		
		for (int i=100; i>0; i--) {
			
			System.out.println(i);
			contador++;
			
			if (i%2==0)
				mul2++;
			if (i%3==0)
				mul3++;
			
		}
		
		System.out.println("He leido: " + contador + " numeros");
		System.out.println("He ledio: " + mul2 + " multiplos de 2");
		System.out.println("He ledio: " + mul3 + " multiplos de 3");
		
		leer.close();
	}
}
