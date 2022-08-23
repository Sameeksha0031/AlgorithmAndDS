package com.algorithm;

public class SelectionSorting {

	public static void main(String[] args) {
		int array[] = { 4, 5, 7, 2, 1, 9 };
		SelectionSorting obj = new SelectionSorting();
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("After Sorting");
		obj.sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		obj.sorting(array);

	}

	public void sorting(int[] array) {
		int temp = 0 ;
		int min = array[0];
		int loc = 0 ;
		for(int i = 0; i < array.length; i++ ) {
			min = array[i];
			loc = i;
			for(int j = i + 1 ; j < array.length -1 ; j++) {
			    if(array[j] < min ) {
			    	min = array[j];
			    	loc  = j;
			    }	
			}
			if(loc!=i) {
				temp=array[loc];
				array[loc] = array[i];
				array[i] = temp;
			}
		}
	}

}
