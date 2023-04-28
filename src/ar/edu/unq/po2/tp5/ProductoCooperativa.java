package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	
	public double descuento() {
		return 0.10;
	}
	
	public double getPrecio() {
		return super.getPrecio() - this.descuentoAAplicar();	
	}

	private double descuentoAAplicar() {
		return super.getPrecio() * this.descuento();
	}
	
}
