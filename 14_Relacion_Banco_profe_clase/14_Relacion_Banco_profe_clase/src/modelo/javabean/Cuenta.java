package modelo.javabean;

import java.util.Objects;

public class Cuenta {
	
	private int id;
	private String tipo;
	private double saldo;
	private Cliente cliente;
	
	
	public Cuenta() {
		super();
	}


	public Cuenta(int idCuenta, String tipoCuenta, double saldo, Cliente cliente) {
		super();
		this.id = idCuenta;
		this.tipo = tipoCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public Cuenta (int id) {
		super();
		this.id=id;
		
	}


	public int getIdCuenta() {
		return id;
	}


	public void setIdCuenta(int idCuenta) {
		this.id = idCuenta;
	}


	public String getTipoCuenta() {
		return tipo;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipo = tipoCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + id + ", tipoCuenta=" + tipo + ", saldo=" + saldo + ", cliente="
				+ cliente + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return id == other.id;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public void extraer(double cantidad) {
		saldo -= cantidad;
	}
	
	

}
