package ar.edu.unq.po2.tp5;

public class Producto implements IPagable {
	
	private String nombre;
	private double precio;
	private int stock;

	public Producto(String nombre, double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public Producto(String nombre, double precio, int stock) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double registrarse() {
		reducirStock();
		return this.getPrecio();
	}

	private void reducirStock() {
		this.setStock(getStock() - 1);
		
	}
	
	
	
}
