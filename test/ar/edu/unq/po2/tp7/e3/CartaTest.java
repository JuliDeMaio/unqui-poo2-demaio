package ar.edu.unq.po2.tp7.e3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CartaTest {
	
	private Carta carta2D;

	@BeforeEach
	public void setUp() {
	   carta2D = new Carta(2, PaloDeCarta.Diamantes);
	   
	}
	
	@Test
	void verificacionDeInicializacionDeUnaCarta() {
		assertEquals(this.carta2D.getValor(), 2);
		assertEquals(this.carta2D.getPalo(), "Diamante");
	}

}
