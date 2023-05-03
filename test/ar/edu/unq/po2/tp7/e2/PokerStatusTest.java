package ar.edu.unq.po2.tp7.e2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus pokerStatus1;
	private Carta carta2D;
	private Carta carta2P;
	private Carta carta2C;
	private Carta carta2T;
	private Carta cartaJD;
	private Carta carta5T;
	private Carta carta3D;
	private Carta cartaKD;
	private Carta carta1D;
	
	
	@BeforeEach
	public void setUp() {
	   pokerStatus1 = new PokerStatus();
	   carta2D = new Carta(2, PaloDeCarta.Diamantes);
	   carta2P = new Carta(2, PaloDeCarta.Picas);
	   carta2C = new Carta(2, PaloDeCarta.Corazones);
	   carta2T = new Carta(2, PaloDeCarta.Treboles);
	   cartaJD = new Carta(11, PaloDeCarta.Diamantes);
	   carta5T = new Carta(5, PaloDeCarta.Treboles);
	   carta3D = new Carta(3, PaloDeCarta.Diamantes);
	   cartaKD = new Carta(13, PaloDeCarta.Diamantes);
	   carta1D = new Carta(1, PaloDeCarta.Diamantes);
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