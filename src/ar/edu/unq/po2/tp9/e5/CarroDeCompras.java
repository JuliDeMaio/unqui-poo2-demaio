package ar.edu.unq.po2.tp9.e5;

import java.util.List;

public class CarroDeCompras {

	private List<Product> products;

	public List<Product> getElements() {
		return products;
	}

	public void setElements(List<Product> products) {
		this.products = products;
	}
	
	public int totalRounded() {
		return (int) Math.round(this.total());
	}
	
	public float total() {
		return (float) this.getElements()
				   		   .stream()
				   		   .mapToDouble(ps -> ps.getPrice())
				   		   .sum();
	}
}
