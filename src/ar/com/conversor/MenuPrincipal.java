package ar.com.conversor;
import javax.swing.JOptionPane;

public class MenuPrincipal {


	public static void main(String[] args) {
		
		Moneda dolar = new Moneda("dolar", 127.75);
		Moneda euro = new Moneda("euro", 170);
		Moneda libra = new Moneda("real", 10);
		Moneda yen = new Moneda("yen", 100);
		Moneda won = new Moneda("won", 15);
		
		int seguir = 0;
		
		while(seguir == 0) {
		
			Object tipoConvertor = JOptionPane.showInputDialog(null,"Selecione una opción de conversión",
					   "Tipo de conversor", JOptionPane.QUESTION_MESSAGE, null,
					  new Object[] { "Seleccione","Conversor de Monedas", "Conversor de Temperaturas" },"Seleccione");
		
	
			if (tipoConvertor == "Conversor de Monedas") {
				Object divisa = JOptionPane.showInputDialog(null,"Selecione una divisa",
						   "Conversor de divisas", JOptionPane.QUESTION_MESSAGE, null,
						  new Object[] { "Seleccione","De Peso a Dólar", "De Peso a Euro", "De Peso a Libras Esterlinas", "De Peso a Yen Japonés", "De Peso a Won sul-coreano", "De Dólar a Peso", "De Euro a Peso", "De Libras Esterlinas a Peso", "De Yen Japonés a Peso", "De Won sul-coreano a Peso"  },"Seleccione");

			
			if (divisa == "De Peso a Dólar") {
				 double valor = dolar.convertirDePesoADivisa(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + " dolares");
			}
						
			if (divisa == "De Peso a Euro") {
				double valor = euro.convertirDePesoADivisa(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + " euros");
			}
			
			if (divisa == "De Peso a Libras Esterlinas") {
				double valor = libra.convertirDePesoADivisa(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "Libras Esterlinas");
			}
			
			if (divisa == "De Peso a Yen Japonés") {
				double valor = yen.convertirDePesoADivisa(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "Yen Japonés");
			}
			
			if (divisa == "De Peso a Won sul-coreano") {
				double valor = won.convertirDePesoADivisa(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "Won sul-coreano");
			}
						
			if (divisa == "De Dólar a Peso") {
				 double valor = dolar.convertirDeDivisaAPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + " pesos");
			}
						
			if (divisa == "De Euro a Peso") {
				double valor = euro.convertirDeDivisaAPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + " pesos");
			}
			
			if (divisa == "De Libras Esterlinas a Peso") {
				double valor = libra.convertirDeDivisaAPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "pesos");
			}
			
			if (divisa == "De Yen Japonés a Peso") {
				double valor = yen.convertirDeDivisaAPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "pesos");
			}
			
			if (divisa == "De Won sul-coreano a Peso") {
				double valor = won.convertirDeDivisaAPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor a cotizar")));
				JOptionPane.showMessageDialog(null, "Usted tiene " + valor + "pesos");
			}
			
			seguir = JOptionPane.showConfirmDialog(null, "Sí, No o Cancelar",
	                "YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
	                JOptionPane.INFORMATION_MESSAGE);
			
	        switch (seguir) {
	        
	        case 1:
	        	JOptionPane.showMessageDialog(null, "Programa finalizado");
	            break;
	        case 2:
	        	JOptionPane.showMessageDialog(null, "Programa finalizado");
	            break;
	        }
			
			}
							
		}
	}
}
