package com.ash;

public class TestThreeDigitConverter {

	public static void main(String[] args) {
		ThreeDigitNumberToWordConverter t = new ThreeDigitNumberToWordConverter();
		System.out.println(t.convertToWord(3));
		System.out.println(t.convertToWord(13));
		System.out.println(t.convertToWord(23));
		System.out.println(t.convertToWord(213));
		System.out.println(t.convertToWord(203));
		System.out.println(t.convertToWord(340));
		System.out.println(t.convertToWord(10));
		System.out.println(t.convertToWord(100));
		System.out.println(t.convertToWord(999));
	}

}
