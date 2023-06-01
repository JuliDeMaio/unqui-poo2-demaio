package ar.edu.unq.po2.tp9.e3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;

class EjercitoTest {
	
	private Ejercito  ejercito1;
	private Ejercito  ejercito2;
	
	private Caballero caballero;
	
	private Ingeniero ingeniero;
	
	private Point     puntoDeDestino;

	@BeforeEach
	void setUp() {
		ejercito1      = new Ejercito();
		ejercito2      = new Ejercito();
		               
		caballero      = mock(Caballero.class);
		               
		ingeniero      = mock(Ingeniero.class);
		
		puntoDeDestino = mock(Point.class);
	}

	@Test
	void verificacionDeInicializacionDeUnEjercito() {
		assertEquals(0, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(0, this.ejercito1.getUbicacionEnEjeY());
	}
	
	@Test
	void verificacionCuandoUnEjercitoAgregaUnPersonaje() {
		//exercise
		this.ejercito1.agregarPersonaje(this.caballero);
		
		assertEquals(1, this.ejercito1.getPersonajes().size());
	}

	@Test
	void verificacionCuandoUnEjercitoSimpleCamina() {
		//mockeando
		when(this.caballero.getUbicacion()).thenReturn(this.puntoDeDestino);
		when(this.ingeniero.getUbicacion()).thenReturn(this.puntoDeDestino);
		when(this.puntoDeDestino.getX()).thenReturn(4);
		when(this.puntoDeDestino.getY()).thenReturn(9);
	
		//setup
		this.ejercito1.agregarPersonaje(this.caballero);
		this.ejercito1.agregarPersonaje(this.ingeniero);
		
		//exercise
		this.ejercito1.caminar(puntoDeDestino);
		
		//verify
		verify(this.caballero, times(1)).caminar(puntoDeDestino);
		verify(this.ingeniero, times(1)).caminar(puntoDeDestino);
		
		assertEquals(4, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(9, this.ejercito1.getUbicacionEnEjeY());
	}
	
	@Test
	void verificacionCuandoUnEjercitoCompuestoCamina() {
		//mockeando
		when(this.caballero.getUbicacion()).thenReturn(this.puntoDeDestino);
		when(this.ingeniero.getUbicacion()).thenReturn(this.puntoDeDestino);
		when(this.puntoDeDestino.getX()).thenReturn(4);
		when(this.puntoDeDestino.getY()).thenReturn(9);
	
		//setup
		this.ejercito2.agregarPersonaje(caballero);
		
		this.ejercito1.agregarPersonaje(this.ejercito2);
		this.ejercito1.agregarPersonaje(this.ingeniero);
		
		//exercise
		this.ejercito1.caminar(puntoDeDestino);
		
		//verify
		verify(this.caballero, times(1)).caminar(puntoDeDestino);
		verify(this.ingeniero, times(1)).caminar(puntoDeDestino);
		
		assertEquals(4, this.ejercito1.getUbicacionEnEjeX());
		assertEquals(9, this.ejercito1.getUbicacionEnEjeY());
	}
	
	
}