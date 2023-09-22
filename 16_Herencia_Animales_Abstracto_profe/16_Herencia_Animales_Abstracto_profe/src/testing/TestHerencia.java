package testing;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerencia {

	public static void main(String[] args) {
	//	Animal animal1 = new Animal(4, true, "Animal a secas");
		
	//	animal1.saludar();
		
		Gato gato1 = new Gato(4, true, "Con Botas", 7);
		
		gato1.saludar();
		gato1.sonido();
		gato1.medioLocomocion();
		
		Perro perro1 = new Perro(4, true, "punchi", "callejero");
		
		perro1.saludar();
		perro1.sonido();
		perro1.medioLocomocion();
		

	}

}
