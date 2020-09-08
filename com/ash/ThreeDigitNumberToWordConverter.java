package com.ash;

public class ThreeDigitNumberToWordConverter {
	
	private static final String[] DIGITS = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private static final String[] TENTHS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private static final String[] TEENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	
	private static final String SPACE = " ";
	private static final String HUNDRED = "Hundred";
	private static final String ZERO = "Zero";
	
	private StringBuilder wordBuilder = new StringBuilder();
	
	public ThreeDigitNumberToWordConverter() {
	
	}
	
	private String getDigit(int digit) {
		return DIGITS[digit];
	}
	
	private String getTeens(int digit) {
		return TEENS[digit];
	}
	
	private String getTenths(int digit) {
		return TENTHS[digit];
	}
	
	public String convertToWord(int number) {
		if(number < 0)
			throw new IllegalArgumentException("Expecting positive number recieved negative number");
		else if(number >= 1000)
			throw new IllegalArgumentException("Expecting number of max 3 digits");
		else if(number == 0)
			return ZERO;
		else {
			wordBuilder.setLength(0);
			return convert(number);
		}
	}
	
	private String convert(int number) {
		int unitsPlace = number % 10;
		int tenthsPlace = (number % 100) / 10;
		int hundredsPlace = (number % 1000) / 100;
		
		setHundredsWord(hundredsPlace);
		setTenthsAndUnitsWord(tenthsPlace, unitsPlace);
		return wordBuilder.toString();
	}
	
	private void setHundredsWord(int hundredsPlace) {
		if(hundredsPlace != 0)
			wordBuilder.append(getDigit(hundredsPlace)).append(SPACE).append(HUNDRED);
	}
	
	private void setTenthsAndUnitsWord(int tenthsPlace, int unitsPlace) {
		if(tenthsPlace != 0) {
			if(tenthsPlace == 1)
				addWord(getTeens(unitsPlace));
			else {
				addWord(getTenths(tenthsPlace));
				setUnitsWord(unitsPlace);
			}
		}
		else 
			setUnitsWord(unitsPlace);
	}
	
	private void setUnitsWord(int unitsPlace) {
		if(unitsPlace != 0)
			addWord(getDigit(unitsPlace));
	}
	
	private void addWord(String word) {
		if(wordBuilder.length() != 0)
			wordBuilder.append(SPACE);
		wordBuilder.append(word);
	}
}
