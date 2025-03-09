package com.SDET_JAVA;

import java.util.Scanner;

public class CountConsonantVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence:");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		int constcount=0;
		int vowelcount=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch >= 'a' && ch<= 'z')
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					
					vowelcount++;
				else
					constcount++;
			
		}
		System.out.println("vowelcount:"+ vowelcount);
		System.out.println("constcount:"+ constcount);
		
	}

}
