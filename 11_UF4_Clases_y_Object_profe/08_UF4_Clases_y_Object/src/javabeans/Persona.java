package javabeans;

public class Persona { 
	
	public static final String EMAIL_COMPANY = "info@edix.com";
	private static int numeroPersona;
	
	private int numero;
	private double altura;
	private double peso;
	public Persona(double altura, double peso) {
		super();
		this.numero = ++numeroPersona;
		this.altura = altura;
		this.peso = peso;
	}
	public Persona() {
		super();
		numero = ++numeroPersona;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void engordar(double kilos) {
		peso += kilos;
	}
	
	public static int getNumeroPersona() {
		return numeroPersona;
	}
	
	public String calcularImc() {
		return "Este es el IMC de las personas de mi clase" + altura;
	}
	
	public static String calcularImc(double tuAltura, double tuPeso) {
		return "Este es el IMC de las personas de fuera de la  clase" + tuPeso;
		
	}
	@Override
	public String toString() {
		return "Persona [numero=" + numero + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	
	

}
