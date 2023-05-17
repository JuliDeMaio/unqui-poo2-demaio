package ar.edu.unq.po2.tp9.e2;

public enum Cultivo {

	SOJA(500d), TRIGO(300d);
	
	private double gananciaAnual;

	Cultivo(double gananciaAnual) {
		setGananciaAnual(gananciaAnual);
	}

	public double getGananciaAnual() {
		return gananciaAnual;
	}

	public void setGananciaAnual(double gananciaAnual) {
		this.gananciaAnual = gananciaAnual;
	}
}
