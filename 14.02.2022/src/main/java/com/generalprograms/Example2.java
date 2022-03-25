package com.generalprograms;

import java.util.Scanner;

//java program to calculate product of two nubers
public class Example2 {

	public static void main(String[] args) {
		//declare the variables
		int num1, num2, product;

		//create scanner class object
		Scanner scanner=new Scanner(System.in);
		//read values from keyboard
		System.out.println("Enter the First value:");
		num1=scanner.nextInt();
		System.out.println("Enter the second value:");
		num2=scanner.nextInt();

		//doing operation
		product=num1*num2;

		//print output on screen
		System.out.println("Product:"+product);
		//close scanner class object
		scanner.close();
	}

}
