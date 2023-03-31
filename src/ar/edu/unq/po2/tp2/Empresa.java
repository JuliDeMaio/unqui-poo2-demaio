package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class Empresa {
	
	//Atributos
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados;
	private ArrayList<ReciboDeHaberes> recibos;

	//Constructor
	public Empresa(String nombre, String cuit, ArrayList<Empleado> empleados, ArrayList<ReciboDeHaberes> recibos) {
		this.nombre    = nombre;
		this.cuit      = cuit;
		this.empleados = empleados;
		this.recibos   = recibos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<ReciboDeHaberes> recibos) {
		this.recibos = recibos;
	}
	
	//Métodos
	
	public void agregarEmpleado(Empleado empleado) {
		this.getEmpleados().add(empleado);
	}
	
	public void liquidacionDeSueldos() {
		this.getRecibos().clear();
		for(Empleado empleado : this.empleados) {
			ReciboDeHaberes recibo = new ReciboDeHaberes();
			agregarRecibo(recibo.crearReciboPara(empleado));
		}
	
	}
	
	private void agregarRecibo(ReciboDeHaberes recibo) {
		this.getRecibos().add(recibo);
	}

	public float montoTotalDeSueldosNetos() {
		float montoResultanteDeSueldosNetos = 0;
		for(Empleado empleado : this.empleados){
			montoResultanteDeSueldosNetos += empleado.sueldoNeto();
			}
		return montoResultanteDeSueldosNetos;
	}
	
	public float montoTotalDeSueldosBrutos() {
		float montoResultanteDeSueldosBrutos = 0;
		for(Empleado empleado : this.empleados){
			montoResultanteDeSueldosBrutos += empleado.sueldoBruto();
			}
		return montoResultanteDeSueldosBrutos;
	}
	
	public float montoTotalDeRetenciones() {
		float montoResultanteDeRetenciones = 0;
		for(Empleado empleado : this.empleados){
			montoResultanteDeRetenciones += empleado.retenciones();
			}
		return montoResultanteDeRetenciones;
	}
	

	@Override
	public String toString() {
		return "Empresa [recibos=" + recibos + "]";
	}
}
