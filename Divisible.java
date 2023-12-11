package com.basic;

import java.util.Scanner;

public class Divisible {
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the valueof a=");
		a=sc.nextInt();
		System.out.println("enter the valueof b=");
		b=sc.nextInt();
		
		if(a%b==0){
		System.out.println("the entered num is divisible");
	}
		else{
			System.out.println("the entered num is not divisible");
		}
	}

}
