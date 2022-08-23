package com.algorithm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range from 0 to 1000 ");
		int num = sc.nextInt();
		for (int j = 0; j < num; j++) {
			int flag = 0;
			if (j == 0 || j == 1) {
				System.out.println(j);
			} else {
				for (int i = 2; i <= j / 2; i++) {

					if (j % i == 0) {
						flag++;
						break;
					}
				}

				if (flag == 0) {
					System.out.println(j);
				}
			}
		}

	}

}
