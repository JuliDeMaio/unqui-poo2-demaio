package ar.edu.unq.po2.tp9.e2;

public class ParcelaPura implements Parcela {

	private Cultivo cultivo;

	public ParcelaPura(Cultivo cultivo) {
		super();
		setCultivo(cultivo);
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	@Override
	public double obtenerGananciaAnual() {
		return this.getCultivo().getGananciaAnual();
	}	
}
