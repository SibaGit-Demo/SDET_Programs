package com.SDET_JAVA;

import java.util.Scanner;

public class Automorphic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		boolean flag=true;
		int square= num*num;
		
		while(num!=0) {
			if(num%10!=square%10) {
			flag=false;
			break;
		}
		num/=10;
		square/=10;
	}
		if(flag) {
			System.out.println(" num  is automorphic");
		}else {
			System.out.println("num is not Automorphic");
		}

}
}
