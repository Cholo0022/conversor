import javax.swing.JOptionPane;

public class MenuPrincipal {

	public MenuPrincipal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Object tipoConvertor = JOptionPane.showInputDialog(null,"Selecione una opci�n de conversi�n",
				   "Tipo de conversor", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Conversor de Monedas", "Conversor de Temperaturas" },"Seleccione");
		
	
		if (tipoConvertor == "Conversor de Monedas") {
			Object divisa = JOptionPane.showInputDialog(null,"Selecione una divisa",
					   "Conversor de divisas", JOptionPane.QUESTION_MESSAGE, null,
					  new Object[] { "Seleccione","De Peso a D�lar", "De Peso a Euro", "De Peso a Real", "De D�lar a Peso", "De Euro a Peso", "De Real a Peso" },"Seleccione");

			//System.out.println(divisa);
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar"));
			 if (divisa == "De Peso a D�lar") {
				PesoDolar pesoDolar = new PesoDolar();
				pesoDolar.setValor(valor);
				JOptionPane.showMessageDialog(null, "Usted tiene " + pesoDolar.getValor() + " dolares");
			}
			
			if (divisa == "De Peso a Euro") {
				PesoEuro pesoEuro = new PesoEuro();
				pesoEuro.setValor(valor);
				JOptionPane.showMessageDialog(null, "Usted tiene " + pesoEuro.getValor() + " euros");
			}
			
			if (divisa == "De Peso a Real") {
				PesoReal pesoReal = new PesoReal();
				pesoReal.setValor(valor);
				JOptionPane.showMessageDialog(null, "Usted tiene " + pesoReal.getValor() + " reales");
			}
			
			
			
		}
				
		
	}

}
