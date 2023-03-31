package ar.edu.unq.po2.tp4.ej3;
import java.time.Month;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ej1y2.Producto;
import ar.edu.unq.po2.tp4.ej1y2.Supermercado;

class TrabajadorTest {
		
	private Trabajador trabajador1;
	private IngresoPorHorasExtras ingreso1;
	private IngresoPorHorasExtras ingreso2;
	private ArrayList<Ingreso> ingresos;
	
	@BeforeEach
	public void setUp() {
	   ingreso1 = new IngresoPorHorasExtras(Month.NOVEMBER, "Sueldo Basico", 2000d, 9);
	   ingreso2 = new IngresoPorHorasExtras(Month.OCTOBER, "Sueldo Basico", 9000d, 14);
	   ingresos = new ArrayList<Ingreso>();
	   ingresos.add(ingreso1);
	   ingresos.add(ingreso2);
	   trabajador1 = new Trabajador(ingresos);
	}
	
	@AfterEach
	public void tearDown() {
	   ingreso1 = new IngresoPorHorasExtras(Month.NOVEMBER, "Sueldo Basico", 2000d, 9);
	   ingreso2 = new IngresoPorHorasExtras(Month.OCTOBER, "Sueldo Basico", 9000d, 14);
	   ingresos = new ArrayList<Ingreso>();
	   ingresos.add(ingreso1);
	   ingresos.add(ingreso2);
	   trabajador1 = new Trabajador(ingresos);
	}
	
	@Test
	public void verificarMontoImponible() {
		assertEquals(11000d, trabajador1.getMontoImponible());
	}
	
	@Test
	public void verificarImpuestoAPagar() {
		assertEquals(220d, trabajador1.getImpuestoAPagar());
	}
	
	@Test
	public void verificarTotalPercibido() {
		assertEquals(11920d, trabajador1.getTotalPercibido());
	}

}
