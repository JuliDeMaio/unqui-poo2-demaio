package ar.edu.unq.po2.parcialPoliza;

public class GastoAdministrativo {

	private String concepto;
	private double monto;
	
	public GastoAdministrativo(String concepto, double monto) {
		super();
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}
}
