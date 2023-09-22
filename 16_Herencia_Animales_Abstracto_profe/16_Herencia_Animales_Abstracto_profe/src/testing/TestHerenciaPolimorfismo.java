package testing;

import java.util.ArrayList;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerenciaPolimorfismo {

	public static void main(String[] args) {
	 	Animal animal, gato, perro;
		
//		animal = new Animal(2, false, "calamar");
		gato = new Gato(4, true, "Botas", 3);
		perro = new Perro(4, true, "punchi", "callejero");
		
	//	animal.saludar();
		gato.saludar();
		perro.saludar();
	 
	 	ArrayList<Animal> animales = new ArrayList<>();
	//	animales.add(new Animal(2, false, "calamar"));
		animales.add(new Gato(4, true, "Botas", 3));
		animales.add(new Perro(4, true, "punchi", "callejero"));
		
		for (Animal ele: animales) {
			
			ele.sonido();
		}
		
		 
		Gato migato = (Gato)gato;
		System.out.println(migato.getVidas());
		
		
		System.out.println(((Gato)gato).getVidas());
		
		

	}

}
