package ar.edu.unq.po2.tp7.e3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private PokerStatus pokerStatus1;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	
	@BeforeEach
	public void setUp() {
		
	   // SUT
	   pokerStatus1 = new PokerStatus();
	   
	   // DOC
	   carta1 = mock(Carta.class);
	   carta2 = mock(Carta.class);
	   carta3 = mock(Carta.class);
	   carta4 = mock(Carta.class);
	   carta5 = mock(Carta.class);
	}
	
	@Test
	void testPokerStatusCuandoHayPoker() {
		
	//SetUp-Mocking
		
	when(carta1.getValor()).thenReturn(2); 						//Dummy
	when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
	
	when(carta2.getValor()).thenReturn(2); 						//Dummy
	when(carta2.getPalo()).thenReturn(PaloDeCarta.Picas); 		//Dummy

	when(carta3.getValor()).thenReturn(2); 						//Dummy
	when(carta3.getPalo()).thenReturn(PaloDeCarta.Corazones); 	//Dummy
	
	when(carta4.getValor()).thenReturn(2); 						//Dummy
	when(carta4.getPalo()).thenReturn(PaloDeCarta.Treboles); 	//Dummy
	
	when(carta5.getValor()).thenReturn(11); 					//Dummy
	when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
	
	//Excercise

	String stringObtenido = pokerStatus1.verificar(carta1, carta2, carta3, carta4, carta5);
	
	//Verify
	
	assertEquals("Poker", stringObtenido);
	
	}
	
	@Test
	public void testPokerStatusCuandoHayColor() {
		
	//SetUp-Mocking
		
	when(carta1.getValor()).thenReturn(2); 						//Dummy
	when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
		
	when(carta2.getValor()).thenReturn(3); 						//Dummy
	when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy

	when(carta3.getValor()).thenReturn(4); 						//Dummy
	when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
		
	when(carta4.getValor()).thenReturn(1); 						//Dummy
	when(carta4.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
		
	when(carta5.getValor()).thenReturn(11); 					//Dummy
	when(carta5.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
		
	//Excercise

	String stringObtenido = pokerStatus1.verificar(carta1, carta2, carta3, carta4, carta5);
		
	//Verify
		
	assertEquals("Color", stringObtenido);
	
	}	
	
	@Test
	public void testPokerStatusCuandoHayTrio() {
	
	//SetUp-Mocking
		
	when(carta1.getValor()).thenReturn(2); 						//Dummy
	when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
			
	when(carta2.getValor()).thenReturn(2); 						//Dummy
	when(carta2.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy

	when(carta3.getValor()).thenReturn(2); 						//Dummy
	when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
			
	when(carta4.getValor()).thenReturn(1); 						//Dummy
	when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas); 		//Dummy
			
	when(carta5.getValor()).thenReturn(11); 					//Dummy
	when(carta5.getPalo()).thenReturn(PaloDeCarta.Treboles); 	//Dummy
			
	//Excercise

	String stringObtenido = pokerStatus1.verificar(carta1, carta2, carta3, carta4, carta5);
			
	//Verify
			
	assertEquals("Trio", stringObtenido);	
	
	}
	
	@Test
	public void testPokerStatusCuandoNoHayNada() {
	
	//SetUp-Mocking
		
	when(carta1.getValor()).thenReturn(2); 						//Dummy
	when(carta1.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
			
	when(carta2.getValor()).thenReturn(10); 					//Dummy
	when(carta2.getPalo()).thenReturn(PaloDeCarta.Treboles); 	//Dummy

	when(carta3.getValor()).thenReturn(3); 						//Dummy
	when(carta3.getPalo()).thenReturn(PaloDeCarta.Diamantes); 	//Dummy
			
	when(carta4.getValor()).thenReturn(1); 						//Dummy
	when(carta4.getPalo()).thenReturn(PaloDeCarta.Picas); 		//Dummy
			
	when(carta5.getValor()).thenReturn(11); 					//Dummy
	when(carta5.getPalo()).thenReturn(PaloDeCarta.Corazones); 	//Dummy
			
	//Excercise

	String stringObtenido = pokerStatus1.verificar(carta1, carta2, carta3, carta4, carta5);
			
	//Verify
			
	assertEquals("Nada", stringObtenido);
	}
}