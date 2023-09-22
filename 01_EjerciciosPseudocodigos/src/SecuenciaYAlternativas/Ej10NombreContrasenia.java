package SecuenciaYAlternativas;

import java.util.Scanner;

public class Ej10NombreContrasenia {
	
	public static void main (String[] args) {
	
		Scanner leer = new Scanner (System.in);
		String nombre = "", contraseña="";
		
		System.out.println("nombre: ");
		nombre=leer.next();
		
		if (nombre.equalsIgnoreCase("sara")) {
			
			System.out.println("contraseña: ");
			contraseña=leer.next();
			
			if (contraseña.equals("sarita"))
				
				System.out.println("usuario y contraseña correctas. Bienvenido");
			else
				System.out.println("contraseña incorrecta");	
		}
		
		else 
			System.out.println("usuario incorrecto.");
			
		leer.close();
		
	}

}
