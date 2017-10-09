package com.bmpl.javaprograms;

import java.util.Scanner;

public class Student {

	String name;
	int rollno;
	
	void input(String nm, int rn)
	{
		name = nm;
		rollno = rn;
	}
	
	void output(){
		System.out.println("Name ="+name);
		System.out.println("Rollno ="+rollno);
	}
	
	public static void main(String[] args) {
		
		Student ram = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data");
//		System.out.println("Enter your name");
//		String name = scanner.next();
//		
//		System.out.println("Enter your rollno");
//		int rollno = scanner.nextInt();
//		
		ram.input(scanner.next(), scanner.nextInt());
		ram.output();

	}

}
