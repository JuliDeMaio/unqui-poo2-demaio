package ar.edu.unq.po2.tp9.e2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaPuraTest {
	
	private ParcelaPura parcela;
	private Cultivo cultivo;

	@BeforeEach
	void setUp() {
		cultivo = Cultivo.TRIGO;
		parcela = new ParcelaPura(cultivo);
	}

	@Test
	void verificacionDeInicializacionDeUnaParcelaPura() {
		assertEquals(Cultivo.TRIGO, this.parcela.getCultivo());
	}
	
	@Test 
	void verificacionDeGananciaTotalDeUnaParcelaPura() {
		double gananciaEsperada = 300;
		assertEquals(gananciaEsperada, this.parcela.obtenerGananciaAnual());
	}

}
