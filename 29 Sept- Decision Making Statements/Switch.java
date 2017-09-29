package com.bmpl.javaprograms;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		
		//character 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your character");
		char userValue = scanner.next().charAt(0);
		
		switch(userValue){
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		break;	
			
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		
			
		}

	}

}
