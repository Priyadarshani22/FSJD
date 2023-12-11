package com.basic;
import java.util.Scanner;

public class PrimeNprime {
	
		public static void main(String args[]){
			int a,b;
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the valueof a=");
			a=sc.nextInt();
	
			if(a%2==0){
			System.out.println("the entered num is Prime");
		}
			else{
				System.out.println("the entered num is not Prime");
			}
		}

	}


