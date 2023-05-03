package ar.edu.unq.po2.tp7.e2;

public class Carta {

	private int valor;
	private PaloDeCarta palo;
	
	public Carta(int valor, PaloDeCarta palo) {
		super();
		this.setValor(valor);
		this.setPalo(palo);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public PaloDeCarta getPalo() {
		return palo;
	}

	public void setPalo(PaloDeCarta palo) {
		this.palo = palo;
	}
	
	
	
	
}
