package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
		
		public double montoTotalAPagar(ArrayList<IPagable> pagables) {
			return pagables.stream().mapToDouble(p -> p.registrarse()).sum();
		}
}

