package com.bmpl.javaprograms;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++){
			
			if(i==5)
			{
				continue;
				//break;
			} 
			else
			{
				System.out.println(i);
			}
		}
		System.out.println("Exited from loop");

	}

}
