package com.bmpl.javaprograms;

public class ClassDemo3 {
	
	//instance variable
	int rollno;
	char c = 'r';//vary system to system
	
	static int value;
	
	static void input(){
		int first;
		int second = 40;
		//System.out.println(rollno);
		//System.out.println(c);
		//System.out.println(first);
	}
	
	int data(){
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		//types of variable --> local variable and instance variable and static variable
		
		int first = 50;
		System.out.println(first);
		ClassDemo3 obj = new ClassDemo3();
		System.out.println(obj.rollno);
		System.out.println(obj.c);
		//obj.input();
		
		System.out.println(value);
		//System.out.print(input());
		System.out.println(obj.data());
	}

}
