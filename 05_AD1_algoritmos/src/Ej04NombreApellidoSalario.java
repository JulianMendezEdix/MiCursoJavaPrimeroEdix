
import java.util.Scanner;
/*
 * Pedir por consola el nombre, el apellido y el salario de una persona. Sacar un menú de opciones, 
 * el proceso termina cuando me escriben la opción 5:
Nombre completo
Salario Mensual (12 pagas)
Nombre en mayúsculas
Cuantas letras tiene mi nombre
Salir
 */

public class Ej04NombreApellidoSalario {
	
	private static Scanner leer;
	static {
		leer=new Scanner (System.in);
	}

	public static void main(String[] args) {
		
		String nombre, apellido;
		int salario;
		int opcion;
		
		System.out.println("teclea un nombre: ");
		nombre=leer.next();
		System.out.println("teclea apellido: ");
		apellido=leer.next();
		System.out.println("teclea el salario: ");
		salario=leer.nextInt();
		
		opcion = pintarMenu();
		
		while (opcion!=5) {
		
			switch (opcion) {
			
				case 1:
					nombreCompleto(nombre, apellido);
					break;
				case 2:
					salarioMensual(salario);
					break;
				case 3:
					nombreMayusculas(nombre);
					break;
				case 4:
					letrasNombre(nombre);
					break;	
			}
			
			opcion = pintarMenu();
					
		}
		
	}
	
	public static int pintarMenu () {
		
		int opcion;
		System.out.println("1:nombre completo");
		System.out.println("2:salario mensual");
		System.out.println("3:nombre en mayúsculas");
		System.out.println("4: Cuantas letras tiene el nombre");
		System.out.println("5:salir");
		
		System.out.println("teclea una opcion");
		opcion=leer.nextInt();
		
		while (opcion<1||opcion>5) {
			System.out.println("opcion erronea. Intentalo de nuevo");
			opcion=leer.nextInt();
		}
		return opcion;		
	}
	
	public static void nombreCompleto (String nombre, String apellido) {
		
		System.out.println(nombre + "" +  apellido);
		
	}
	
	public static void salarioMensual (int salario) {
		
		System.out.println("Salario mensual: " + (salario/12));
		
	}
	
	public static void nombreMayusculas (String nombre) {
		
		System.out.println("Nombre Mayusculas: " + nombre.toUpperCase());
		
	}
	
	public static void letrasNombre (String nombre) {
		
		System.out.println("letras del nombre: " + nombre.length());
		
	}

}
