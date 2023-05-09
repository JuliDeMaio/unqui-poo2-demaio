package ar.edu.unq.po2.tp8.e2;

import java.util.Arrays;
import java.util.List;

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
	
	public int costo() {
		return valorPorDia() + valorPorDeporte();
	}

	private int valorPorDia() {
		return costoDeHoraPorDia() * getDuracion();
	}

	private int valorPorDeporte() {
		return getDeporte().getComplejidad() * valorFijoPorComplejidad();
	}

	private int valorFijoPorComplejidad() {
		return 200;
	}
	
	private int costoDeHoraPorDia() {
		List<DiaDeLaSemana> listaDeDiasDeCosto500 = Arrays.asList(DiaDeLaSemana.LUNES, DiaDeLaSemana.MARTES, DiaDeLaSemana.MIERCOLES);
		
		int costoDeHoraPorDia = 1000;
		
		if (listaDeDiasDeCosto500.contains(getDiaDeLaSemana())) {
			costoDeHoraPorDia = 500; 
		}
		
		return costoDeHoraPorDia;
	}
}
