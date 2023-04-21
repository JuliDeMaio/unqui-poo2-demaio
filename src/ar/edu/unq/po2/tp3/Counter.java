package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {

	private List<Integer> numbers;


	public Counter() {
		super();
		this.numbers = new ArrayList<Integer>();
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	public void addNumber(int number) {
		this.numbers.add(number);
	}
	
	public int getEvenOcurrences() {	
		return numbers.stream().filter(number -> this.isEven(number)).collect(Collectors.toList()).size(); 
	}
	
	public boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
	public int getOddOcurrences() {
		return numbers.stream().filter(number -> this.isOdd(number)).collect(Collectors.toList()).size(); 
	}

	public boolean isOdd(int number) {
		return !isEven(number);
	}
	
	public int getMultiplesOcurrencesOf(int multiple) {
		return numbers.stream().filter(number -> this.isMultipleOf(number, multiple)).collect(Collectors.toList()).size();
}

	public boolean isMultipleOf(int number, int multiple) {
		return (number % multiple == 0);
		}
	
	public Integer numberWithTheMostEvenDigits() {
		return numbers.stream().max((Integer n1, Integer n2) -> this.evenDigits(n1) - this.evenDigits(n2)).get();
	}
	
	
	public int evenDigits(Integer number) {
		int evenDigitsByNow = 0;
		while(number > 0) {
			if(number % 2 == 0) {
				evenDigitsByNow++;
			} 
			number = number / 10;
		}
		return evenDigitsByNow; 
	}
}

