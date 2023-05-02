package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoPersonalTest {

	private SolicitudDeCreditoPersonal solicitudDeCreditoPersonal1;
	private SolicitudDeCreditoPersonal solicitudDeCreditoPersonal2;
	private Cliente cliente1;
	private Cliente cliente2;

	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Guido", "Ventoso", "Av. SiempreWollok 2142", 82, 1000f);
		cliente2 = new Cliente("Guido", "Ventoso", "Av. SiempreWollok 2142", 32, 15000f);
		solicitudDeCreditoPersonal1 = new SolicitudDeCreditoPersonal(cliente1, 15000f, 10);
		solicitudDeCreditoPersonal2 = new SolicitudDeCreditoPersonal(cliente2, 1000f, 10);
	}

	@Test
	void verificacionDeInicializacionDeUnaSolicitudDeCreditoPersonal() {
		assertEquals(this.solicitudDeCreditoPersonal1.getClienteSolicitante(), cliente1);
		assertEquals(this.solicitudDeCreditoPersonal1.getMontoSolicitado(), 15000f);
		assertEquals(this.solicitudDeCreditoPersonal1.getPlazoEnMeses(), 10);
		assertEquals(this.solicitudDeCreditoPersonal1.getEsAceptada(), false);
	}

	@Test
	void verificacionMontoMensualDeUnCredito() {
		assertEquals(this.solicitudDeCreditoPersonal1.montoCuotaMensual(), 1500f);
	}	
	
	@Test
	void verificacionResultadoDeVerificacionDeSolicitudDeCreditoPersonalCuandoNoCumple() {
		assertFalse(solicitudDeCreditoPersonal1.resultadoDeVerificacion());
	}
	
	@Test
	void verificacionResultadoDeVerificacionDeSolicitudDeCreditoPersonalCuandoCumple() {
		assertTrue(solicitudDeCreditoPersonal2.resultadoDeVerificacion());
	}
}