package ar.edu.unq.po2.tp4.ej3;

import java.util.ArrayList;

public class Trabajador {

	private ArrayList<Ingreso> ingresos;
	
	public Trabajador(ArrayList<Ingreso> ingresos) {
		super();
		this.ingresos = ingresos;
	}
	
	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}


	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public double getMontoImponible() {
		return 0;
	}

	public double getTotalPercibido() {
		double totalPercibidoPorAhora = 0;
		for (Ingreso ingreso : this.getIngresos()) {
			totalPercibidoPorAhora += ingreso.getMontoPercibidoTotal();
		}
		return totalPercibidoPorAhora;
	}

	public double getImpuestoAPagar() {
		return 0;
	}
}
