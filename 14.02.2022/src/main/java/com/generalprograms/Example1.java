package com.generalprograms;

import java.util.Scanner;

//java program to calculate sum of two numbers
public class Example1 {

	public static void main(String[] args) {
		//declare variables
		int num1, num2, sum;
		
		//created scanner class object
		Scanner scanner = new Scanner(System.in);
		
		//read values from keyboard
		System.out.println("Enter the First value:");
		num1 = scanner.nextInt();
		
		System.out.println("Enter the second value:");
		num2 = scanner.nextInt();
		
		//doing operation
		sum = num1+num2;
		
		//printng output on scanner
		System.out.println("sum:"+sum);
		
		//closing scanner class object
		scanner.close();
		
		

	}

}
