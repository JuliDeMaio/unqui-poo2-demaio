package ar.edu.unq.po2.tp9.e3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;

class CaballeroTest {

	private Caballero caballero;
	private Point     punto;
	
	@BeforeEach
	void setUp() {
		caballero = new Caballero();
		punto     = mock(Point.class);
	}

	@Test
	void verificacionDeInicializacionDeUnCaballero() {
		assertEquals(0, this.caballero.getUbicacionEnEjeX());
		assertEquals(0, this.caballero.getUbicacionEnEjeY());
	}
	
	@Test
	void verificacionCuandoUnCaballeroCamina() {
		//mockeando punto
		when(this.punto.getX()).thenReturn(3);
		when(this.punto.getY()).thenReturn(5);
		
		//exercise
		this.caballero.caminar(punto);
		
		assertEquals(3, this.caballero.getUbicacionEnEjeX());
		assertEquals(5, this.caballero.getUbicacionEnEjeY());
	}

}