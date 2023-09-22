package tenting;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;

public class testAsociacionFamilias {

	public static void main(String[] args) {
		Familia fam1 = new Familia(1, "Pantalones");
		
		Producto prod1 = new Producto(1, "Pantalon verde hombre t48", 125, fam1);
		  
		Producto prod2 = new Producto(2, "Falda vaquera mujer TXS", 70, 
				new Familia(2,"Faldas"));
		
		System.out.println(fam1);
		System.out.println(prod1.getFamilia().getDescripcion());
		System.out.println(prod2.getFamilia().getDescripcion());
		System.out.println(prod1); 
		
		fam1.setDescripcion("Pantalon");
		System.out.println(fam1);
		System.out.println(prod1.getFamilia().getDescripcion());
		
		prod1.getFamilia().setDescripcion("Pnatalonguer");
		System.out.println(fam1);
		System.out.println(prod1.getFamilia().getDescripcion());
		
		
		fam1.setDescripcion("PANTOLON");
		
		System.out.println("la variable fam1 : " + fam1);
		System.out.println("la familia del producto1 : " + prod1.getFamilia());
//		System.out.println("Descrip de la familia del prod 1: " + prod1.getFamilia().getDescripcion());
		
		System.out.println(prod1);
		
		
 
	}

}
