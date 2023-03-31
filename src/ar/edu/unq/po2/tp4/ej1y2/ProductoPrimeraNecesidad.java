package ar.edu.unq.po2.tp4.ej1y2;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double porcentajeDeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double porcentajeDeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.setPorcentajeDeDescuento(porcentajeDeDescuento);
	}
	
	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public void setPorcentajeDeDescuento(double valorPorcentajeDeDescuento) {
		this.porcentajeDeDescuento = valorPorcentajeDeDescuento;
	}
	
	public double getPrecio(){
		return super.getPrecio() * this.getPorcentajeDeDescuento();
	}
}

