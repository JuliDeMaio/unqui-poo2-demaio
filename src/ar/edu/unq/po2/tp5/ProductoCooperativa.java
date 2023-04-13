package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoTradicional {

	public ProductoCooperativa(String nombre, Double precioBase) {
		super(nombre, precioBase);
	}
	
	public double descuento() {
		return 0.10;
	}
	
	public Double getPrecioBase() {
		return super.getPrecioBase() - this.descuentoAAplicar();	
	}

	private Double descuentoAAplicar() {
		return super.getPrecioBase() * this.descuento();
	}
	
}
