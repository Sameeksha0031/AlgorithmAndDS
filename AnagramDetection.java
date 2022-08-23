package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String stringOne = sc.next();
		String stringTwo = sc.next();
		AnagramDetection object = new AnagramDetection();
		object.detectAnagram(stringOne, stringTwo);
	}

	public void detectAnagram(String stringOne, String stringTwo) {
		if (stringOne.length() == stringTwo.length()) {
			char[] arrayOne = stringOne.toCharArray();
			char[] arrayTwo = stringTwo.toCharArray();
			arrayOne = sortArray(arrayOne);
			for (int i = 0; i < arrayOne.length; i++) {
				System.out.println(arrayOne[i]);
			}
			arrayTwo = sortArray(arrayTwo);
			if (Arrays.equals(arrayOne, arrayTwo)) {
				System.out.println("The Strings " + stringOne +" and "+ stringTwo + " are Anagram");
			}
		}else {
			System.out.println("The Strings " + stringOne +" and "+ stringTwo + " are not Anagram");	
		}
	}

	public char[] sortArray(char[] array) {
		char max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					max = array[j];
					array[j] = array[i];
					array[i] = max;
				}
			}
		}
		return array;
	}

}
