import java.util.Scanner;

/**
 * Crear dos Funciones y un Algoritmo que las usa:
La primera función devuelve el literal de sexo, por tanto, recibe un carácter, si el carácter es “H” o “h”, devolvemos “Hombre”; si es “M” o “m” devuelve “Mujer”; si recibe cualquier otra cosa devuelve “Sexo Erróneo”.
La segunda función, recibe un nuero Real que representa el salario de una persona , y devuelve un literal de acuerdo a las siguientes opciones:
Salario < de 25.000 : “Salario Bajo”.
Salario entre 25.000 y 40.000: “Salario Medio”.
Por encima de 45.000: “Salario Alto”
El Algoritmo: pide por consola el nombre, el sexo y el salario de una persona, y el algoritmo después de llamar a estas funciones informa de su situación.
Por ejemplo, si teclean “Tomás” H 30000, el algoritmo responderá:
Tomás
Hombre
Salario Medio
 */
public class Ej05FuncionesYAlgoritmo {
	
	private static Scanner leer;
	
	static {
		
		leer = new Scanner (System.in);
	}
	
	public static void main (String [] args) {
		
		String nombre, sexoAux;
		char sexo;
		float salario;
		
		System.out.println("Mete el nombre:");
		nombre=leer.next();
		
		System.out.println("Mete el sexo (H,h,M,m):");
		sexoAux=leer.next();
		while (sexoAux.length()>1) {
			System.out.println("sexo erroneo");
			System.out.println("Mete el sexo:");
			sexoAux=leer.next();
		}
		sexo=sexoAux.charAt(0);
		
		System.out.println("Mete el salario:");
		salario=leer.nextFloat();
		
		System.out.println(nombre);
		System.out.println(sexo(sexo));
		System.out.println(salario(salario));
		
	}
	
	public static String sexo (char sexo) {
		
		String aux;
		
		switch (sexo) {
		
		case 'h','H':
			aux="Hombre";
		break;
		case 'm','M':
			aux="Mujer";
		break;
		default:
			aux="Sexo erróneo";
			break;
		}
		
		return aux;
		
	}
	
	public static String salario (float salario) {
		
		if (salario<25000)
			return "Salario bajo";
		else
			if (salario>25000&&salario<40000)
				return "Salario medio";
			else
				return "Salario alto";
	}

}
