package ar.edu.unq.po2.tp8.e2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {
	
	private ActividadSemanal actividadSemanal;

	@BeforeEach
	public void setUp() {
		actividadSemanal = new ActividadSemanal(DiaDeLaSemana.LUNES, 16, 2, Deporte.BASKET);
	}

	@Test
	public void verificacionInicializacionActividadSemanal() {
		DiaDeLaSemana diaDeLaSemanaEsperado = DiaDeLaSemana.LUNES;
		int horarioEsperado = 16;
		int duracionEsperada = 2;
		Deporte deporteEsperado = Deporte.BASKET;
		
		assertEquals(diaDeLaSemanaEsperado, actividadSemanal.getDiaDeLaSemana());
		assertEquals(horarioEsperado, actividadSemanal.getHora());
		assertEquals(duracionEsperada, actividadSemanal.getDuracion());
		assertEquals(deporteEsperado, actividadSemanal.getDeporte());
	}

	@Test
	public void verificacionDelCostoDeUnaActividadSemanal() {
		int costoEsperado = 1400; 
		
		assertEquals(costoEsperado, actividadSemanal.costo());
	}
}