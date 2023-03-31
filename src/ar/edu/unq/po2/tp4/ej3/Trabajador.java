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
		double totalMontoPorAhora = 0;
		for (Ingreso ingreso : this.getIngresos()) {
			totalMontoPorAhora += ingreso.getMontoPercibido();
		}
		return totalMontoPorAhora;
	}

	public double getTotalPercibido() {
		double totalPercibidoPorAhora = 0;
		for (Ingreso ingreso : this.getIngresos()) {
			totalPercibidoPorAhora += ingreso.getMontoPercibidoTotal();
		}
		return totalPercibidoPorAhora;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * porcentajeDeImpuestoAlTrabajador();
	}

	private double porcentajeDeImpuestoAlTrabajador() {
		return 0.02;
	}
}
