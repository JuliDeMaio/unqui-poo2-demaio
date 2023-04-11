package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.HashMap;

public class Mercado {
	
	private String nombre;
	private HashMap<Producto, Integer> productos;
	private ArrayList<Caja> cajas;
	
	public Mercado(String nombre) {
		super();
		this.setNombre(nombre);
		this.setProductos(productos);
		this.setCajas(cajas);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Producto, Integer> getProductos() {
		return productos;
	}

	private void setProductos(HashMap<Producto, Integer> productos) {
		this.productos = productos;
	}

	public ArrayList<Caja> getCajas() {
		return cajas;
	}

	private void setCajas (ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}
	
	
	
	
	
	
	
}
