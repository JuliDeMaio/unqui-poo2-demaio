package ar.edu.unq.po2.tp5;

public abstract class Producto {
	
	private String nombre;
	private Double precioBase;
	
	public Producto(String nombre, Double precioBase) {
		super();
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	private void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	
	
}
