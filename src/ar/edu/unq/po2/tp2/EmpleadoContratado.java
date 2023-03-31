package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {

	private int numeroDeContrato;
	private String medioDePago;
	private EstadoCivil estadoCivil;
	
	public EmpleadoContratado(int numeroDeContrato, String medioDePago, EstadoCivil estadoCivil, String nombre, String direccion, LocalDate fechaDeNacimiento, float sueldoBasico) {
		super(nombre, direccion, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
		this.estadoCivil = estadoCivil;
	}

	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(int numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public float retenciones() {
		return gastosAdministrativosContractuales();
	}
	
	public float gastosAdministrativosContractuales() {
		return 50f;
	}
	

	/**
	 * Los siguientes métodos se ven modificados devolviendo 0(cero),
	 * ya que son utilizadas por sus clases hermanas(EmpleadoPlantaPermanente y EmpleadoPlantaTemporaria), pero no por ella misma.
	 **/
	
	@Override
	public float obraSocial() {
		return 0;
	}

	@Override
	public float aportesJubilatorios() {
		return 0;
	}
	
	
	@Override
	public float porcentajeFijoDeSueldoBrutoParaObraSocial() {
		return 0;
	}
	
	@Override
	public float asignacionPorSueldoBruto() {
		return 0;
	}
	
	public String generarDesglose(ReciboDeHaberes recibo){
		return recibo.generarDesgloseParaEmpleadoContratado(this);
	}
}
