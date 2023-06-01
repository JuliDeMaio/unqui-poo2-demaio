package ar.edu.unq.po2.parcialPoliza;

public class Item {
	
	private int cantidad;
	private double valorPorUnidad;
	
	public Item(int cantidad, double valorPorUnidad) {
		super();
		this.setCantidad(cantidad);
		this.setValorPorUnidad(valorPorUnidad);
	}

	public int getCantidad() {
		return cantidad;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getValorPorUnidad() {
		return valorPorUnidad;
	}

	private void setValorPorUnidad(double valorPorUnidad) {
		this.valorPorUnidad = valorPorUnidad;
	}

	public double valor() {
		return this.getCantidad() * this.getValorPorUnidad();
	}
}
