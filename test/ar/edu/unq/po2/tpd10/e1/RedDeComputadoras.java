package ar.edu.unq.po2.tpd10.e1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedDeComputadoresTest {
	
	private RedDeComputadoras red;
	private EncriptadorPorOrden encriptadorOrden;
	private EncriptadorPorVocal encriptadorVocal;
	private EncriptadorPorNumero encriptadorNumero;
	
	@BeforeEach
	void setUp() {
		red = new RedDeComputadoras();
		encriptadorOrden = mock(EncriptadorPorOrden.class);
		encriptadorVocal = mock(EncriptadorPorVocal.class);
		encriptadorNumero = mock(EncriptadorPorNumero.class);
	}

	@Test
	void verificacionDeEncriptadoMedianteEstrategiaPorOrden() {
				
		red.setStrategy(encriptadorOrden);
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "?satse omoc¿ ,aloH";
		
		when(encriptadorOrden.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = red.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDeDesencriptadoMedianteEstrategiaPorOrden() {
		
		red.setStrategy(encriptadorOrden);
				
		String mensajeSinDesencriptar = "?satse omoc¿ ,aloH";
		String mensajeDesencriptadoEsperado = "Hola, ¿como estas?";
		
		when(encriptadorOrden.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = red.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
	
	@Test
	void verificacionDeEncriptadoMedianteEstrategiaPorVocal() {
				
		red.setStrategy(encriptadorVocal);
		
		String mensajeSinEncriptar = "Hola, ¿como estas?";
		String mensajeEncriptadoEsperado = "hule, ¿cumu istes?";
		
		when(encriptadorVocal.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = red.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDeDesencriptadoMedianteEstrategiaPorVocal() {
		
		red.setStrategy(encriptadorVocal);
				
		String mensajeSinDesencriptar = "hule, ¿cumu istes?";
		String mensajeDesencriptadoEsperado = "hola, ¿como estas?";
		
		when(encriptadorVocal.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = red.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
	
	@Test
	void verificacionDeEncriptadoMedianteEstrategiaPorNumero() {
				
		red.setStrategy(encriptadorNumero);
		
		String mensajeSinEncriptar = "hola como estas";
		String mensajeEncriptadoEsperado = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		
		when(encriptadorNumero.encriptar(mensajeSinEncriptar)).thenReturn(mensajeEncriptadoEsperado);
		
		String mensajeEncriptadoObtenido = red.encriptarMensaje(mensajeSinEncriptar);
		
		assertEquals(mensajeEncriptadoEsperado, mensajeEncriptadoObtenido);
	}
	
	@Test
	void verificacionDeDesencriptadoMedianteEstrategiaPorNumero() {
		
		red.setStrategy(encriptadorNumero);
				
		String mensajeSinDesencriptar = "8,15,12,1,0,3,15,13,15,0,5,19,20,1,19";
		String mensajeDesencriptadoEsperado = "hola como estas";
		
		when(encriptadorNumero.desencriptar(mensajeSinDesencriptar)).thenReturn(mensajeDesencriptadoEsperado);
		
		String mensajeDesencriptadoObtenido = red.desencriptarMensaje(mensajeSinDesencriptar);
		
		assertEquals(mensajeDesencriptadoEsperado, mensajeDesencriptadoObtenido);
	}
}