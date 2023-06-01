package ar.edu.unq.po2.parcialPoliza;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Poliza {

	private List<Item> items;
	private List<GastoAdministrativo> gastosAdministrativos;
	private EstadoPoliza estadoPoliza;
	private IBonificacionService bonificacionService;
	
	public Poliza(IBonificacionService bonificacionService) {
		super();
		this.setItems(new ArrayList<Item>());
		this.setGastosAdministrativos(new ArrayList<GastoAdministrativo>());
		this.setEstadoPoliza(new EstadoPolizaAbierta(this));
		this.setBonificacionService(bonificacionService);
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<GastoAdministrativo> getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	private void setGastosAdministrativos(List<GastoAdministrativo> gastosAdministrativos) {
		this.gastosAdministrativos = gastosAdministrativos;
	}

	public EstadoPoliza getEstadoPoliza() {
		return estadoPoliza;
	}

	void setEstadoPoliza(EstadoPoliza estadoPoliza) {
		this.estadoPoliza = estadoPoliza;
	}
	
	public IBonificacionService getBonificacionService() {
		return bonificacionService;
	}

	public void setBonificacionService(IBonificacionService bonificacionService) {
		this.bonificacionService = bonificacionService;
	}

	public double montoAsegurado() {
		return this.getItems().stream()
					   .mapToDouble(i -> i.valor())
					   .sum();
	}
	
	public double precio() {
		return (this.montoAsegurado() * 0.075) + montoGastosAdministrativos();
	}

	private double montoGastosAdministrativos() {
		return this.getGastosAdministrativos().stream()
													 .mapToDouble(ga -> ga.getMonto())
													 .sum();
	}

	public void addItem(Item item) {
		this.getItems().add(item);
	}

	public void addGastoAdministrativo(GastoAdministrativo gastoAdministrativo) {
		this.getGastosAdministrativos().add(gastoAdministrativo);
	}
	
	
	public Optional<GastoAdministrativo> gastoAdministrativoMasAlto() {
		return this.getGastosAdministrativos().stream().max(Comparator.comparing(GastoAdministrativo::getMonto));
	}
	
	
	public void deleteGastoAdministrativo(Optional<GastoAdministrativo> gastoAdministrativoMasAlto) {
		this.getGastosAdministrativos().remove(gastoAdministrativoMasAlto);
		
	}

	public void eliminarTodosLosGastosAdministrativos() {
		this.getGastosAdministrativos().removeAll(gastosAdministrativos);
	}
	
	
	public void aplicarBono(String mailTitular, int codigo) {
		if (this.getBonificacionService().codigoValido(codigo)) {
			this.getEstadoPoliza().aplicarDescuento();
			this.getBonificacionService().anularCodigo(codigo);
			this.getBonificacionService().notificarTitular(mailTitular, codigo);
		}
	}
		
}

