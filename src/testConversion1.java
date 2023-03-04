import javax.swing.JOptionPane;

public class testConversion1 {
	public static void main(String[] args) {
		OpcionesConvercion here = new OpcionesConvercion();
		boolean continuar=true;
		do {		
			String  menu = (JOptionPane.showInputDialog(null,"Seleccione el tipo de conversion","MÉNU",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Seleccione que unidades desea convertir", "Conversión de Moneda Física", "Conversión de Moneda Digital"},
					"Selecciona")).toString();
					
			if(menu == "Conversión de Moneda Física") {
			
				String op = (JOptionPane.showInputDialog(null,"Seleccione que conversion desea hacer","Conversión de Moneda Física",
						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Selecciona la conversión", "Pesos - Dolar", "Pesos - EUROS","Pesos - Libras","Pesos - Yen","Pesos - Won coreano",
								"Dolar - Pesos", "EUROS - Pesos","Libras - Pesos","Yen - Pesos","Won coreano - Pesos"},
						"Selecciona")).toString();
							
				here.seleccion(menu, op);
			
			}else if(menu == "Conversión de Moneda Digital") {
			
				
				String op = (JOptionPane.showInputDialog(null,"Seleccione que conversion desea hacer","Conversión de Moneda Digital",
						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Selecciona la conversión", "Dolar - Bitcoin", "Dolar - Ethereum","Dolar - Cardano","Dolar - Tether","Dolar - Binance",
								"Bitcoin - Dolar", "Ethereum - Dolar","Cardano - Dolar","Tether - Dolar","Binance - Dolar"},
						"Selecciona")).toString();
				
				here.seleccion(menu, op);
			
			}
		
			String aux_continuar = (JOptionPane.showInputDialog(null,"¿Desea continuar?","Conversión de Moneda Digital",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Seleccione","si","no"},
					"Selecciona")).toString();
			
			if(aux_continuar=="si") {
				continuar=true;
			}else if(aux_continuar=="no") {
				continuar=false;
			}
		
		
		}while(continuar);
		
	}

}
