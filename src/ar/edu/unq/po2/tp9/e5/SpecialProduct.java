package ar.edu.unq.po2.tp9.e5;

public class SpecialProduct extends Product {
	
	public float getPrice() {
		return super.getPrice() - 1f; 				// Deberia hacer algo mas.
	}
}
