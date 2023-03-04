import javax.swing.JOptionPane;

public class OpcionesConvercion extends Convertir{
		
	ConvertirMonedaFisica fisica = new ConvertirMonedaFisica();
	ConvertirMonedaDigital digital = new ConvertirMonedaDigital();
	
	public OpcionesConvercion() {
		super();
	}

	public void seleccion(String a,String op) {
		
		if(a == "Conversión de Moneda Física") {
						
			if(op=="Pesos - Dolar") {
				fisica.setCov("pd");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ " + fisica.getMonedaIn() + " Dolares");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Pesos - EUROS") {
				fisica.setCov("pe");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "€ "+ fisica.getMonedaIn() + " Euros");	
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Pesos - Libras") {
				fisica.setCov("pl");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "£ "+ fisica.getMonedaIn() + " Libra esterlinas");	
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Pesos - Yen") {
				fisica.setCov("py");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "¥ "+ fisica.getMonedaIn() + " Yen Japones");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Pesos - Won coreano") {
				fisica.setCov("pw");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "₩ "+ fisica.getMonedaIn() + " Won Koreano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Dolar - Pesos") {
				fisica.setCov("dp");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ fisica.getMonedaIn() + " Pesos Colombiano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="EUROS - Pesos") {
				fisica.setCov("ep");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ fisica.getMonedaIn() + " Pesos Colombiano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Libras - Pesos") {
				fisica.setCov("lp");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ fisica.getMonedaIn() + " Pesos Colombiano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Yen - Pesos") {
				fisica.setCov("yp");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ fisica.getMonedaIn() + " Pesos Colombiano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Won coreano - Pesos") {
				fisica.setCov("wp");
				try {
					fisica.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(fisica.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ fisica.getMonedaIn() + " Pesos Colombiano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}
			
		}else if(a == "Conversión de Moneda Digital") {
			
			if(op=="Dolar - Bitcoin") {
				digital.setCov("dbit");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "₿ "+ digital.getMonedaIn() + " Bitcoin");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Dolar - Ethereum") {
				digital.setCov("det");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "Ξ "+ digital.getMonedaIn() + " Ethereum");	
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Dolar - Cardano") {
				digital.setCov("dca");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "₳ "+ digital.getMonedaIn() + " Cardano");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Dolar - Tether") {
				digital.setCov("dte");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "USDT "+ digital.getMonedaIn() + " Tether");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Dolar - Binance") {
				digital.setCov("dbin");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "BNB "+ digital.getMonedaIn() + " Binance");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Bitcoin - Dolar") {
				digital.setCov("bitd");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ digital.getMonedaIn() + " Dolares");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Ethereum - Dolar") {
				digital.setCov("etd");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ digital.getMonedaIn() + " Dolares");	
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Cardano - Dolar") {
				digital.setCov("cad");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ digital.getMonedaIn() + " Dolares");	
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Tether - Dolar") {
				digital.setCov("ted");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ digital.getMonedaIn() + " Dolares");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}else if(op=="Binance - Dolar") {
				digital.setCov("bind");
				try {
					digital.conversion((Double.parseDouble(JOptionPane.showInputDialog("Digitar la cantidad que quiere convertir"))),(digital.getCov()));
					JOptionPane.showMessageDialog(null, "$ "+ digital.getMonedaIn() + " Dolares");
				}catch(Exception me) {
					me.printStackTrace();
					JOptionPane.showMessageDialog(null, "No es un valor permitido");
				}
			}
			
			
		}
	}
	

}
