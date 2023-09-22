
import java.io.FileNotFoundException;
import java.io.FileReader;

	public class ExcComprobada {
		public static void main(String args[]) {
			try {
				FileReader fichero = new FileReader("c:/datos.txt");
				System.out.println("El fichero ha sido abierto");
			} catch (FileNotFoundException e) {
				System.out.println("Error al abrir el fichero");
				System.out.println(e.getMessage());
			}

		}
	}
