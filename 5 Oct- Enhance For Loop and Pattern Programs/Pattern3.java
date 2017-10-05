package com.bmpl.javaprograms;

/*
      *	 --> 1
     *** --> 3
    ***** 
   *******
  ********* --> 9

 */

public class Pattern3 {

	public static void main(String[] args) {
		
//		for(int row = 1; row<= 5; row++)
//		{
//			
//			for(int column = 1; column<=9; column++)
//			{
//				if(column>=(6-row) && column<=4 + row)
//				{
//					System.out.print("*");
//				} else{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		for(int row = 1; row <= 5; row++)
		{
			for(int column = 4; column >= row; column--)
			{
				System.out.print(" ");
				
			}
			for(int column = 1;column<=(2*row-1) ; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
