package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {

		private int numeroDeCaja;
		private ArrayList<Producto> productos;
		
		public Caja(int numeroDeCaja) {
			super();
			this.numeroDeCaja = numeroDeCaja;
			this.productos = new ArrayList<Producto>();
		}
		
		public int getNumeroDeCaja() {
			return numeroDeCaja;
		}

		public void setNumeroDeCaja(int numeroDeCaja) {
			this.numeroDeCaja = numeroDeCaja;
		}
		
		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}
		
		public void agregarProducto(Producto producto) {
			this.productos.add(producto);
		}

		public Double montoTotalAPagar() {
			return this.productos.stream().mapToDouble(p -> p.getPrecioBase()).sum();
				}
}	

