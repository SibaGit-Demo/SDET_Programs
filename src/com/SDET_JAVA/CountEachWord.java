package com.SDET_JAVA;

import java.util.Scanner;

public class CountEachWord {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a sentence:");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(str[i]==" ")continue;
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]=" ";
				}
				
			}
			System.out.println(str[i]+" :"+count);
			
		}
	}

}
