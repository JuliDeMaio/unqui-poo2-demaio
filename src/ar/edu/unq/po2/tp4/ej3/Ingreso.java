package ar.edu.unq.po2.tp4.ej3;
import java.time.Month;

public abstract class Ingreso {
	
	private Month mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(Month mesDePercepcion, String concepto, double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public Month getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(Month mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public abstract double getMontoPercibidoTotal();
	
}
