package ar.com.conversor;
public class Moneda {
	private String nombre;
	private double valor;
	
	public Moneda(String nombre, double valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double convertirDePesoADivisa(double valor)  {
		return valor / this.valor;
		
	}
	
	public double convertirDeDivisaAPeso(double valor) {
		return this.valor * valor;
	}

}
