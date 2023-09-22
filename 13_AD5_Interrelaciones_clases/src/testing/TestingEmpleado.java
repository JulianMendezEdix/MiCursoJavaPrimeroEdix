package testing;

import modelo.javabeans.*;
import java.util.Scanner;

public class TestingEmpleado {
	
	public static Scanner leer;
	static {
		leer = new Scanner (System.in);
	}
	
	public static void main (String[] args) {
		
		Localidad loc1 = new Localidad(1, "Calle Luna 2", "Londres", "UK");
		Departamento dep1 = new Departamento(1, "COMERCIAL", loc1);
		Trabajo tra1 = new Trabajo("1", "Medico", 20_000.0, 60_000.0);
		Empleado emp1 = new Empleado(1, "Julian", "Mendez Podadera", 'H', "julian@gmail.com", 20_000, 5_000, tra1, dep1);
		
		System.out.println(emp1.getNombre());
		System.out.println(emp1.getApellidos());
		System.out.println(emp1.getGenero());
		System.out.println(emp1.getDepartamento().getDescripcion());
		System.out.println(emp1.getTrabajo().getDescripcion());
		System.out.println(emp1.getDepartamento().getLocalidad().getDireccion());
		System.out.println(emp1.getDepartamento().getLocalidad().getCiudad());
		System.out.println(emp1.getDepartamento().getLocalidad().getPais());
		
		Trabajo tra2 = emp1.getTrabajo();
		System.out.println(tra1);
		System.out.println(tra2);
		
		Departamento dep2 = emp1.getDepartamento();
		System.out.println(dep1);
		System.out.println(dep2);
		
	}
	
	

}