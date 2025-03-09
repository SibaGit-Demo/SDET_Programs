package com.SDET_JAVA;

import java.util.Scanner;

public class FibonacciRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("fibonacci series is : ");
		int range=sc.nextInt();
		int Firstnum=0, secondnum=1, next;
		for(int i=0; i<=range; i++) {
			System.out.print(Firstnum + " ");
			next=Firstnum + secondnum;
			Firstnum=secondnum;
			secondnum=next;
			
			
		}
		
	}

}
