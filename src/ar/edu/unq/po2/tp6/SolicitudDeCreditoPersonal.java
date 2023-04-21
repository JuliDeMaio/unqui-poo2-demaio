package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Cliente clienteSolicitante, float montoSolicitado, int plazoEnMeses) {
		super(clienteSolicitante, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean resultadoDeVerificacion() {
		return cumpleConElRequisitoDeSueldoAnual() 
				&&
			   cumpleConElRequisitoDeSueldoMensual();
	}

	public boolean cumpleConElRequisitoDeSueldoMensual() {
		return this.montoCuotaMensual() <= sueldoPorPorcentajeDeIngresoMensual();
	}

	public float sueldoPorPorcentajeDeIngresoMensual() {
		return (this.getClienteSolicitante().getSueldoNetoMensual()) * porcentajeAplicadoDeIngresoMensual();
	}

	public float porcentajeAplicadoDeIngresoMensual() {
		return 0.7f;
	}

	public boolean cumpleConElRequisitoDeSueldoAnual() {
		return this.getClienteSolicitante().sueldoNetoAnual() >= umbralMinimoDeIngresoAnual();
	}

	public float umbralMinimoDeIngresoAnual() {
		return 15000f;
	}
	
	

}
