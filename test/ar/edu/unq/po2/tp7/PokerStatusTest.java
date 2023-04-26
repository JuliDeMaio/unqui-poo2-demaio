package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus pokerStatus1;
	private String carta2D;
	private String carta2P;
	private String carta2C;
	private String carta2T;
	private String cartaJD;
	private String carta5T;
	private String carta3D;
	private String cartaKD;
	private String carta1D;
	
	
	@BeforeEach
	public void setUp() {
	   pokerStatus1 = new PokerStatus();
	   carta2D = "2D";
	   carta2P = "2P";
	   carta2C = "2C";
	   carta2T = "2T";
	   cartaJD = "JD";
	   carta5T = "5T";
	   carta3D = "3D";
	   cartaKD = "KD";
	   carta1D = "1D";
	}
	
	@Test
	public void testPokerStatusCuandoHayPoker() {
		assertEquals("Poker", pokerStatus1.verificar(carta2D, carta2P, carta2C, carta2T, cartaJD));
	}
	
	@Test
	public void testPokerStatusCuandoNoHayPoker() {
		assertEquals("Nada", pokerStatus1.verificar(carta2D, carta5T, carta2C, carta1D, cartaJD));
	}
	
	@Test
	public void testPokerStatusCuandoHayColor() {
		assertEquals("Color", pokerStatus1.verificar(carta2D, cartaJD, carta3D, cartaKD, carta1D));
	}
	
	@Test
	public void testPokerStatusCuandoNoHayColor() {
		assertEquals("Nada", pokerStatus1.verificar(carta2D, cartaJD, carta3D, cartaKD, carta5T));
	}
	
}