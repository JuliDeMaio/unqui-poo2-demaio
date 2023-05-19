package ar.edu.unq.po2.tpd10.e1;

public class EncriptadorPorVocal implements IEncriptadorNaive{

	@Override
	public String encriptar(String mensajeAEncriptar) {
		
		StringBuilder sb = new StringBuilder();
		mensajeAEncriptar = mensajeAEncriptar.toLowerCase();
        for (int i = 0; i < mensajeAEncriptar.length(); i++) {
            char c = mensajeAEncriptar.charAt(i);
            if (esVocal(c)) {
                sb.append(siguienteVocal(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private char siguienteVocal(char c) {
        switch (c) {
            case 'a': return 'e';
            case 'e': return 'i';
            case 'i': return 'o';
            case 'o': return 'u';
            case 'u': return 'a';
            default: return c;
        }
	}

	@Override
	public String desencriptar(String mensajeADesencriptar) {
		
		StringBuilder sb = new StringBuilder();
		mensajeADesencriptar = mensajeADesencriptar.toLowerCase();
        for (int i = 0; i < mensajeADesencriptar.length(); i++) {
            char c = mensajeADesencriptar.charAt(i);
            if (esVocal(c)) {
                sb.append(vocalPrevia(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private char vocalPrevia(char c) {
        switch (c) {
            case 'a': return 'u';
            case 'e': return 'a';
            case 'i': return 'e';
            case 'o': return 'i';
            case 'u': return 'o';
            default: return c;
        }
	}
}
