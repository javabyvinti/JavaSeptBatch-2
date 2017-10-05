package com.bmpl.javaprograms;

/*
 
 *
 **
 ***
 ****
 *****
 
 5
 44
 333
 2222
 11111 
 

 */
public class PatternPrograms {

	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++)
		{
			for(int column = 1; column<=row; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
