package ar.edu.unq.po2.tp4.ej3;

import java.time.Month;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantHorasExtras;

	public IngresoPorHorasExtras(Month mesDePercepcion, String concepto, double montoPercibido, int cantHorasExtras) {
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
		// Se implementa un metodo llamado valorPorHoraExtra para que modifique el valor del total percibido por cada hora extra.
		return super.getMontoPercibido() + (this.getCantHorasExtras() * valorPorCadaHoraExtra());
	}

	private double valorPorCadaHoraExtra() {
		return 40d;
	}
	
	
}
	
	
