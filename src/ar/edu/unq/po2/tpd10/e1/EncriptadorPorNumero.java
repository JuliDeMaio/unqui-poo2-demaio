package ar.edu.unq.po2.tpd10.e1;

public class EncriptadorPorNumero implements IEncriptadorNaive {

	@Override
	public String encriptar(String mensajeAEncriptar) {

		StringBuilder sb = new StringBuilder();
	    mensajeAEncriptar = mensajeAEncriptar.toLowerCase();
	    
	    for (int i = 0; i < mensajeAEncriptar.length(); i++) {
	    	char c = mensajeAEncriptar.charAt(i);
	    	if (c == ' ') {
	    		sb.append("0,");
	        } else {
	        	sb.append((int) c - 96).append(",");
	        }
	    }
	    
	    return sb.toString().substring(0, sb.length() - 1);
	}

	@Override
	public String desencriptar(String mensajeADesencriptar) {
		
		StringBuilder sb = new StringBuilder();
        String[] numeros = mensajeADesencriptar.split(",");
        
        for (String numero : numeros) {
            if (numero.equals("0")) {
                sb.append(" ");
            } else {
                int valor = Integer.parseInt(numero);
                sb.append((char) (valor + 96));
            }
        }
        
        return sb.toString();
	}
}
