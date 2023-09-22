import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) {
		
		// Creación de 3 objetos producto
		Producto p1 = new Producto("Manzanas Royal Gala",2.50f,7f);
		Producto p2 = new Producto("Dátiles de la tía Julita",3.25f,12f);
		Producto p3 = new Producto("Mandarinas Clementinas",2.20f,25f);
		
		FileOutputStream fichero;
		DataOutputStream  escritor;
		
		// Apertura del fichero almacen.dat
		try {
			fichero = new FileOutputStream("almacen.dat", false);
			escritor = new DataOutputStream (fichero);
		} catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero almacen.dat");
			System.out.println(e.getMessage());
			return;
		}
		
		// Escribir datos en el fichero almacen.dat
		try {
			escritor.writeUTF(p1.getNombre());
			escritor.writeFloat(p1.getPrecio());
			escritor.writeFloat(p1.getUnidadesEnExistencia());
					
			escritor.writeUTF(p2.getNombre());
			escritor.writeFloat(p2.getPrecio());
			escritor.writeFloat(p2.getUnidadesEnExistencia());
					
			escritor.writeUTF(p3.getNombre());
			escritor.writeFloat(p3.getPrecio());
			escritor.writeFloat(p3.getUnidadesEnExistencia());
					
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al escribir datos en el fichero");
			System.out.println(e.getMessage());
		}
		
		try {
			escritor.close();
			fichero.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al cerrar el fichero");
			System.out.println(e.getMessage());			
		}
	}
}