
public class PesoEuro extends Moneda {

	public PesoEuro() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return super.getNombre();
	}

	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	public double getValor() {
		return super.getValor() / 127;
	}

	public void setValor(double valor) {
		super.setValor(valor);
	}

}
