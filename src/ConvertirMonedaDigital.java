import javax.swing.JOptionPane;

public class ConvertirMonedaDigital extends Convertir{
	
	
	public ConvertirMonedaDigital() {
		super();
	}
	
	public double conversion(double a, String cov) {
		double valor=0;
		if(a<0) {
			JOptionPane.showMessageDialog(null, "No es posible convertir un número negativo");
			System.out.println("No es posible convertir un número negativo");
			}else if(cov=="dbit") {
				valor=a*(1/22340.30);
				return this.monedaIn=valor;
			}else if(cov=="det") {
				valor=a*(1/1568.86);
				return this.monedaIn=valor;
			}else if(cov=="dca") {
				valor=a*(1/0.34);
				return this.monedaIn=valor;
			}else if(cov=="dte") {
				valor=a*(1/1.00);
				return this.monedaIn=valor;
			}else if(cov=="dbin") {
				valor=a*(1/289.69);
				return this.monedaIn=valor;
			}else if(cov=="bitd") {
				valor=a*(22340.30/1);
				return this.monedaIn=valor;
			}else if(cov=="etd") {
				valor=a*(1568.86/1);
				return this.monedaIn=valor;
			}else if(cov=="cad") {
				valor=a*(0.34/1);
				return this.monedaIn=valor;
			}else if(cov=="ted") {
				valor=a*(1.00/1);
				return this.monedaIn=valor;
			}else if(cov=="bind") {
				valor=a*(289.69/1);
				return this.monedaIn=valor;
			}
			return this.monedaIn=valor;
	}

}
