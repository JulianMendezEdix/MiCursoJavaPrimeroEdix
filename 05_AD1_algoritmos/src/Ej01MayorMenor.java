
import java.util.Scanner;

public class Ej01MayorMenor {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int a, b, c, mayor=0, medio=0, menor=0;
		
		System.out.println("Mete 3 numeros: ");
		a=leer.nextInt();
		b=leer.nextInt();
		c=leer.nextInt();
		
		if (a>=b&&a>=c) 
			if (b>=c) {
				mayor=a;medio=b;menor=c;
			}
			else {
				mayor=a;medio=c;menor=b;
			}
		else 
			if (b>=a&&b>=c)
				if (a>=c) {
					mayor=b;medio=a;menor=c;
				}
				else {
					mayor=b;medio=c;menor=a;
				}
			else
				if (c>=a&&c>=b)
					if (a>=b) {
						mayor=c;medio=a;menor=b;
					}
					else {
						mayor=c;medio=b;menor=a;
					}

		System.out.println("ahi va: ");
		System.out.println(mayor);
		System.out.println(medio);
		System.out.println(menor);
		
		leer.close();
		
	}
	
	

}
