package ar.edu.unq.po2.tp8.e2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MunicipioTest {
	
	private Municipio secretaria;
	private ActividadSemanal actividad1;
	private ActividadSemanal actividad2;
	private ActividadSemanal actividad3;
	private ActividadSemanal actividad4;
	private ActividadSemanal actividad5;
	

	@BeforeEach
	void setUp(){
		secretaria = new Municipio();
		actividad1 = mock(ActividadSemanal.class);
		actividad2 = mock(ActividadSemanal.class);
		actividad3 = mock(ActividadSemanal.class);
		actividad4 = mock(ActividadSemanal.class);
		actividad5 = mock(ActividadSemanal.class);
	}

	@Test
	void verificacionDeInicializacionDeUnaSecretaria() {
		assertTrue(secretaria.getActividadesSemanales().isEmpty());
	}
	
	@Test
	void verificacionDeAgregadoDeUnaActividadSemanalAUnaSecretaria() {
		
		secretaria.agregarActividadSemanal(actividad1);
		
		assertEquals(1, secretaria.getActividadesSemanales().size());
	}
	
	@Test
	void verificacionDeFiltroActividadSemanalDeFutbolEnUnaSecretaria() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.TENNIS);
		when(actividad3.getDeporte()).thenReturn(Deporte.FUTBOL);
		
		secretaria.agregarActividadSemanal(actividad1);
		secretaria.agregarActividadSemanal(actividad2);
		secretaria.agregarActividadSemanal(actividad3);
		
		assertEquals(2, secretaria.actividadesSemanalesDeFutbol().size());
	}
	
	@Test
	void verificacionDeFiltroDeComplejidadDeActividadesSemanalesEnUnaSecretaria() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.TENNIS);
		when(actividad3.getDeporte()).thenReturn(Deporte.FUTBOL);
		
		secretaria.agregarActividadSemanal(actividad1);
		secretaria.agregarActividadSemanal(actividad2);
		secretaria.agregarActividadSemanal(actividad3);
		
		assertEquals(2, secretaria.actividadesSemanalesDeComplejidad(2).size());
	}
	
	@Test
	void verificacionDeCantidadDeHorasDeActividadesSemanalesEnUnaSecretaria() {
		
		when(actividad1.getDuracion()).thenReturn(1);
		when(actividad2.getDuracion()).thenReturn(1);
		when(actividad3.getDuracion()).thenReturn(2);
		
		secretaria.agregarActividadSemanal(actividad1);
		secretaria.agregarActividadSemanal(actividad2);
		secretaria.agregarActividadSemanal(actividad3);
		
		assertEquals(4, secretaria.cantidadDeHorasTotalesDeActividades());
	}
	
	@Test
	void verificacionDeLaActividadSemanalDeMenorCostoDeUnaSecretaria() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.TENNIS);
		when(actividad3.getDeporte()).thenReturn(Deporte.FUTBOL);
		
		when(actividad1.costo()).thenReturn(1400);
		when(actividad2.costo()).thenReturn(1100);
		when(actividad3.costo()).thenReturn(900);
		
		secretaria.agregarActividadSemanal(actividad1);
		secretaria.agregarActividadSemanal(actividad2);
		secretaria.agregarActividadSemanal(actividad3);
		
		assertEquals(actividad3, secretaria.actividadDeMenorCostoDe(Deporte.FUTBOL));
	}
	
	@Test
	void verificacionDeAgrupacionPorActividadSemanalDeMenorCostoDeUnaSecretaria() {
		
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.TENNIS);
		when(actividad3.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad4.getDeporte()).thenReturn(Deporte.BASKET);
		when(actividad5.getDeporte()).thenReturn(Deporte.TENNIS);
		
		when(actividad1.costo()).thenReturn(1400);
		when(actividad2.costo()).thenReturn(1100);
		when(actividad3.costo()).thenReturn(900);
		when(actividad4.costo()).thenReturn(800);
		when(actividad4.costo()).thenReturn(1600);
		
		secretaria.agregarActividadSemanal(actividad1);
		secretaria.agregarActividadSemanal(actividad2);
		secretaria.agregarActividadSemanal(actividad3);
		secretaria.agregarActividadSemanal(actividad4);
		secretaria.agregarActividadSemanal(actividad5);
		
		assertTrue(secretaria.agruparPorActividadPorMenorCosto().get(Deporte.FUTBOL).isPresent());
		assertTrue(secretaria.agruparPorActividadPorMenorCosto().get(Deporte.BASKET).isPresent());
		assertTrue(secretaria.agruparPorActividadPorMenorCosto().get(Deporte.TENNIS).isPresent());
	}
}