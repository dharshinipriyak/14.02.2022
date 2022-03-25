package com.generalprograms;

import java.util.Scanner;

public class Example3 {
	

	public static void main(String[] args) {
		String character;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any character");
		character=scanner.next();
		
		switch(character)
		{
		//lower case alphabet
		case "a":
		case "b":
		case "c":
		case "d":
		case "e":
		case "f":
		case "g":
		case "h":
		case "i":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "o":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "u":
		case "v":
		case "w":
		case "x":
		case "y":
		case "z":
			//Uppercase alphabet
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
		case "G":
		case "H":
			System.out.println("It is alphabet");
			break;
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				System.out.println("It is a digit");
				break;
				
				case "!":
				case "@":
				case "#":
				case "$":
				case "%":
				case "^":
				case "&":
				case "*":
				case "(":
				case ")":
				case "-":
				case "+":
				case "=":
				case ">":
				case "<":
				case "?":
				case "/":
					System.out.println("It is a special character");
					break;
				default:
					System.out.println("Kindly enter valid character");
						
		}
		
		scanner.close();
		

	}

}
