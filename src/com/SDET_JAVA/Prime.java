package com.SDET_JAVA;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int num= sc.nextInt();
		boolean val=true;
		for(int i=2; i<=num/2;i++) {
			if(num%i==0) {
				val=false;
				break;
			}
			
		}
		if(num>=2&& val) {
			System.out.println(num +"is prime");
		}else {
			System.out.println(num + "is not Prime");
		}
	}

}
