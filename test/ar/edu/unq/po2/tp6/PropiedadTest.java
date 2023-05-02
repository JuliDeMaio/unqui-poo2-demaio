package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadTest {

	private Propiedad propiedad;

	@BeforeEach
	void setUp() throws Exception {
		propiedad = new Propiedad("Departamento de 100 metros cuadrados", 120000f, "Avenida SiempreViva 2142");
	}

	@Test
	void verificacionDeInicializacionDeUnaPropiedad() {
		assertEquals(this.propiedad.getDescripcion(), "Departamento de 100 metros cuadrados");
		assertEquals(this.propiedad.getValorFiscal(), 120000f);
		assertEquals(this.propiedad.getDireccion(), "Avenida SiempreViva 2142");
	}
}

