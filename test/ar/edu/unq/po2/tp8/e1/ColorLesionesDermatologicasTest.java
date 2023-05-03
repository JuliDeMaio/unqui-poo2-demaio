package ar.edu.unq.po2.tp8.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.e1.ColorLesionesDermatologicas;

class ColorLesionesDermatologicasTest {
	
	private ColorLesionesDermatologicas colorDelesionDermatologicaRojo;
	private ColorLesionesDermatologicas colorDeLesionDermatologicaGris;
	private ColorLesionesDermatologicas colorDeLesionDermatologicaAmarillo;
	private ColorLesionesDermatologicas colorDeLesionDermatologicaMiel;

	@BeforeEach
	void setUp() {
		colorDelesionDermatologicaRojo = ColorLesionesDermatologicas.ROJO;
		colorDeLesionDermatologicaGris = ColorLesionesDermatologicas.GRIS;
		colorDeLesionDermatologicaAmarillo = ColorLesionesDermatologicas.AMARILLO;
		colorDeLesionDermatologicaMiel = ColorLesionesDermatologicas.MIEL;
	}
	
	@Test
	void testInicializacionDeUnColorDeLesionDermatologicaRoja() {
		assertEquals("Manchas", colorDelesionDermatologicaRojo.getDescripcion());
		assertEquals(3, colorDelesionDermatologicaRojo.getNivelDeRiesgo());
		assertEquals("Gris", colorDelesionDermatologicaRojo.getSiguienteLesion());
	}
	
	@Test
	void testInicializacionDeUnColorDeLesionDermatologicaGris() {
		assertEquals("Llagas", colorDeLesionDermatologicaGris.getDescripcion());
		assertEquals(5, colorDeLesionDermatologicaGris.getNivelDeRiesgo());
		assertEquals("Amarillo", colorDeLesionDermatologicaGris.getSiguienteLesion());
	}
	
	@Test
	void testInicializacionDeUnColorDeLesionDermatologicaAmarilla() {
		assertEquals("Sarpullido", colorDeLesionDermatologicaAmarillo.getDescripcion());
		assertEquals(7, colorDeLesionDermatologicaAmarillo.getNivelDeRiesgo());
		assertEquals("Miel", colorDeLesionDermatologicaAmarillo.getSiguienteLesion());
	}
	
	@Test
	void testInicializacionDeUnColorDeLesionDermatologicaMiel() {
		assertEquals("Lesion profunda", colorDeLesionDermatologicaMiel.getDescripcion());
		assertEquals(9, colorDeLesionDermatologicaMiel.getNivelDeRiesgo());
		assertEquals("Rojo", colorDeLesionDermatologicaMiel.getSiguienteLesion());
	}

}
