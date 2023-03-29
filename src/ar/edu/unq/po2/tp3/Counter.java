package ar.edu.unq.po2.tp3;

import java.util.List;

public class Counter {

	private List<Integer> numeros;

	public List<Integer> getNumeros() {
		return numeros;
	}


	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public int cantidadDeNumerosPares() {
		int cantidadDeNumerosParesHastaAhora =0;
		List<Integer> listaDeNumeros = this.getNumeros();
		
		for(int i = 0; i < listaDeNumeros.size(); i++) {
			if(esPar(listaDeNumeros.get(i))) {
				cantidadDeNumerosParesHastaAhora ++;
			}
		}
		return cantidadDeNumerosParesHastaAhora;
	}
	
	public boolean esPar(Integer numero) {
		return (numero / 2 == 0);
	}
}

