import java.util.Scanner;

public class Ejercicio01UsuarioPassword {

	public static void main(String[] args) {
		/*
		 * pedir usuario por pantalla
		 * si es "sara" ponemos usuario correcto
		 * no es satra ponemos usuario incorrecta
		 */
		
		Scanner leer = new Scanner(System.in);
		String usuario = null;
		usuario = leer.next();
//		if (usuario == "sara")
		if (usuario.equals("sara"))
			System.out.println("usuario correcto");
		else
			System.out.println("usuario incorrecto");

	
	
	String nombre1 = "tomas";
	String nombre2 = "tomas";
	
//	if (nombre1 == nombre2)
	if (nombre1.equals(nombre2))
		System.out.println("son iguales");
	else
		System.out.println("son diferentes");
	 
	
	String nombre3 = new String("andres");
	String nombre4 = new String("andres");
	
//	if (nombre3 == nombre4)
	if (nombre3.equals(nombre4))
		System.out.println("son iguales en new");
	else
		System.out.println("son diferentes en new");
	}
	
}
