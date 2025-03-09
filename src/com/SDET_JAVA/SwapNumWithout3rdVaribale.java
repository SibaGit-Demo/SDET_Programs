package com.SDET_JAVA;

import java.util.Scanner;

public class SwapNumWithout3rdVaribale {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num : ");
		int a=sc.nextInt();
		System.out.println("enter second num : ");
		int b= sc.nextInt();
		System.out.println("Before Swapping: a = " +a+", b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swapping: a = " +a+", b= "+b);
		
	}

}
