package ar.edu.unq.po2.tp9.e3;

public class Caballero extends Personaje {
	
	public Caballero() {
		super();
	}

	@Override
	public void caminar(Point punto) {
		this.getUbicacion().movePointTo(punto.getX(), punto.getY());
	}
}