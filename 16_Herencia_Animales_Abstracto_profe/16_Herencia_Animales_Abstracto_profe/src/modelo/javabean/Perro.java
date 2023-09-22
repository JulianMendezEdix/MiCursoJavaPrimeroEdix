package modelo.javabean;

public class Perro extends Animal{
	
	private String raza;

	public Perro() {
		super();
	}

	public Perro(int numeroPatas, boolean tienesVertebradas, String nombre, String raza) {
		super(numeroPatas, tienesVertebradas, nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void saludar() {
		System.out.println("Soy un Perro de raza  : " + raza);
	}

	@Override
	public void sonido() {
		System.out.println("GUAUUUUU");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("TERRESTRE");
	}

	@Override
	public String toString() {
		return "Perro [numeroPatas=" + numeroPatas + ", tienesVertebradas=" + tienesVertebradas + ", nombre=" + nombre
				+ ", raza=" + raza + "]";
	}
	
	
	
	

}
