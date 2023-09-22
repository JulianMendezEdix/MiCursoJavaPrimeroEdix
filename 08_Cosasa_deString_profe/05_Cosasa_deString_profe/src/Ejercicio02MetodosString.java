
public class Ejercicio02MetodosString {

	public static void main(String[] args) {
	/*	String opcion = "alta";
		
		switch(opcion) {
		case "alta":
			System.out.println("en alta");
			break;
		case "editar":
			System.out.println("editando");
			break;
			default:
				System.out.println("opcion erronea");
			*/
		
		String nombre = "tomas";
	//	nombre = nombre.toUpperCase();
		System.out.println(nombre.toUpperCase());
		System.out.println("y ahora nombre esta : " + nombre);
		
		/*
		 * recorrer un String caracter a caracter
		 */
		for (int i=0; i < nombre.length(); i++)
			System.out.println(nombre.charAt(i));
		 
	
	/*
	 * recorrer al reves un String caracter a caracter
	 */
	
	for (int i=nombre.length()-1; i >= 0; i--)
		System.out.println(nombre.charAt(i));
	 
	System.out.println(nombre.charAt(1) == 'o');
	
	System.out.println(nombre.endsWith("as"));
	System.out.println(nombre.startsWith("ta"));
	System.out.println(nombre.substring(2));
	nombre = "";
	String nombre2 = null;
	System.out.println(nombre.isEmpty());
	//System.out.println(nombre.charAt(0));
	
	/*
	 * dar la vuelta a una cadena de caraccteres
	 */
	System.out.println("Dar la vuelta a una cedena");
	String cadena = "Hola me llamo esteban";
	String cadenaReverse = "";
	
	for (int i=cadena.length()-1; i >= 0; i--)
		cadenaReverse += cadena.charAt(i);
	
	System.out.println(cadenaReverse);
	}

	}


