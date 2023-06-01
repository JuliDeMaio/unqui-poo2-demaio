package ar.edu.unq.po2.parcialPoliza;

public class EstadoPolizaCerrada extends EstadoPoliza {

	public EstadoPolizaCerrada(Poliza poliza) {
		super(poliza);
	}

	public void agregarItem(Item item) {
		this.getPoliza().addItem(item);
		this.getPoliza().addGastoAdministrativo(new GastoAdministrativo("Recargo Por Extensión", (item.getValorPorUnidad() * 0.3)));
	}
	
	public void pagar() {
		this.getPoliza().setEstadoPoliza(new EstadoPolizaVigente(this.getPoliza()));
	}
	
	public void aplicarDescuento() {
		this.getPoliza().deleteGastoAdministrativo(this.getPoliza().gastoAdministrativoMasAlto());
	}