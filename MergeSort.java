package com.algorithm;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		String[] array = { "esha", "Sam", "viabhav", "Ruchi", "Aditi" };
		String[] a = mergesort(array, 0, array.length - 1);
		for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	}

	public static String[] mergesort(String[] array, int lb, int ub) {
		if (lb == ub) {
			String[] A = { array[lb] };
			return A;
		}
		int mid = lb + (ub - lb) / 2;
		String[] array1 = mergesort(array, lb, mid);
		//System.out.println(array1[0]);
		String[] array2 = mergesort(array, mid + 1, ub);
		//System.out.println(array2[0]);
		String[] array3 = merge(array1, array2);
		return array3;
	}

	public static String[] merge(String[] array1, String[] array2) {
		int m = array1.length;
		int n = array2.length;
		String[] arr = new String[m + n];
		int i = 0;
		int j = 0;
		int idx = 0;

		while (i < m && j < n) {
			if (isAlphabeticallySmaller(array1[i], array2[j])) {
				arr[idx] = array1[i];
				i++;
				idx++;
			} else {
				arr[idx] = array2[j];
				j++;
				idx++;
			}
		}
		while (i < m) {
			arr[idx] = array1[i];
			i++;
			idx++;
		}
		while (j < n) {
			arr[idx] = array2[j];
			j++;
			idx++;
		}

		return arr;
	}

	public static boolean isAlphabeticallySmaller(String string1, String string2) {
		string1 = string1.toUpperCase();
		string2 = string2.toUpperCase();
		if(string1.compareTo(string2) < 0) {
			return true;
		}
		return false;
	}
}
