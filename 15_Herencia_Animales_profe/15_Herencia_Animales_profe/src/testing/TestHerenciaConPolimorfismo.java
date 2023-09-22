package testing;

import java.util.ArrayList;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerenciaConPolimorfismo {

	public static void main(String[] args) {
		Animal animal1 = new Animal(4, true, "Animal a secas");
		Gato gato1 = new Gato(4, true, "Con Botas", 7);
		Perro perro1 = new Perro(4, true, "punchi", "callejero");
		
		Animal animal2, gato2, perro2;
		
		animal2 = new Animal(2, false, "calamar");
		gato2 = new Gato(4, true, "Felix", 3);
		perro2 = new Perro(4, true, "gancho", "cazador");
		
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(perro1);
		zoo.add(animal1);
		zoo.add(gato1);
		zoo.add(animal2);
		zoo.add(perro2);
		zoo.add(gato2);
		
		for (Animal animal: zoo) {
			
			animal.sonido();
			
			if (animal instanceof Gato) {
				System.out.println( ((Gato)animal).getVidas());
			}else if (animal instanceof Perro) {
				System.out.println(((Perro)animal).getRaza());
			}
		}
		
		Gato miGato = (Gato)gato2;
		
		
		
		

	}

}
