package com.algorithm;

import java.util.Scanner;


public class PrimeNumberAndAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumberAndAnagram object = new PrimeNumberAndAnagram();
		System.out.println("Enter the range from 0 to 1000 ");
		int num = sc.nextInt();
		object.determinePrimeNumber(num);

	}
	public void determinePrimeNumber(int num) {
		int temp = 0;
		for (int j = 0; j < num; j++) {
			int flag = 0;
			if (j == 0 || j == 1) {
				//System.out.println(j);
			} else {
				for (int i = 2; i <= j / 2; i++) {

					if (j % i == 0) {
						flag++;
						break;
					}
				}

				if (flag == 0) {
					System.out.println(j);
					System.out.println();
                    temp = j;
					int number = reversingNumber(j);
					if(temp == number) {
						System.out.println(temp +" is Anagram");
					}
				}
			}
		}

	}

	private int reversingNumber(int j) {
		int reverse = 0;
		if (j > 10) {
			while (j != 0) {
				reverse = reverse * 10 + (j % 10);
				j = j /10;
			}
		}
		return reverse;

	}

}
