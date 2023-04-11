package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCaja {
	
	
	private ProductoEmpresaTradicional banana;
	private ProductoEmpresaTradicional cereales;
	private Caja caja1;
	
	@BeforeEach
	public void setUp() {
	   banana = new ProductoEmpresaTradicional("Banana", 150d);
	   cereales = new ProductoEmpresaTradicional("Cereales", 800d);
	   caja1 = new Caja(1);
	}
	
	@AfterEach
	public void tearDown() {
		banana = new ProductoEmpresaTradicional("Banana", 150d);
		cereales = new ProductoEmpresaTradicional("Cereales", 800d);
		caja1 = new Caja(1);
	}
	
	@Test
	public void verificarMontoTotalDeCaja() {
		caja1.agregarProducto(banana);
		caja1.agregarProducto(cereales);
		assertEquals(950d, caja1.montoTotalAPagar());
	}
}

