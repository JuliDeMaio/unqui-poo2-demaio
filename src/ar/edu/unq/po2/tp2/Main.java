package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		EmpleadoPlantaPermanente empleadoPP = new EmpleadoPlantaPermanente(4, new EstadoCivilCasado(), LocalDate.of(2020, 8, 7), "Carlos", "Calle falsa 123", LocalDate.of(2000, 8, 7), (float) 2000.00);
		EmpleadoPlantaTemporaria empleadoPT = new EmpleadoPlantaTemporaria(8, LocalDate.of(2021, 5, 2), "Juan", "Calle falsa 223", LocalDate.of(1990, 5, 2), 1500f);
		EmpleadoContratado empleadoC = new EmpleadoContratado(123, "Cheque", new EstadoCivilCasado(), "Eminem", "Azcuenaga 234", LocalDate.of(1990, 2, 2), 2000f);
		Empresa empresaNike = new Empresa("Nike", "2065423", new ArrayList<Empleado>(), new ArrayList<ReciboDeHaberes>());
		empresaNike.agregarEmpleado(empleadoC);
		empresaNike.agregarEmpleado(empleadoPT);
		empresaNike.agregarEmpleado(empleadoPP);
		empresaNike.liquidacionDeSueldos();
		
		System.out.println(empresaNike.getRecibos());
	}
}