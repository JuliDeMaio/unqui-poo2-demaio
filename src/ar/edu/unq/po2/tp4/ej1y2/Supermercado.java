package ar.edu.unq.po2.tp4.ej1y2;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

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

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public void agregarProducto(Producto productoNuevo) {
		getProductos().add(productoNuevo);
		
	}

	public Double getPrecioTotal() {
		double precioHastaAhora = 0;
		for (Producto producto : this.getProductos()) {
			precioHastaAhora += producto.getPrecio();
		}
		return precioHastaAhora;
	}

	public Integer getCantidadDeProductos() {
		return getProductos().size();
	}
	
}
