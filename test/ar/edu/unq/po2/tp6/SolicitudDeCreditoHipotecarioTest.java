package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoHipotecarioTest {

	private SolicitudDeCreditoHipotecario solicitudDeCreditoHipotecario1;
	private SolicitudDeCreditoHipotecario solicitudDeCreditoHipotecario2;
	private Cliente cliente1;
	private Cliente cliente2;
	private Propiedad propiedad1;
	private Propiedad propiedad2;

	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Guido", "Ventoso", "Av. SiempreWollok 2142", 82, 1000f);
		cliente2 = new Cliente("Guido", "Ventoso", "Av. SiempreWollok 2142", 32, 15000f);
		propiedad1 = new Propiedad("Casa de Nacho Cirilli", 15f, "Av. SiempreWollok 2142");
		propiedad2 = new Propiedad("Casa de Verano Nacho Cirilli", 1500000f, "Av. SiempreSmalltalk 2904");
		solicitudDeCreditoHipotecario1 = new SolicitudDeCreditoHipotecario(cliente1, 15000f, 10, propiedad1);
		solicitudDeCreditoHipotecario2 = new SolicitudDeCreditoHipotecario(cliente2, 1000f, 10, propiedad2);
	}

	@Test
	void verificacionDeInicializacionDeUnaSolicitudDeCreditoHipotecario() {
		assertEquals(this.solicitudDeCreditoHipotecario1.getClienteSolicitante(), cliente1);
		assertEquals(this.solicitudDeCreditoHipotecario1.getMontoSolicitado(), 15000f);
		assertEquals(this.solicitudDeCreditoHipotecario1.getPlazoEnMeses(), 10);
		assertEquals(this.solicitudDeCreditoHipotecario1.getEsAceptada(), false);
	}

	@Test
	void verificacionMontoMensualDeUnCredito() {
		assertEquals(this.solicitudDeCreditoHipotecario1.montoCuotaMensual(), 1500f);
	}	
	
	@Test
	void verificacionResultadoDeVerificacionDeSolicitudDeCreditoHipotecarioCuandoNoCumple() {
		assertFalse(solicitudDeCreditoHipotecario1.resultadoDeVerificacion());
	}
	
	@Test
	void verificacionResultadoDeVerificacionDeSolicitudDeCreditoHipotecarioCuandoCumple() {
		assertTrue(solicitudDeCreditoHipotecario2.resultadoDeVerificacion());
	}
}
