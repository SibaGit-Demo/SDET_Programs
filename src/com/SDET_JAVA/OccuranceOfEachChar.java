package com.SDET_JAVA;

import java.util.Scanner;

public class OccuranceOfEachChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word: ");
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000')
				continue;
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
					count++;
				}
					
			}
			System.out.println(ch[i]+":"+count);
		}
	}

}
