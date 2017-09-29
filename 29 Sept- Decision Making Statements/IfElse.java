package com.bmpl.javaprograms;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		// compare which one is greater among three values entered by user
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int value1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		int value2 = scanner.nextInt();
		
		
		System.out.println("Enter third value");
		int value3 = scanner.nextInt();
		
		if(value1 > value2 && value1 > value3){
			System.out.println("Value1 is greater");
		}else if(value1 == value2 && value1 == value3){
			System.out.println("All Equals");
		}
		else if(value2> value3){
			System.out.println("Value2 is greater");
		}else if(value2 == value3 && value1 == value2){
			System.out.println("All Equals");
		}
		else{
			System.out.println("Value3 is greater");
		}	
	}
}
