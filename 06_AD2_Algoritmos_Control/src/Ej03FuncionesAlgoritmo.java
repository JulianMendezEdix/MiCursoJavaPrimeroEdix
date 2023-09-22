
import java.util.Scanner;

public class Ej03FuncionesAlgoritmo {
	
	private static Scanner leer;
	
	static {
		
		leer = new Scanner (System.in);
	}
	
	public static void main (String[] args) {
		
		String nombre="";
		float salario=0;
		char sexo=' ';
		int contador=0, sumaSalario=0;
		
		System.out.println("Mete un nombre: ");
		nombre=leer.next();
		
		while (!nombre.equalsIgnoreCase("fin")){
			
			System.out.println("mete el sexo:");
			sexo=leer.next().charAt(0);
			System.out.println("mete el salario: ");
			salario=leer.nextFloat();
			
			System.out.println(nombre);
			System.out.println(salario(salario));
			System.out.println(sexo(sexo));
			
			contador++;
			sumaSalario+=salario;
			
			System.out.println("Mete otro nombre: ");
			nombre=leer.next();
		}
		
		System.out.println("nombres: " + contador);
		System.out.println("sumaSalarios: "+ sumaSalario);
		System.out.println("mediaSalarios: "+ (sumaSalario/contador));
		
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
