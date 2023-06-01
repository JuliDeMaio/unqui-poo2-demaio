package ar.edu.unq.po2.parcialPoliza;

public class EstadoPolizaAbierta extends EstadoPoliza {
	
	public EstadoPolizaAbierta(Poliza poliza) {
		super(poliza);
	}

	public void agregarItem(Item item) {
		this.getPoliza().addItem(item);
	}

	public void cerrarInventario() {
		this.getPoliza().setEstadoPoliza(new EstadoPolizaCerrada(this.getPoliza()));
	}

	public void aplicarDescuento() {
		this.getPoliza().addGastoAdministrativo(new GastoAdministrativo("Bonificacion Administrativa", -500d));
	}
}

	
