
public class PesoDolar extends Moneda {
	
	public PesoDolar() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return super.getNombre();
	}

	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	public double getValor() {
		return super.getValor() / 124.25;
	}

	public void setValor(double valor) {
		super.setValor(valor);
	}

}
