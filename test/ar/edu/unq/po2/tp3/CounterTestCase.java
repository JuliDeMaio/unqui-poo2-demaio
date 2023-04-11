package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	public class CounterTestCase {
		
		private Counter counter;
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
		counter = new Counter();
	
	
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
		
		
		this.numbers.add(9517);
		this.numbers.add(8956);
		this.numbers.add(132);
		this.numbers.add(1545);
		this.numbers.add(4985);
		this.numbers.add(1546);
		this.numbers.add(44628);
		this.numbers.add(1568);
		}
		/**
		* Verifica la cantidad de pares
		*/
		
		@Test
		public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
		}
		
		@Test
		public void testNumberWithTheMostEvenDigits() {
			Integer number = counter.numberWithTheMostEvenDigits(this.numbers);
			assertEquals(number, 44628);
		}
}
