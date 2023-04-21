package ar.edu.unq.po2.tp6;

public class Propiedad {
	
	private String descripcion;
	private float  valorFiscal;
	private String direccion;
	
	
	public Propiedad(String descripcion, float valorFiscal, String direccion) {
		super();
		this.setDescripcion(descripcion);
		this.setValorFiscal(valorFiscal);
		this.setDireccion(direccion);
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
}
