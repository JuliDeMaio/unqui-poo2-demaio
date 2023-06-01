package ar.edu.unq.po2.parcialPoliza;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class PolizaTest {
	
	private Poliza poliza1;
	private IBonificacionService bonificacion1;
	
	@BeforeEach
	void setUp() {
		bonificacion1 = mock(IBonificacionService.class);
		poliza1 = new Poliza(bonificacion1);
	}
	
	@Test
	void testUnaPolizaQueEstaVigenteCargaUnaBonificacion() {
		EstadoPoliza estadoEsperado = new EstadoPolizaAbierta(poliza1);
		
		poliza1.setEstadoPoliza(new EstadoPolizaVigente(poliza1));
		when(bonificacion1.codigoValido(123)).thenReturn(true);
		
		poliza1.aplicarBono("juli@gmail", 123);
		
		assertEquals(1, poliza1.precio());
		assertTrue(estadoEsperado.equals(poliza1.getEstadoPoliza()));
	}

}
