package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	
	private Cliente clienteSolicitante;
	private float   montoSolicitado;
	private int     plazoEnMeses;
	private boolean esAceptada; 
	
	public SolicitudDeCredito(Cliente clienteSolicitante, float montoSolicitado, int plazoEnMeses) {
		this.setClienteSolicitante(clienteSolicitante);
		this.setMontoSolicitado(montoSolicitado);
		this.setPlazoEnMeses(plazoEnMeses);
		this.setEsAceptada(false);
	}
	
	
	public Cliente getClienteSolicitante() {
		return clienteSolicitante;
	}

	public void setClienteSolicitante(Cliente clienteSolicitante) {
		this.clienteSolicitante = clienteSolicitante;
	}

	public float getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(float montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public boolean getEsAceptada() {
		return esAceptada;
	}

	public void setEsAceptada(boolean esAceptada) {
		this.esAceptada = esAceptada;
	}

	public Float montoCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}


	public void verificarSolicitudDeCredito() {
		this.setEsAceptada(this.resultadoDeVerificacion());	
	}

	public abstract boolean resultadoDeVerificacion();
	
}
