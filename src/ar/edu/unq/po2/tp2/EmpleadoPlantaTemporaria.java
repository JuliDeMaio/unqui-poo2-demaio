package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoPlantaTemporaria extends Empleado {

	//Atributos
	private int cantHorasExtras;
	private LocalDate fechaFinContrato;

	//Constructores
	public EmpleadoPlantaTemporaria(int cantHorasExtras, LocalDate fechaFinContrato, String nombre, String direccion, LocalDate fechaDeNacimiento, float sueldoBasico) {
		super(nombre, direccion, fechaDeNacimiento, sueldoBasico);
		this.cantHorasExtras = cantHorasExtras;
		this.fechaFinContrato = fechaFinContrato;
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}

	public LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}

	public void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public float sueldoBruto() {
		// (sueldo básico + hsExtras($40 c/hora)
		return this.getSueldoBasico() + asignacionDeHorasExtrasParaSueldoBruto();
	}

	public float asignacionDeHorasExtrasParaSueldoBruto() {
		return this.cantHorasExtras * valorFijoPorCadaHoraExtraParaSueldoBruto();
	}

	private float valorFijoPorCadaHoraExtraParaSueldoBruto() {
		return 40f;
	}

	@Override
	public float obraSocial() {
		// (10% de su sueldo bruto + $25 si supera los 50 años de edad)
		return this.asignacionPorSueldoBruto() + this.asignacionPorAntiguedad();
	}
	

	private float asignacionPorAntiguedad() {
		//Nos parecio mas legible utilizar un controlador de flujo if en vez de delegar a otros objetos
		float asignacion = 0f;
		 if (this.edad() > 50) {
			 asignacion = 25f;
		}
		return asignacion;
	}

	@Override
	public float aportesJubilatorios() { 
		// (10% sueldo bruto + $5c/hora)
		return this.asignacionPorSueldoBruto() + asignacionDeHorasExtrasParaAportesJubilatorios();
	}

	private float asignacionDeHorasExtrasParaAportesJubilatorios() {
		return this.cantHorasExtras * valorFijoPorCadaHoraExtraParaAportesJubilatorios();
	}

	private float valorFijoPorCadaHoraExtraParaAportesJubilatorios() {
		return 5f;
	}
	public String generarDesglose(ReciboDeHaberes recibo){
		return recibo.generarDesgloseParaEmpleadoPlantaTemporaria(this);
		
	}
}
