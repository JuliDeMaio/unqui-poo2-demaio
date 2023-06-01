package ar.edu.unq.po2.tp9.e2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaMixtaTest {
	
	private ParcelaMixta parcelaMixta1;
	private ParcelaMixta parcelaMixta2;
	private ParcelaPura parcelaPura1;
	private ParcelaPura parcelaPura2;
	private ParcelaPura parcelaPura3;
	private ParcelaPura parcelaPura4;

	@BeforeEach
	void setUp() {
		parcelaMixta1 = new ParcelaMixta();
		parcelaMixta2 = new ParcelaMixta();
		parcelaPura1 = mock(ParcelaPura.class);
		parcelaPura2 = mock(ParcelaPura.class);
		parcelaPura3 = mock(ParcelaPura.class);
		parcelaPura4 = mock(ParcelaPura.class);
	}

	@Test
	void verificacionDeInicializacionDeUnaParcelaMixta() {
		assertEquals(0, this.parcelaMixta1.getParcelas().size());
	}
	
	@Test
	void verificacionCuandoSeAgregaUnaParcelaAParcelaMixtaSusParcelasAumentan() {
		//exercise
		this.parcelaMixta1.agregarParcela(parcelaPura1);
		assertEquals(1, this.parcelaMixta1.getParcelas().size());
	}
	
	@Test
	void verificacionCuandoSeRemuveUnaParcelaAParcelaMixtaSusParcelasDisminuyen() {
		//setup
		this.parcelaMixta1.agregarParcela(parcelaPura1);
		
		//exercise
		this.parcelaMixta1.eliminarParcela(parcelaPura1);
		
		assertEquals(0, this.parcelaMixta1.getParcelas().size());
	}
	
	@Test
	void verificacionCuandoUnaParcelaMixtaSeCreaNoTieneValorAnual() {
		assertEquals(0, this.parcelaMixta1.obtenerGananciaAnual());
	}
	
	@Test
	void verificacionValorAnualTotalDeUnaParcelaMixtaQueSoloTieneParcelasPuras() {
		//mockeando
		when(this.parcelaPura1.obtenerGananciaAnual()).thenReturn(300d);
		when(this.parcelaPura2.obtenerGananciaAnual()).thenReturn(500d);
		when(this.parcelaPura3.obtenerGananciaAnual()).thenReturn(500d);
		when(this.parcelaPura4.obtenerGananciaAnual()).thenReturn(300d);
		
		//setup
		parcelaMixta1.agregarParcela(parcelaPura1);
		parcelaMixta1.agregarParcela(parcelaPura2);
		parcelaMixta1.agregarParcela(parcelaPura3);
		parcelaMixta1.agregarParcela(parcelaPura4);
		
		double gananciaAnualTotalEsperada = 1600d;
		
		assertEquals(gananciaAnualTotalEsperada, this.parcelaMixta1.obtenerGananciaAnual());
	}
	
	@Test
	void verificacionValorAnualTotalDeUnaParcelaMixtaQueTieneParcelasPurasYMixtas() {
		//mockeando
		when(this.parcelaPura1.obtenerGananciaAnual()).thenReturn(300d);
		when(this.parcelaPura2.obtenerGananciaAnual()).thenReturn(500d);
		when(this.parcelaPura3.obtenerGananciaAnual()).thenReturn(300d);
		
		//setup
		parcelaMixta2.agregarParcela(parcelaPura1);
		parcelaMixta2.agregarParcela(parcelaPura2);
		
		parcelaMixta1.agregarParcela(parcelaPura3);
		parcelaMixta1.agregarParcela(parcelaMixta2);
		
		double gananciaAnualTotalEsperada = 1100d;
		
		assertEquals(gananciaAnualTotalEsperada, this.parcelaMixta1.obtenerGananciaAnual());
	}

}