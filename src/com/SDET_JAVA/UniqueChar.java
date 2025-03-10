package com.SDET_JAVA;

import java.util.Scanner;

public class UniqueChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write a sentence:");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000')
				continue;
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
					
				}
				
				
			}
			if(count==1)
			res+=ch[i];
			
			
		}
		System.out.println(res);
	}

}
