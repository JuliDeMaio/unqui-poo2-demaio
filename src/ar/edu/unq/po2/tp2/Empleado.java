package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public abstract class Empleado {
	
	//Atributos
	private String nombre;
	private String direccion;
	private LocalDate fechaDeNacimiento;
	private float sueldoBasico;
	
	//Constructores
	protected Empleado() {
	}
	
	protected Empleado(String nombre, String direccion, LocalDate fechaDeNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	//Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int edad(){
		return (int) ChronoUnit.YEARS.between(getFechaDeNacimiento(), LocalDate.now());
	}
	
	public float sueldoNeto(){
		return this.sueldoBruto() - this.retenciones();
	}
	
	public float retenciones(){
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	public abstract float sueldoBruto();
	public abstract float obraSocial();
	public abstract float aportesJubilatorios();

	protected float porcentajeFijoDeSueldoBrutoParaObraSocial() {
		return 0.1f;
	}
	
	protected float asignacionPorSueldoBruto() {
		return this.sueldoBruto() * porcentajeFijoDeSueldoBrutoParaObraSocial();
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", direccion=" + direccion + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", sueldoBasico=" + sueldoBasico + "]";
	}

	public abstract String generarDesglose(ReciboDeHaberes recibo);
}
