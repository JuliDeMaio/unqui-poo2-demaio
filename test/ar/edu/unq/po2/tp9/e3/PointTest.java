package ar.edu.unq.po2.tp9.e3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

class PointTest {
	
	private Point punto1;
	private Point punto2;

	@BeforeEach
	void setUp() {
		punto1 = new Point(4, 5);
		punto2 = new Point(2, 7);
	}

	@Test
	void verificacionDeInicializacionDeUnPunto() {
		int valorDelEjeXEsperado = 4;
		int valorDelEjeYEsperado = 5;
		
		assertEquals(valorDelEjeYEsperado, this.punto1.getY());
		assertEquals(valorDelEjeXEsperado, this.punto1.getX());
	}
	
	@Test
	void verificacionCuandoUnPuntoSeMueve() {
		int valorDelEjeXEsperado = 8;
		int valorDelEjeYEsperado = 9;
		
		// exercise
		this.punto1.movePointTo(8, 9);
		
		assertEquals(valorDelEjeYEsperado, this.punto1.getY());
		assertEquals(valorDelEjeXEsperado, this.punto1.getX());
	}
	
	@Test
	void verificacionCuandoDosPuntosSeSuman() {
		int valorDelEjeXEsperado = 6;
		int valorDelEjeYEsperado = 12;
		
		// exercise
		this.punto1.addsPoints(punto2);
		
		assertEquals(valorDelEjeYEsperado, this.punto1.getY());
		assertEquals(valorDelEjeXEsperado, this.punto1.getX());
	}

}