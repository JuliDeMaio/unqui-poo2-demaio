package ar.edu.unq.po2.tp7.e3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PokerStatus {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		ArrayList<Carta> manoDePoker = new ArrayList<Carta>(5);
		
		manoDePoker.add(carta1);
		manoDePoker.add(carta2);
		manoDePoker.add(carta3);
		manoDePoker.add(carta4);
		manoDePoker.add(carta5);
		
		int cantCartasDelMismoValor  = manoDePoker.stream().filter(s -> carta1.getValor() == s.getValor()).collect(Collectors.toList()).size();
		int cantCartasDelMismoPalo   = manoDePoker.stream().filter(s -> carta1.getPalo()  == s.getPalo()).collect(Collectors.toList()).size();
		
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