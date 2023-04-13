package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCaja {
	
	private ProductoCooperativa polenta;
	private ProductoCooperativa chocolate;
	private ProductoTradicional banana;
	private ProductoTradicional cereales;
	private Caja caja1;
	private Mercado mercado1;
	
	@BeforeEach
	public void setUp() {                                       
	   polenta = new ProductoCooperativa("Polenta", 300d);      
	   chocolate = new ProductoCooperativa("Chocolatin", 500d); 
	   banana = new ProductoTradicional("Banana", 150d);        
	   cereales = new ProductoTradicional("Cereales", 800d);
	   mercado1 = new Mercado("Superchino 45");
	   caja1 = new Caja(1, mercado1);
	}
	
	@AfterEach
	public void tearDown() {
		polenta = new ProductoCooperativa("Polenta", 300d);
		chocolate = new ProductoCooperativa("Chocolatin", 500d);
		banana = new ProductoTradicional("Banana", 150d);
		cereales = new ProductoTradicional("Cereales", 800d);
		mercado1 = new Mercado("Superchino 45");
		caja1 = new Caja(1, mercado1);
	}
	
	@Test
	public void verificarMontoTotalDeCaja() {
		caja1.agregarProducto(banana);
		caja1.agregarProducto(cereales);
		caja1.agregarProducto(polenta);
		caja1.agregarProducto(chocolate);
		assertEquals(1670d, caja1.montoTotalAPagar());
	}
	
	@Test
	public void verificarStockDeUnProducto() {
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(cereales);
		mercado1.agregarProducto(cereales);
		assertEquals(4, mercado1.stockDe(banana));
		assertEquals(2, mercado1.stockDe(cereales));
	}
	
	@Test
	public void verificarStockDeUnProductoDecrementado() {
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(banana);
		mercado1.agregarProducto(cereales);
		mercado1.agregarProducto(cereales);
		caja1.agregarProducto(banana);
		caja1.agregarProducto(banana);
		caja1.agregarProducto(cereales);
		assertEquals(2, mercado1.stockDe(banana));
		assertEquals(1, mercado1.stockDe(cereales));
	}
	
	
}

