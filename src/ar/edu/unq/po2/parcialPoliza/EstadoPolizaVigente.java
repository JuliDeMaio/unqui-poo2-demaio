package ar.edu.unq.po2.parcialPoliza;

public class EstadoPolizaVigente extends EstadoPoliza {

	public EstadoPolizaVigente(Poliza poliza) {
		super(poliza);
	}

	public void agregarItem(Item item) {
		this.getPoliza().addItem(item);
		this.cancelar();
	}
	
	public void cancelar() {
		this.getPoliza().eliminarTodosLosGastosAdministrativos();
		this.getPoliza().setEstadoPoliza(new EstadoPolizaAbierta(this.getPoliza()));
	}
	
	public void aplicarDescuento() {
		this.getPoliza().eliminarTodosLosGastosAdministrativos();
	}
