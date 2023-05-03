package ar.edu.unq.po2.tp8.e1;

public enum ColorLesionesDermatologicas {

	ROJO("Manchas", 3, "Gris"), GRIS("Llagas", 5, "Amarillo"), AMARILLO("Sarpullido", 7, "Miel"), MIEL("Lesion profunda", 9, "Rojo");
	
	private String descripcion;
	private int nivelDeRiesgo;
	private String siguienteLesion;
	
	private ColorLesionesDermatologicas(String descripcion, int nivelDeRiesgo, String siguienteLesion) {
		this.setDescripcion(descripcion);
		this.setNivelDeRiesgo(nivelDeRiesgo);
		this.setSiguienteLesion(siguienteLesion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(int nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public String getSiguienteLesion() {
		return siguienteLesion;
	}

	public void setSiguienteLesion(String siguienteLesion) {
		this.siguienteLesion = siguienteLesion;
	}
		
}
