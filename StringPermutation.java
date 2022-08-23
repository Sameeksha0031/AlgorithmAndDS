package com.algorithm;
import java.util.Scanner;

class StringPermutation
{

	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		//System.out.println(ch[i]);
		ch[j] = temp;
		//System.out.println(ch[j]);
	}

	private static void permutations(char[] ch, int currentIndex)
	{
		//System.out.println(ch.length);
		//System.out.println(currentIndex); 
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		permutations(s.toCharArray(), 0);
	}
}