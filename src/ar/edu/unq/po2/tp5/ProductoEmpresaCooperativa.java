package ar.edu.unq.po2.tp5;

public class ProductoEmpresaCooperativa extends Producto {

	public ProductoEmpresaCooperativa(String nombre, Double precioBase) {
		super(nombre, precioBase);
	}
	
	public double descuento() {
		return 0.10;
	}
	
	public double precioConDescuento() {
		return this.getPrecioBase() - descuentoAAplicar();
		
	}

	private double descuentoAAplicar() {
		return this.getPrecioBase() * this.descuento();
	}
	
}
