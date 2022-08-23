package com.algorithm;

public class InsertSorting {

	public static void main(String[] args) {
		String givenString = "My name is SAMEEKSHA ";
		char[] array = givenString.toCharArray();
		InsertSorting obj = new InsertSorting();
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("After Sorting");
		obj.sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		obj.sorting(array);
	}

	public void sorting(char[] array) {
		for (int i = 1; i < array.length; i++) {
			char string = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > string) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = string;
		}
	}
}
