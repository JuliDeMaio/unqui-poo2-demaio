package ar.edu.unq.po2.tp5;

public class Factura {

	private double montoTotalAPagar;
	private String concepto;
	
	public Factura(double montoTotalAPagar, String concepto) {
		super();
		this.setMontoTotalAPagar(montoTotalAPagar);
		this.setConcepto(concepto);
	}

	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	public void setMontoTotalAPagar(double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	
	
	
}
