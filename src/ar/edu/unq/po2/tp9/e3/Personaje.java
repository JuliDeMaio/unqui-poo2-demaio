package ar.edu.unq.po2.tp9.e3;

public abstract class Personaje {
	
	private Point ubicacion;

	public Personaje() {
		super();
		this.setUbicacion(new Point(0,0));
	}

	public Point getUbicacion() {
		return ubicacion;
	}

	private void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int getUbicacionEnEjeX() {
		return this.ubicacion.getX();
	}
	
	public int getUbicacionEnEjeY() {
		return this.ubicacion.getY();
	}
	
	public abstract void caminar(Point punto);
}
