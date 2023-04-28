package ar.edu.unq.po2.tp5;

public class Impuesto implements IPagable {

	private double tasaDeServicio;

	public Impuesto(double tasaDeServicio) {
		super();
		this.setTasaDeServicio(tasaDeServicio);
	}
	
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public double registrarse() {
		return this.getTasaDeServicio();
	}
}
