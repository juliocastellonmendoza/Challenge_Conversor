import javax.swing.JOptionPane;

public class ConvertirMonedaFisica extends Convertir{
		
	public ConvertirMonedaFisica() {
		super();
		
	}

	public double conversion(double a, String cov) {
		
			double valor=0;
			if(a<0) {
				JOptionPane.showMessageDialog(null, "No es posible convertir un número negativo");
				System.out.println("No es posible convertir un número negativo");
				}else if(cov=="pd") {
					valor=a*(1/4798.36);
					return this.monedaIn=valor;
				}else if(cov=="pe") {
					valor=a*(1/5091.97);
					return this.monedaIn=valor;
				}else if(cov=="pl") {
					valor=a*(1/5767.43);
					return this.monedaIn=valor;
				}else if(cov=="py") {
					valor=a*(1/35.26);
					return this.monedaIn=valor;
				}else if(cov=="pw") {
					valor=a*(1/3.70);
					return this.monedaIn=valor;
				}else if(cov=="dp") {
					valor=a*(4798.36/1);
					return this.monedaIn=valor;
				}else if(cov=="ep") {
					valor=a*(5091.97/1);
					return this.monedaIn=valor;
				}else if(cov=="lp") {
					valor=a*(5767.43/1);
					return this.monedaIn=valor;
				}else if(cov=="yp") {
					valor=a*(35.26/1);
					return this.monedaIn=valor;
				}else if(cov=="wp") {
					valor=a*(3.70/1);
					return this.monedaIn=valor;
				}
				return this.monedaIn=valor;		
	}
}
