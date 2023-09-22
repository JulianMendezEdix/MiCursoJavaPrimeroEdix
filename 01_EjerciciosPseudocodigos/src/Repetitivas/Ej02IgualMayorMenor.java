package Repetitivas;

import java.util.Scanner;

public class Ej02IgualMayorMenor {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int a=0, b=0, igual=0, mayor=0, menor=0;
		
		while (a!=-1&&b!=-1) {
			
			System.out.println("Mete a:");
			a=leer.nextInt();
			System.out.println("Mete b:");
			b=leer.nextInt();
			
			if (a==b) {
				System.out.println("son iguales");
				igual++;
			}
			else if (a>b) {
				System.out.println("a es mayor que b");
				mayor++;
			}
			else {
				System.out.println("a es menor que b");
				menor++;
			}
		}
		
		System.out.println("Han sido iguales:" + igual + " veces");
		System.out.println("A ha sido mayor "+ mayor + " veces");
		System.out.println("A ha sido menor " + menor + " veces");
		
		leer.close();
		System.out.println("end");
	}
	

}
