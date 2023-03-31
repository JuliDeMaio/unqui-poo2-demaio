package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class ReciboDeHaberes {
	
		//Atributos
		private String nombreEmpleado;
		private String direccionEmpleado;
		private LocalDate fechaDeEmision;
		private float sueldoBruto;
		private float sueldoNeto;
		private String desgloseDeConceptos;
		
		
		public String getDesgloseDeConceptos() {
			return desgloseDeConceptos;
		}

		public void setDesgloseDeConceptos(String desgloseDeConceptos) {
			this.desgloseDeConceptos = desgloseDeConceptos;
		}

		public ReciboDeHaberes(String nombreEmpleado, String direccionEmpleado, LocalDate fechaDeEmision, float sueldoBruto,
								float sueldoNeto, String desgloseDeConceptos) {
			super();
			this.nombreEmpleado = nombreEmpleado;
			this.direccionEmpleado = direccionEmpleado;
			this.fechaDeEmision = fechaDeEmision;
			this.sueldoBruto = sueldoBruto;
			this.sueldoNeto = sueldoNeto;
			this.desgloseDeConceptos = desgloseDeConceptos;
		}

		public ReciboDeHaberes() {
		}

		public ReciboDeHaberes crearReciboPara(Empleado empleado) {
			ReciboDeHaberes recibo = new ReciboDeHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(), empleado.sueldoBruto(), empleado.sueldoNeto(), this.generarDesglosePara(empleado));
			return recibo;
		}
		
		public String generarDesglosePara(Empleado empleado) {
			return empleado.generarDesglose(this);
			
		}
		
		public String generarDesgloseParaEmpleadoPlantaTemporaria(EmpleadoPlantaTemporaria empleadodePlantaTemporaria) {
			return "Desglose de conceptos:" + "\n"
					+ "Tipo de empleado: Empleado de planta permanente" + "\n"
					+ "Nombre del empleado: " + empleadodePlantaTemporaria.getNombre() + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Basico: " + String.valueOf(empleadodePlantaTemporaria.getSueldoBasico()) + "\n" 
					+ "Horas extras: " + String.valueOf(empleadodePlantaTemporaria.asignacionDeHorasExtrasParaSueldoBruto()) + "\n"
					+ "Sueldo Bruto Total: " + String.valueOf(empleadodePlantaTemporaria.sueldoBruto()) + "\n" + "------------------------------------------------" + "\n"
					+ "Obra Social: " + String.valueOf(empleadodePlantaTemporaria.obraSocial()) + "\n"
					+ "Aportes Jubilatorios: " + String.valueOf(empleadodePlantaTemporaria.aportesJubilatorios()) + "\n"
					+ "Retenciones Total: " + String.valueOf(empleadodePlantaTemporaria.retenciones())  + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Neto Total: " + String.valueOf(empleadodePlantaTemporaria.sueldoNeto());
		}
		
		public String generarDesgloseParaEmpleadoContratado(EmpleadoContratado empleadoContratado) {
			return 	"Desglose de conceptos:" + "\n" 
					+ "Tipo de empleado: Empleado Contratado" + "\n"
					+ "Nombre del empleado: " + empleadoContratado.getNombre() + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Bruto Total: " + String.valueOf(empleadoContratado.sueldoBruto()) + "\n" + "------------------------------------------------" + "\n"
					+ "Gastos Administrativos Contractuales: " + String.valueOf(empleadoContratado.gastosAdministrativosContractuales()) + "\n"
					+ "Retenciones Total: " + String.valueOf(empleadoContratado.retenciones())  + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Neto Total: " + String.valueOf(empleadoContratado.sueldoNeto());
		}

		public String generarDesgloseParaEmpleadoPlantaPermanente(EmpleadoPlantaPermanente empleadoPlantaPermanente) {
			return "Desglose de conceptos:" + "\n"
					+ "Tipo de empleado: Empleado de planta permanente" + "\n"
					+ "Nombre del empleado: " + empleadoPlantaPermanente.getNombre() + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Basico: " + String.valueOf(empleadoPlantaPermanente.getSueldoBasico()) + "\n" 
					+ "Salario Familiar: " + String.valueOf(empleadoPlantaPermanente.salarioFamiliar()) + "\n" 
					+ "Antiguedad: " + String.valueOf(empleadoPlantaPermanente.asignacionPorAntiguedad()) + "\n"
					+ "Sueldo Bruto Total: " + String.valueOf(empleadoPlantaPermanente.sueldoBruto()) + "\n" + "------------------------------------------------" + "\n"
					+ "Obra Social: " + String.valueOf(empleadoPlantaPermanente.obraSocial()) + "\n"
					+ "Aportes Jubilatorios: " + String.valueOf(empleadoPlantaPermanente.aportesJubilatorios()) + "\n"
					+ "Retenciones Total: " + String.valueOf(empleadoPlantaPermanente.retenciones())  + "\n" + "------------------------------------------------" + "\n"
					+ "Sueldo Neto Total: " + String.valueOf(empleadoPlantaPermanente.sueldoNeto());
		}

		@Override
		public String toString() {
			return "ReciboDeHaberes [desgloseDeConceptos=" + desgloseDeConceptos + "]";
		}
}
