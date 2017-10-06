package com.bmpl.javaprograms;

public class ClassDemo1 {

	//sum of two numbers with the help of functions
	
	static int input(int firstValue, int secondValue){
		//System.out.println(firstValue + secondValue);	
		return firstValue + secondValue;
	
	}
	
	static void data(){
		System.out.println("This is data method");
	}
	
	//static--> no need to create object
	public static void main(String[] args) {

		int third = 60;
		
		third = third + input(20, 65);
		System.out.println("result is=" + third);
		//System.out.println(input(20, 65));
		//System.out.println(firstValue + secondValue);
	
		data();
		
	}

}
