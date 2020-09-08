package com.ash;

public class NumberToEnglishWordConverter {
	private static final String[] TERMS = {"","Thousand", "Million", "Billion"};
	private StringBuilder wordBuilder = new StringBuilder();
	private static final String SPACE = " ";
	private ThreeDigitNumberToWordConverter converter = new ThreeDigitNumberToWordConverter();
	
	public NumberToEnglishWordConverter() {
		
	}
	
	public String getEnglishWord(long number) {
		int termIndex = 0;
		while(number != 0) {
			int last3Digits = (int) (number % 1000);
			if(last3Digits != 0) {
				if(wordBuilder.length() != 0)
					wordBuilder.insert(0,  SPACE);
				wordBuilder.insert(0, getTerm(termIndex));
				wordBuilder.insert(0,  SPACE);
				wordBuilder.insert(0, converter.convertToWord(last3Digits));
			}
			termIndex++;
			number = number / 1000;
		}
		String word = wordBuilder.toString();
		wordBuilder.setLength(0);
		return word;
	}
	
	private String getTerm(int termIndex) {
		return TERMS[termIndex];
	}
}
