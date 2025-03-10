package com.SDET_JAVA;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write sentence: ");
		String s= sc.nextLine();
		System.out.println(isPanagram(s));
	}
	static boolean isPanagram(String s) {
		if(s.length()<26)
			return false;
		s=s.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+""))
				return false;
			
		}
		return true;
		
		
	}

}
