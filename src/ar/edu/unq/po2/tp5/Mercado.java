package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.HashMap;

public class Mercado {
	
	private String nombre;
	private HashMap<ProductoTradicional, Integer> productosConStock;
	private ArrayList<Caja> cajas;
	
	public Mercado(String nombre) {
		super();
		this.setNombre(nombre);
		this.setProductos(new HashMap<ProductoTradicional, Integer>());
		this.setCajas(cajas);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<ProductoTradicional, Integer> getProductos() {
		return productosConStock;
	}

	private void setProductos(HashMap<ProductoTradicional, Integer> productos) {
		this.productosConStock = productos;
	}

	public ArrayList<Caja> getCajas() {
		return cajas;
	}

	private void setCajas (ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}
	
	public Integer stockDe (ProductoTradicional producto) {
		return this.getProductos().get(producto);
	}

	public void agregarProducto(ProductoTradicional producto) {
		this.getProductos().put(producto, stockDespuesDeAgregar(producto)); 
		
	}

	private Integer stockDespuesDeAgregar (ProductoTradicional producto) {
		Integer stockAgregadoHastaAca = 0;
		if (this.getProductos().containsKey(producto)) {
			stockAgregadoHastaAca = this.stockDe(producto) + 1;
		} else { 
			stockAgregadoHastaAca = 1;
		}
		return stockAgregadoHastaAca;
	}

	public void decrementarProducto(ProductoTradicional producto) {
		this.getProductos().put(producto, stockDespuesDeDecrementar(producto)); 
		}

	private Integer stockDespuesDeDecrementar(ProductoTradicional producto) {
		Integer stockDecrementadoHastaAca = 0;
		if (this.getProductos().containsKey(producto)) {
			stockDecrementadoHastaAca = this.stockDe(producto) - 1;
		}
		return stockDecrementadoHastaAca;
	}
}
