package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej04y05Sexo {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		char sexo= ' ';
		String aux;
		
		System.out.println("introduce sexo (h, H, m ó M): ");
		aux = leer.next();
		sexo = aux.charAt(0);
		
		if ((sexo=='h'||sexo=='H')&&aux.length()==1)
			System.out.println("Es hombre");
		else if ((sexo=='m'||sexo=='M')&&aux.length()==1)
			System.out.println("Es una mujer");
		else 
			System.out.println("Sexo tecleado erroneo");
		
		leer.close();
		
	}
}
