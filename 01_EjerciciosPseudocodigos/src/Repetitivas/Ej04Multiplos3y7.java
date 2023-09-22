package Repetitivas;

import java.util.Scanner;

public class Ej04Multiplos3y7 {
	
	public static void main (String [] args) {
		
		Scanner leer = new Scanner (System.in);
		int mul3=0, mul7=0, mul3y7=0, noMul=0;
		
		for (int i=1; i<=250 ; i++) {
			
			if (i%3==0&&i%7==0) {
				mul3y7++;
			System.out.println(i);
			}
			
			if (i%3==0)
				mul3++;
			
			if (i%7==0)
				mul7++;
			
			if (i%3!=0&&i%7!=0)
				noMul++;
		}
		
		System.out.println("Cuantos multiplos hay de 3 y 7: " + mul3y7);
		System.out.println("Multiplos de 3: " + mul3);
		System.out.println("Multiplos de 7: " + mul7);
		System.out.println("Ni multiplos de 3 ni de 7: " + noMul);
		
		leer.close();
		
	}

}
