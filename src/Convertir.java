
public class Convertir {
	protected double monedaIn;
	private String cov;
	
	public Convertir() {
		
	}
	
	public Convertir(double monedaIn, String cov) {
		super();
		this.monedaIn = monedaIn;
		this.cov = cov;
	}
	public double getMonedaIn() {
		return monedaIn;
	}
	public void setMonedaIn(double monedaIn) {
		this.monedaIn = monedaIn;
	}
	
	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}
}
