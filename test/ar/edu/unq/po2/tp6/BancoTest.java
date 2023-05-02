package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco;
	private Cliente cliente1;
	private SolicitudDeCreditoPersonal solicitudDeCredito1;

	@BeforeEach
	void setUp() throws Exception {
		this.banco    = new Banco();
		this.cliente1 = new Cliente("Guido", "Ventoso", "Av. SiempreViva 2142", 62, 5000f); 
		this.solicitudDeCredito1 = new SolicitudDeCreditoPersonal(cliente1, 15000f, 36);
	}

	@Test
	void verificacionDeInicializacionDeUnBanco() {
		assertEquals(this.banco.getClientes().size(), 0);
		assertEquals(this.banco.getSolicitudesDeCreditos().size(), 0);
	}
	
	@Test
	void verificacionDeCuandoUnBancoAgregaUnCliente() {
		this.banco.agregarCliente(this.cliente1);
		assertEquals(this.banco.getClientes().size(), 1);
	}
	
	@Test
	void verificacionDeCuandoUnBancoAgregaUnaSolicitudDeCredito() {
		this.banco.agregarSolicitudDeCredito(solicitudDeCredito1);
		assertEquals(this.banco.getSolicitudesDeCreditos().size(), 1);
	}
}