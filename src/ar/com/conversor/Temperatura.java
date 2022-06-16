package ar.com.conversor;

public class Temperatura {
	private String nombre;
	private double valor;
	
	
	
	public Temperatura() {
		
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
	
	public double convertirDeCelciusAFahrenheit(double valor) throws MiException {
		return (valor * 1.8) + 32;

	}

	public double convertirDeFahrenheitACelcius(double valor) throws Exception {
		return (valor - 32) / 1.8;
	}

	

}
