package com.SDET_JAVA;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String s=sc.nextLine();
		System.out.println(isPallindrome(s));
	}
	static boolean isPallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			//s=s.toLowerCase();
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
	}

}
