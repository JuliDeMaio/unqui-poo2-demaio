package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoPlantaPermanente extends Empleado {

		//Atributos
		private int cantidadDeHijos;
		private EstadoCivil estadoCivil;
		private LocalDate fechaIngreso; // Este atributo no está explícito en la consigna pero fue necesario para calcular la antiguedad del empleado
		
		//Constructores
		public EmpleadoPlantaPermanente(int cantidadDeHijos, EstadoCivil estadoCivil, LocalDate fechaIngreso, String nombre, String direccion, LocalDate fechaDeNacimiento, float sueldoBasico) {
			super(nombre, direccion, fechaDeNacimiento, sueldoBasico);
			this.cantidadDeHijos = cantidadDeHijos;
			this.estadoCivil = estadoCivil;
			this.fechaIngreso = fechaIngreso;
		}

		public LocalDate getFechaIngreso() {
			return fechaIngreso;
		}

		public void setFechaIngreso(LocalDate fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}

		public EstadoCivil getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(EstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public int getCantidadDeHijos() {
			return cantidadDeHijos;
		}

		public void setCantidadDeHijos(int cantidadDeHijos) {
			this.cantidadDeHijos = cantidadDeHijos;
		}

		public float salarioFamiliar() {
		// Asignacion por hijo ($150 c/hijo) + Asignación por conyugue ($100 si tiene)
			return asignacionPorHijoParaSalarioFamiliar() + asignacionPorConyuge();
		}
		
		private float asignacionPorConyuge() {
	        return getEstadoCivil().asignacionPorConyugePara(this);
	    }
		
		public float asignacionCuandoEstaCasado() {
			return 100f;
		}

		public float asignacionCuandoNoEstaCasado() {
			return 0f;
		}

		private float asignacionPorHijoParaSalarioFamiliar() {
			return this.getCantidadDeHijos() * valorFijoPorCadaHijoParaSalarioFamiliar();
		}

		private float valorFijoPorCadaHijoParaSalarioFamiliar() {
			return 150f;
		}

		@Override
		public float sueldoBruto() {
			// sueldo básico + salario familiar + antigüedad
			return this.getSueldoBasico() + this.salarioFamiliar() + asignacionPorAntiguedad();
		}

		public float asignacionPorAntiguedad() {
			return this.antiguedad() * 50;
		}

		private int antiguedad() {
			return (int) ChronoUnit.YEARS.between(getFechaIngreso(), LocalDate.now());
		}

		@Override
		public float obraSocial() {
			return asignacionPorSueldoBruto() + asignacionPorCantidadDeHijosParaObraSocial();
		}


		private float asignacionPorCantidadDeHijosParaObraSocial() {
			return this.cantidadDeHijos * valorFijoPorCadaHijoParaObraSocial();
		}

		private float valorFijoPorCadaHijoParaObraSocial() {
			return 20f;
		}

		@Override
		public float aportesJubilatorios() {
			return this.sueldoBruto() * porcentajeFijoDeSueldoBrutoParaAportesJubilatorios();
		}

		private float porcentajeFijoDeSueldoBrutoParaAportesJubilatorios() {
			return 0.15f;
		}
		
		public String generarDesglose(ReciboDeHaberes recibo){
			return recibo.generarDesgloseParaEmpleadoPlantaPermanente(this);
			
		}
		
}
