package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PokerStatus {


	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {

		ArrayList<String> manoDePoker = new ArrayList<String>(5);
		
		manoDePoker.add(carta1);
		manoDePoker.add(carta2);
		manoDePoker.add(carta3);
		manoDePoker.add(carta4);
		manoDePoker.add(carta5);
		
		int cantCartasDelMismoValor  = manoDePoker.stream().filter(s -> carta1.charAt(0)  == s.charAt(0)).collect(Collectors.toList()).size();
		int cantCartasDelMismoPalo   = manoDePoker.stream().filter(s -> carta1.charAt(1) == s.charAt(1)).collect(Collectors.toList()).size();
		
		String loQueTengo = "Nada";
		
		if (cantCartasDelMismoValor == 4) {
			loQueTengo = "Poker";
		} else if (cantCartasDelMismoPalo == 5){
			loQueTengo = "Color";
		} else if (cantCartasDelMismoValor == 3) {
			loQueTengo = "Trio";;
		}
		return loQueTengo;
	}
}