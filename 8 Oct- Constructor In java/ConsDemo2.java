package com.bmpl.javaprograms;

import java.util.Scanner;

public class ConsDemo2 {

	// this keyword--> 
	//this always point the current class --> variables, constructor, methods
	// this --> must be first statement
	
	//constructor chaining
	
	String studentName;
	int studentRollno;
	String collegeName;
	float percentage;
	long phn;
	
	//default --> same 
	//parameterized
//	ConsDemo2(){
//		this("Ram kumar", 3);
//		collegeName = "MAIT";
//	}
	
	ConsDemo2(){
		
	}

	ConsDemo2(long ph,float percent, String studentName, int studentRollno){
		//this();//call default cons
		//when instance variable name and local variable name is same then we can use this keyword to access instance variable
		phn = ph;
		this.percentage = percent;//implicitly
		this.studentName = studentName;//explicitly
		this.studentRollno = studentRollno;
	}
	
	void input(){
		studentName = "Ram Kumar";
		studentRollno = 5;
	}
	
	void print(){
		System.out.println(collegeName);
		System.out.println(percentage);
		System.out.println(studentName);
		System.out.println(studentRollno);
	}
	
	
	public static void main(String[] args) {
		
		//ConsDemo2 obj = new ConsDemo2();
		
		//obj.print();
		
		//ConsDemo2 obj1 = new ConsDemo2("Rohan", 3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.next();
		name.equals(name.charAt(47));
		
//		int a = 100;
//		int b = 100;
//		System.out.println(a==b);
		
		//name = name/4;
		System.out.println(name);
		
//		ConsDemo2 obj1 = new ConsDemo2(8543265789L,54.76f, "Rohan", 5);
//		obj1.print();
	}

}
