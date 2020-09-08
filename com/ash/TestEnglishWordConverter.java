package com.ash;

public class TestEnglishWordConverter {

	public static void main(String[] args) {
		NumberToEnglishWordConverter t = new NumberToEnglishWordConverter();
		System.out.println(t.getEnglishWord(12345672));
		System.out.println(t.getEnglishWord(72));
		System.out.println(t.getEnglishWord(2));
		System.out.println(t.getEnglishWord(1000));
		System.out.println(t.getEnglishWord(1001));
		System.out.println(t.getEnglishWord(12019));
		System.out.println(t.getEnglishWord(10305072));
		System.out.println(t.getEnglishWord(900000));
	}

}
