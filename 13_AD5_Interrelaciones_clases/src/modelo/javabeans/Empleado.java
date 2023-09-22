package modelo.javabeans;

import java.util.Objects;

public class Empleado {
	
	private int idEmpleado;
	private String nombre, apellidos;
	private char genero;
	private String email;
	private double salario, comision;
	private Trabajo trabajo;
	private Departamento departamento;
	private static final String DOMINIO = "empresa.com";
	
	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}

	public Empleado() {
		super();
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero="
				+ genero + ", email=" + email + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	
	/*
	 * Métodos propios de objetos
	 */
	

	public String sexo (char sexo) {
		
		String aux;
		
		switch (sexo) {
		
		case 'h','H':
			aux="Hombre";
		break;
		case 'm','M':
			aux="Mujer";
		break;
		default:
			aux="Sexo erróneo";
			break;
		}

		return aux;
		
	}
	
	public double salarioBruto() {
		return this.salario+this.comision;
	}
	
	public double salarioMensual(int meses) {
		return this.salario/((double)meses);
	}
	
	public String obtenerEmail() {

		return 
				this.nombre.charAt(0) +
				this.apellidos.split(" ")[0]+
				"@" + DOMINIO;	
	}
	
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
	

	
	
	
}
