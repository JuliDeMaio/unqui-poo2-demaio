package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {

		private int numeroDeCaja;
		private ArrayList<ProductoTradicional> productos;
		private Mercado mercadoDueño;
		
		public Caja(int numeroDeCaja, Mercado mercadoDueño) {
			super();
			this.setNumeroDeCaja(numeroDeCaja);
			this.setProductos(new ArrayList<ProductoTradicional>());
			this.setMercadoDueño(mercadoDueño); 
		}
		
		public Mercado getMercadoDueño() {
			return mercadoDueño;
		}

		public void setMercadoDueño(Mercado mercadoDueño) {
			this.mercadoDueño = mercadoDueño;
		}

		public int getNumeroDeCaja() {
			return numeroDeCaja;
		}

		public void setNumeroDeCaja(int numeroDeCaja) {
			this.numeroDeCaja = numeroDeCaja;
		}
		
		public ArrayList<ProductoTradicional> getProductos() {
			return productos;
		}

		public void setProductos(ArrayList<ProductoTradicional> productos) {
			this.productos = productos;
		}
		
		public void agregarProducto(ProductoTradicional producto) {
			this.getProductos().add(producto);
			this.getMercadoDueño().decrementarProducto(producto);
		}

		public Double montoTotalAPagar() {
			return this.productos.stream().mapToDouble(p -> p.getPrecioBase()).sum();
		}
}

