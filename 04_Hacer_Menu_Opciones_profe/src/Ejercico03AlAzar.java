
public class Ejercico03AlAzar {

	public static void main(String[] args) {
		int aleatorio = 0;
		
		/*
		 * numeros del 0 al 9
		 */
		for (int i=1; i<=10; i++) {
			aleatorio = (int)(Math.random()*10);
			System.out.println(aleatorio);
			
		}
		
		System.out.println("");
		
		/*
		 * numeros del 1 al 10
		 */
		for (int i=1; i<=10; i++) {
			aleatorio = (int)(Math.random()*10 +1);
			System.out.println(aleatorio);
			
		}
		
		System.out.println("");
		
		/*
		 * numeros del 0 al 10
		 */
		for (int i=1; i<=10; i++) {
			aleatorio = (int)(Math.random()*11);
			System.out.println(aleatorio);
			
		}
		
		/*
		 * njumeros del 0 al 100
		 */
		
		
	}

}
