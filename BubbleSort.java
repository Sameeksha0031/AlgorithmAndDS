package com.algorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int array[] = { 4, 5, 7, 2, 1, 9 };
		BubbleSort obj = new BubbleSort();
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("After Sorting");
		obj.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		obj.sort(array);

	}

	public void sort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                	temp = array[j];
                	array[j] = array[i];
                	array[i] = temp;
                }
			}
		}
	}
}
