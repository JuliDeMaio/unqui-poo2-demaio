package ar.edu.unq.po2.tp9.e3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;

class IngenieroTest {
	
	private Ingeniero ingeniero;
	private Point     punto;

	@BeforeEach
	void setUp() {
		ingeniero = new Ingeniero();
		punto     = mock(Point.class);
	}

	@Test
	void verificacionDeInicializacionDeUnIngeniero() {
		assertEquals(0, this.ingeniero.getUbicacionEnEjeX());
		assertEquals(0, this.ingeniero.getUbicacionEnEjeY());
	}
	
	@Test
	void verificacionCuandoUnIngenieroCamina() {
		//mockeando punto
		when(this.punto.getX()).thenReturn(3);
		when(this.punto.getY()).thenReturn(5);
		
		//exercise
		this.ingeniero.caminar(punto);
		
		assertEquals(3, this.ingeniero.getUbicacionEnEjeX());
		assertEquals(5, this.ingeniero.getUbicacionEnEjeY());
	}

}
