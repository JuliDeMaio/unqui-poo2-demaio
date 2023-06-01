package ar.edu.unq.po2.tpd10.e1;

public class EncriptadorPorOrden implements IEncriptadorNaive {

	@Override
	public String encriptar(String mensajeSinEncriptar) {
		return new StringBuilder(mensajeSinEncriptar).reverse().toString();
	}

	@Override
	public String desencriptar(String mensajeSinDesencriptar) {
		return this.encriptar(mensajeSinDesencriptar);
	}
}
