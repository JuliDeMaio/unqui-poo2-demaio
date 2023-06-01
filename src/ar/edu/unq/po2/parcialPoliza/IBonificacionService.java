package ar.edu.unq.po2.parcialPoliza;

public interface IBonificacionService {
	
	public boolean codigoValido(int codigo);
	public void anularCodigo(int codigo);
	public void notificarTitular(String mailTitular, int codigo);
	
}

