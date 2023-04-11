package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numbers;


	public Counter() {
		super();
		this.setNumbers(new ArrayList<Integer>());
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
		int evenOcurrencesByNow =0;
		List<Integer> numbersToCount = this.getNumbers();
		
		for(int i = 0; i < numbersToCount.size(); i++) {
			if(isEven(numbersToCount.get(i))) {
				evenOcurrencesByNow ++;
			}
		}
		return evenOcurrencesByNow;
	}
	
	public boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
	public int getOddOcurrences() {
		int oddOcurrencesByNow =0;
		List<Integer> numbersToCount = this.getNumbers();
		
		for(int i = 0; i < numbersToCount.size(); i++) {
			if(isOdd(numbersToCount.get(i))) {
				oddOcurrencesByNow ++;
			}
		}
		return oddOcurrencesByNow;
	}

	public boolean isOdd(int number) {
		return !isEven(number);
	}
	
	public int getMultiplesOcurrencesOf(int number, int multiple) {
		
		int multipleOcurrencesByNow = 0;
		List<Integer> numbersToCount = this.getNumbers();
		
		for (int i = 0; i < numbersToCount.size(); i++) {
			if(isMultipleOf(numbersToCount.get(i), multiple)) {
				multipleOcurrencesByNow++;
			}
		}
		return multipleOcurrencesByNow;
}

	public boolean isMultipleOf(int number, int multiple) {
		return (number % multiple == 0);
		}
	
	public Integer numberWithTheMostEvenDigits(List<Integer> numbers) {
		Integer numberWithTheMostEvenDigitsByNow = 0;
		
		for (Integer number : numbers) {
			if(evenDigits(number) > evenDigits(numberWithTheMostEvenDigitsByNow)) {
				numberWithTheMostEvenDigitsByNow = number;
			}
		}
		return numberWithTheMostEvenDigitsByNow;
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

