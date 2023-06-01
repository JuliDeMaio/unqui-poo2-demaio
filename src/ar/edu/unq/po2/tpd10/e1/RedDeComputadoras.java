package ar.edu.unq.po2.tpd10.e1;

public class RedDeComputadoras {

	private IEncriptadorNaive strategy;

	public void setStrategy(IEncriptadorNaive strategy) {
		this.strategy = strategy;
	}
	
	public String encriptarMensaje(String string) {
		return strategy.encriptar(string);
	}

	public String desencriptarMensaje(String string) {
		return strategy.desencriptar(string);
	} 
}
