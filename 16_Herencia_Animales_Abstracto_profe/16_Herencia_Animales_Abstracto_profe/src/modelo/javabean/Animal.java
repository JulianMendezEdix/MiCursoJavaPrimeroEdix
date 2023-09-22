package modelo.javabean;

public abstract class Animal {
	protected int numeroPatas;
	protected boolean tienesVertebradas;
	protected String nombre;
	
	public Animal(int numeroPatas, boolean tienesVertebradas, String nombre) {
		super();
		this.numeroPatas = numeroPatas;
		this.tienesVertebradas = tienesVertebradas;
		this.nombre = nombre;
	}
	public Animal() {
		super();
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public boolean isTienesVertebradas() {
		return tienesVertebradas;
	}
	public void setTienesVertebradas(boolean tienesVertebradas) {
		this.tienesVertebradas = tienesVertebradas;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", tienesVertebradas=" + tienesVertebradas + ", nombre=" + nombre
				+ "]";
	}
	public abstract void saludar();
	
	public abstract void sonido();
	
	public abstract void medioLocomocion();
	
	

}
