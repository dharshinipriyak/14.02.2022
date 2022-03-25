package com.generalprograms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		int length,width,area;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		length=scanner.nextInt();
		System.out.println("Enter the width of the rectangle:");
		width=scanner.nextInt();
		area=length*width;
		System.out.println("Area of rectangle is :"+area);
		scanner.close();
	}

}
