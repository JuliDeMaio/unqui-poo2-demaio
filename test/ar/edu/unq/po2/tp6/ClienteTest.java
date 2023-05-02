package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente cliente;

	@BeforeEach
	void setUp() throws Exception {
		this.cliente = new Cliente("Guido", "Ventoso", "Av. SiempreViva 2142", 62, 5000f);
	}

	@Test
	void verificacionDeInicializacionDeUnCliente() {
		assertEquals(this.cliente.getNombre(), "Guido");
		assertEquals(this.cliente.getApellido(), "Ventoso");
		assertEquals(this.cliente.getDireccion(), "Av. SiempreViva 2142");
		assertEquals(this.cliente.getEdad(), 62);
		assertEquals(this.cliente.getSueldoNetoMensual(), 5000f);
	}
	
	@Test
	void verificacionDeSueltoNetoAnual() {
		assertEquals(this.cliente.sueldoNetoAnual(), 60000f);
	}
}
