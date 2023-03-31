package ar.edu.unq.po2.tp4.ej1y2;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return (double) precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public void aumentarPrecio(double precioNuevo) {
		this.setPrecio(this.getPrecio() + precioNuevo);
		
	}
	
}
