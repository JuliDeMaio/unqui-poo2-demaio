package ar.edu.unq.po2.tp2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest {

	private Empresa empresaNike;
	private EmpleadoPlantaPermanente empleado1;
	private EmpleadoPlantaPermanente empleado2;
	private EmpleadoPlantaTemporaria empleado3;
	private EmpleadoContratado empleado4;
	
	@Before
	public void setUp() {
		this.empleado1 = new EmpleadoPlantaPermanente(4, new EstadoCivilCasado(), LocalDate.of(2020, 8, 7), "Carlos", "Calle falsa 123", LocalDate.of(2000, 8, 7), (float) 2000.00);
		this.empleado2 = new EmpleadoPlantaPermanente(4, new EstadoCivilSoltero(), LocalDate.of(2020, 8, 7), "Pedro", "Calle falsa 182", LocalDate.of(1985, 6, 7), (float) 2000.00);
		this.empleado3 = new EmpleadoPlantaTemporaria(8, LocalDate.of(2021, 5, 2), "Juan", "Calle falsa 223", LocalDate.of(1990, 5, 2), 1500f);
		this.empleado4 = new EmpleadoContratado(123, "Cheque", new EstadoCivilCasado(), "Eminem", "Azcuenaga 234", LocalDate.of(1990, 2, 2), 2000f);
		this.empresaNike = new Empresa("Nike", "2065423", new ArrayList<Empleado>(), new ArrayList<ReciboDeHaberes>());
		empresaNike.agregarEmpleado(empleado1);
		empresaNike.agregarEmpleado(empleado2);
		empresaNike.agregarEmpleado(empleado3);
		empresaNike.agregarEmpleado(empleado4);
	}
	
	@After
	public void tearDown() {
		this.empleado1 = new EmpleadoPlantaPermanente(4, new EstadoCivilCasado(), LocalDate.of(2020, 8, 7), "Carlos", "Calle falsa 123", LocalDate.of(2000, 8, 7), (float) 2000.00);
		this.empleado2 = new EmpleadoPlantaPermanente(4, new EstadoCivilSoltero(), LocalDate.of(2020, 8, 7), "Pedro", "Calle falsa 182", LocalDate.of(1985, 6, 7), (float) 2000.00);
		this.empleado3 = new EmpleadoPlantaTemporaria(8, LocalDate.of(2021, 5, 2), "Juan", "Calle falsa 223", LocalDate.of(1990, 5, 2), 1500f);
		this.empleado4 = new EmpleadoContratado(123, "Cheque", new EstadoCivilCasado(), "Eminem", "Azcuenaga 234", LocalDate.of(1990, 2, 2), 2000f);
		this.empresaNike = new Empresa("Nike", "2065423", new ArrayList<Empleado>(), new ArrayList<ReciboDeHaberes>());
		empresaNike.agregarEmpleado(empleado1);
		empresaNike.agregarEmpleado(empleado2);
		empresaNike.agregarEmpleado(empleado3);
		empresaNike.agregarEmpleado(empleado4);
	}
	
	@Test
	public void testVerificacionDeNombre(){
		assertTrue(empleado1.getNombre() == "Carlos");
	}
	
	@Test 
	public void testVerificacionMontoTotalDeSueldosNetosDeUnaEmpresa(){
		assertEquals(empresaNike.montoTotalDeSueldosNetos(), 7331f);
	}
	
	@Test
	public void testVerificacionCantidadTotalDeRecibosDeHaberes() {
		empresaNike.liquidacionDeSueldos();
		assertEquals(empresaNike.getRecibos().size(), 4);
	}
	
	

}
