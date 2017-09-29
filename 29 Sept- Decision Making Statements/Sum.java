package com.bmpl.javaprograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		//user data 
		// 2 mechanism
		//1 way is to use command line arguments
		//2 way is to use Scanner

		//Integer data = new Integer(10);
		
//		int value1 = Integer.parseInt(args[0]); // "10" + 10
//		int value2 = Integer.parseInt(args[1]);
//		
//		System.out.println(value1 + value2);

	
		//Scanner is a predefined class
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value in numbers");
		int value1 = scanner.nextInt();
		
		
		System.out.println("Enter second value in numbers");
		int value2 = scanner.nextInt();
		
		System.out.println("Result is=" + (value1 + value2));
	}

}
