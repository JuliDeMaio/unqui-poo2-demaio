package ar.edu.unq.po2.tp4.ej3;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantHorasExtras;

	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido, int cantHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public double getMontoPercibidoTotal() {
		return super.getMontoPercibido() + this.getCantHorasExtras();
	}
	
	
}
	
	
