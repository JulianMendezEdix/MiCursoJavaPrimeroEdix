package modelo.javabean;

public class Gato extends Animal{
	private int vidas;

	public Gato() {
		super();
	}

	public Gato(int numeroPatas, boolean tienesVertebradas, String nombre,int vidas) {
		super(numeroPatas, tienesVertebradas,nombre);
		this.vidas = vidas;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Gato [numeroPatas=" + numeroPatas + ", tienesVertebradas=" + tienesVertebradas + ", vidas=" + vidas
				+ "]";
	}
	
	@Override
	public void saludar() {
		System.out.println("Soy un gato y ma llamo : " + nombre);
	}

	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("y hago MIAUUUU");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Soy terrestre");
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	

}
