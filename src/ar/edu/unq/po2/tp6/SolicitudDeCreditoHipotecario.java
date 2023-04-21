package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	private Propiedad propiedadDeGarantia;
	
	public SolicitudDeCreditoHipotecario(Cliente clienteSolicitante, float montoSolicitado, int plazoEnMeses, Propiedad propiedadDeGarantia) {
		super(clienteSolicitante, montoSolicitado, plazoEnMeses);
		this.setPropiedadDeGarantia(propiedadDeGarantia);
	}
	
	public Propiedad getPropiedadDeGarantia() {
		return propiedadDeGarantia;
	}

	public void setPropiedadDeGarantia(Propiedad propiedadDeGarantia) {
		this.propiedadDeGarantia = propiedadDeGarantia;
	}

	@Override
	public boolean resultadoDeVerificacion() {
		return cumpleConElRequisitoDeSueldoMensual()
			   &&
			   cumpleConElRequisitoDelValorDeLaPropiedad()
			   &&
			   cumpleConElRequisitoDeLaEdad();
	}

	public boolean cumpleConElRequisitoDeLaEdad() {
		return edadAlFinalizarPlazoDelCredito() <= edadSolicitada();
	}

	public int edadSolicitada() {
		return 65;
	}

	public int edadAlFinalizarPlazoDelCredito() {
		return this.getClienteSolicitante().getEdad() + this.getPlazoEnMeses() / 12;
	}

	public boolean cumpleConElRequisitoDelValorDeLaPropiedad() {
		return this.getMontoSolicitado() <= valorFiscalDeLaPropiedadPorPorcentaje();
	}

	public float valorFiscalDeLaPropiedadPorPorcentaje() {
		return (this.getPropiedadDeGarantia().getValorFiscal()) * porcentajeAplicadoAlValorFiscal();
	}

	public float porcentajeAplicadoAlValorFiscal() {
		return 0.7f;
	}

	public boolean cumpleConElRequisitoDeSueldoMensual() {
		return this.montoCuotaMensual() <= sueldoMensualPorPorcentaje();
	}

	public float sueldoMensualPorPorcentaje() {
		return (this.getClienteSolicitante().getSueldoNetoMensual()) * porcentajeAplicadoASueldoMensual();
	}

	public float porcentajeAplicadoASueldoMensual() {
		return 0.5f;
	}
}
