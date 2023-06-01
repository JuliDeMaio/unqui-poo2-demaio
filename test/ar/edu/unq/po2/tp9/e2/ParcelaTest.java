package ar.edu.unq.po2.tp9.e2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaTest {
	
	private Cultivo trigo;
	private Cultivo soja;

	@BeforeEach
	void setUp() {
		trigo = Cultivo.TRIGO;
		soja  = Cultivo.SOJA;
	}
	
	@Test
	void verificacionDeInicializacionDeCultivoTrigo() {
		double gananciaEsperada = 300d;
		assertEquals(gananciaEsperada, this.trigo.getGananciaAnual());
	}
	
	@Test
	void verificacionDeInicializacionDeCultivoSoja() {
		double gananciaEsperada = 500d;
		assertEquals(gananciaEsperada, this.soja.getGananciaAnual());
	}

}
