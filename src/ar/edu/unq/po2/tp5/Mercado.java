package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.HashMap;

public class Mercado {
	
	private String nombre;
	private HashMap<Producto, Integer> productosConStock;
	private ArrayList<Caja> cajas;
	
	public Mercado(String nombre) {
		super();
		this.setNombre(nombre);
		this.setProductos(new HashMap<Producto, Integer>());
		this.setCajas(cajas);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Producto, Integer> getProductos() {
		return productosConStock;
	}

	private void setProductos(HashMap<Producto, Integer> productos) {
		this.productosConStock = productos;
	}

	public ArrayList<Caja> getCajas() {
		return cajas;
	}

	private void setCajas (ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}
	
	public Integer stockDe (Producto producto) {
		return this.getProductos().get(producto);
	}

	public void agregarProducto(Producto producto) {
		this.getProductos().put(producto, stockDespuesDeAgregar(producto)); 
		
	}

	private Integer stockDespuesDeAgregar (Producto producto) {
		Integer stockAgregadoHastaAca = 0;
		if (this.getProductos().containsKey(producto)) {
			stockAgregadoHastaAca = this.stockDe(producto) + 1;
		} else { 
			stockAgregadoHastaAca = 1;
		}
		return stockAgregadoHastaAca;
	}

	public void decrementarProducto(Producto producto) {
		this.getProductos().put(producto, stockDespuesDeDecrementar(producto)); 
		}

	private Integer stockDespuesDeDecrementar(Producto producto) {
		Integer stockDecrementadoHastaAca = 0;
		if (this.getProductos().containsKey(producto)) {
			stockDecrementadoHastaAca = this.stockDe(producto) - 1;
		}
		return stockDecrementadoHastaAca;
	}
}
