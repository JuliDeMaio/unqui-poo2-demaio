package ar.edu.unq.po2.tp8.e2;

public class ActividadSemanal {

	private DiaDeLaSemana diaDeLaSemana;
	private int hora;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int hora, int duracion, Deporte deporte) {
		super();
		this.setDiaDeLaSemana(diaDeLaSemana);
		this.setHora(hora);
		this.setDuracion(duracion);
		this.setDeporte(deporte);
	}

	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public void setDiaDeLaSemana(DiaDeLaSemana diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public double costo() {
		double costoHastaElMomento = 0;
		if 
	}
	
		
	
}
