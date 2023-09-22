
	import java.io.File;
	import java.io.IOException;

	public class DirWindows {
	 public static void main(String args[]) throws IOException {
	  File carp = new File("C:\\windows");
	   if (carp.exists()) {
	    System.out.println("Existe la carpeta");
	    System.out.println("¿Tiene permisos de escritura? " + carp.canWrite());
	    String[] contenido = carp.list();
	    System.out.println("Archivos o carpetas que contiene: " + contenido.length);
	     for (String nombre : contenido) {
	      File f = new File(carp.getPath(), nombre);
	       if (f.isDirectory()) {
	        System.out.println(nombre + ", " + " carpeta");
	       }
	       else {
	        System.out.println(nombre + ", " + " fichero, " + f.length() + " bytes");
	       }
	     }
	   }
	       else
	        System.out.println("No existe la carpeta");
	        }
	}

