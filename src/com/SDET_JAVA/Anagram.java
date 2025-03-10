package com.SDET_JAVA;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word:");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd Word:");
		String s2=sc.nextLine();
		System.out.println(isAnagram(s1,s2));
	}
	static boolean isAnagram(String s1,String s2) {
		while(true) {
			if(s1.length()!=s2.length()) {
				return false;
			 
		}else if (s1.length()==0 && s2.length()==0) {
			return true;
		}
			char ch=s1.charAt(0);
			s1=s1.replace(ch+ "","");
			s2=s2.replace(ch+"","");
		}
			
			
		}
	}


