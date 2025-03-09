package com.SDET_JAVA;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter number: ");
		int n=sc.nextInt();
		int sum=0;
		int sq=n*n;
		while(sq!=0) {
			sum+=sq%10;
			sq/=10;
		}
		if(n==sum)System.out.println(n + " is neon number");
		else System.out.println(n +" is not neon number");
	}

}
