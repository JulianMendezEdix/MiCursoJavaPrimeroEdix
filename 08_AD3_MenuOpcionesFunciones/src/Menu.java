
import java.util.Scanner;

public class Menu {
	
	private static Scanner leer;
	
	static {
		
		leer = new Scanner (System.in);
		
	}
	
	public static void main (String[] args) {
		
		int opcion;
		
		opcion = pintarMenu();
		
		while(opcion!=4) {
			
			switch (opcion) {
				
				case 1:
					conversor();
					break;
				case 2:
					calculadora();
					break;
				case 3:
					analizadorFrase();
					break;	
			}
			opcion = pintarMenu();
		}
		
		System.out.println("ADIOS");

	}
	
	public static int pintarMenu () {
		
		int opcion=0;
		
		while (opcion<1||opcion>5) {
			
			System.out.println("****** MENU ******");
			System.out.println("------------------");
			System.out.println("1. conversor decimal binario");
			System.out.println("2. Calaculadora");
			System.out.println("3. Analizador de frase");
			System.out.println("4. Salir");
			System.out.println("");
			System.out.println("Introduce una opción: ");
			
			opcion=leer.nextInt();
			
		}
		
		return opcion;
		
	}
	
	public static void analizadorFrase () {
		
		String palabra;
		String vocales="", consonantes="";
		char letra;
		
		System.out.println("mete una palabra: ");
		palabra=leer.next();
		
		System.out.println("palabra: " + palabra);
		
		
		for (int i=0; i<palabra.length();i++) {
			
			letra=palabra.charAt(i);
			
			switch (palabra.charAt(i)) {
			
			case 'a','e', 'i','o','u':
				vocales+=letra;
				break;
			default:
				consonantes+=letra;
			}
		}
		
		System.out.println("vocales: " + vocales);
		System.out.println("consonantes: " + consonantes);
		
	}
	
	public static void conversor () {
		
		int a;
		System.out.println("mete el numero: ");
		a=leer.nextInt();
		System.out.println("en binario es:" + Integer.toBinaryString(a));
		
	}
	
	public static void calculadora () {
		
		float a, b;
		String opcion;
		
		System.out.println("mete a: ");
		a=leer.nextFloat();
		System.out.println("mete b: ");
		b=leer.nextFloat();
		System.out.println("mete operación (+,-,*,/,%");
		opcion=leer.next();
		
		switch (opcion) {
		
			case "+":
				System.out.println("suma: " + (a+b));
				break;
			case "-":
				System.out.println("resta: " + (a-b));
				break;
			case "*":
				System.out.println("multi: " + (a*b));
				break;
			case "/":
				System.out.println("divi: " + (a/b));
				break;
			case "%":
				System.out.println("modulo: " + (a%b));
				break;
			default:
				System.out.println("opcion erronea");
	
		}
		
	}

}
