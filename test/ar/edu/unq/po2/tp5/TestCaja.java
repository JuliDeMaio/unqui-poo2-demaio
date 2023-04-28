package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCaja {

	private Producto producto1;
	private ProductoCooperativa producto2;
	private Producto producto3;
	private ProductoCooperativa producto4;
	
	private ArrayList<IPagable> pagables1; 
	private ArrayList<IPagable> pagables2; 
	private ArrayList<IPagable> pagables3; 
	private ArrayList<IPagable> pagables4; 
	
	private Caja caja1;
	
	private Servicio servicio1;
	private Servicio servicio2;
	private Servicio servicio3;
	private Servicio servicio4;
	
	private Impuesto impuesto1;
	private Impuesto impuesto2;
	private Impuesto impuesto3;
	private Impuesto impuesto4;
	
	@BeforeEach 
	void setUp(){
		pagables1  = new ArrayList<IPagable>();
		pagables2  = new ArrayList<IPagable>();
		pagables3  = new ArrayList<IPagable>();
		pagables4  = new ArrayList<IPagable>();
		
		producto1 = new Producto("Casancrem", 950, 10);
		producto2 = new ProductoCooperativa("Leche", 300, 20); //270
		producto3 = new Producto("Pepsi", 400, 20);
		producto4 = new ProductoCooperativa("Polenta", 150, 30); //135
		
		caja1     = new Caja();
		
		servicio1 = new Servicio(100, 200); //20000
        servicio2 = new Servicio(150, 500); //75000
        servicio3 = new Servicio(300, 700); //210000
        servicio4 = new Servicio(470, 800); //376000 
        
        impuesto1 = new Impuesto(150);
        impuesto2 = new Impuesto(300);
        impuesto3 = new Impuesto(360);
        impuesto4 = new Impuesto(620);
		
		pagables1.add(producto1);
		pagables1.add(producto2);
		pagables1.add(producto3);
		pagables1.add(producto4);
        
        //------------------------
        
		pagables2.add(producto1);
		pagables2.add(producto2);
		pagables2.add(producto3);
        pagables2.add(producto4);
        
        pagables2.add(servicio1);
        pagables2.add(servicio2);
        pagables2.add(servicio3);
        pagables2.add(servicio4);
        
        //------------------------
        
        pagables3.add(producto1);
        pagables3.add(producto2);
        pagables3.add(producto3);
        pagables3.add(producto4);
        
        pagables3.add(impuesto1);
        pagables3.add(impuesto2);
        pagables3.add(impuesto3);
        pagables3.add(impuesto4);
        
        //------------------------
        
        pagables4.add(producto1);
        pagables4.add(producto2);
        pagables4.add(producto3);
        pagables4.add(producto4);
        
        pagables4.add(servicio1);
        pagables4.add(servicio2);
        pagables4.add(servicio3);
        pagables4.add(servicio4);
        
        pagables4.add(impuesto1);
        pagables4.add(impuesto2);
        pagables4.add(impuesto3);
        pagables4.add(impuesto4);
        
	}
	
	@Test
    void testPrecioTotalDeProductos(){
        assertEquals(1755, caja1.montoTotalAPagar(pagables1));
    }

	@Test
	void testStockTotalDeProductos(){
		caja1.montoTotalAPagar(pagables1);
		assertEquals(9,  producto1.getStock());
		assertEquals(19, producto2.getStock());
		assertEquals(19, producto3.getStock());
		assertEquals(29, producto4.getStock());
	}
	
	@Test
	void testPrecioTotalDeProductosConServicios(){
	    assertEquals(682755, caja1.montoTotalAPagar(pagables2));
	}
	    
	@Test
	void testPrecioTotalConImpuestos(){
	   assertEquals(3185, caja1.montoTotalAPagar(pagables3));
	}
	    
	@Test
	void testPrecioTotal(){
	   assertEquals(684185, caja1.montoTotalAPagar(pagables4));
	}
}