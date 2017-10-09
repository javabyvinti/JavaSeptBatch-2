package com.bmpl.javaprograms;

public class ConsDemo1 {

	int a;
	
	void data(){
		System.out.println("This is my data " + a);
	}
	ConsDemo1(){
		a = 10;
		System.out.println("Cons called " + a);
	}
	
	ConsDemo1(int value){
		System.out.println("Parameterized cons " + value);
	}
	//compiler automatically creates a default cons  
	public static void main(String[] args) {
		
		ConsDemo1 obj = new ConsDemo1(54);
		//obj.data();
		

	}

}
