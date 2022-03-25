package com.generalprograms;

import java.util.Scanner;

public class PerimeterofCircle {

	public static void main(String[] args) 
	{
		int radius;
		double pi=3.14,perimeter;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		radius=scanner.nextInt();
		perimeter=2*pi*radius;
		System.out.println("Perimeter of the circle is :"+perimeter);
		scanner.close();

	}

}
