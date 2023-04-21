package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	public class CounterTestCase {
		
		private Counter counter;
		private Counter otherCounter;
		private List<Integer> numbers;
		
		/**
		* Crea un escenario de test básico, que consiste en un contador
		* con 10 enteros
		*
		* @throws Exception
		*/
		
		@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter      = new Counter();
		otherCounter = new Counter();
		
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
		otherCounter.addNumber(104);
		otherCounter.addNumber(244);
		otherCounter.addNumber(109);
		otherCounter.addNumber(681);
	}
		
		/**
		* Verifica la cantidad de pares
		*/
		
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(1, amount);
	}
		
	@Test
	public void testMultiplesOf() {
		int amount = counter.getMultiplesOcurrencesOf(3);
		assertEquals(2, amount);
	}
		
	@Test
	public void testNumberWithTheMostEvenDigits() {
		Integer number = otherCounter.numberWithTheMostEvenDigits();
		assertEquals(number, 244);
	}
}
