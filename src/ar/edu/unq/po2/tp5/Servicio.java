package ar.edu.unq.po2.tp5;

public class Servicio implements IPagable {

	private double costoPorUnidad;
	private double costoPorUnidadesConsumidas;
	
	public Servicio(double costoPorUnidad, double costoPorUnidadesConsumidas) {
		super();
		this.setCostoPorUnidadesConsumidas(costoPorUnidad);
		this.setCostoPorUnidad(costoPorUnidadesConsumidas);
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public double getCostoPorUnidadesConsumidas() {
		return costoPorUnidadesConsumidas;
	}

	public void setCostoPorUnidadesConsumidas(double costoPorUnidadesConsumidas) {
		this.costoPorUnidadesConsumidas = costoPorUnidadesConsumidas;
	}

	@Override
	public double registrarse() {
		return getCostoPorUnidad() * getCostoPorUnidadesConsumidas();
	}

}
