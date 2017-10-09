package com.bmpl.javaprograms;

public class StaticDemo {

	static int value = 1;
	
	void print(){
		System.out.println("value="+value);
		value++;
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
		
		obj1.print();
		obj2.print();
		obj3.print();
		
//		obj1.print();
//		obj2.print();
//		obj3.print();
//		
		

	}

}
