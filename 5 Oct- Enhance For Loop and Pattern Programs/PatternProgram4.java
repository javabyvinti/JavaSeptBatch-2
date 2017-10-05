package com.bmpl.javaprograms;

//i like pattern
/*
 
 ************* --> 13
 ****** ****** --> 6
 *****   *****
 ****     ****
 ***       ***
 **         **
 *           * 
 
  */

public class PatternProgram4 {

	public static void main(String[] args) {

//		for(int row = 1; row <= 7; row++)
//		{
//			for(int column = 7; column >= row; column--)
//			{
//				System.out.print("*");		
//			}
//			for(int column = 2;column<=(2* row-1) ; column++)
//			{
//				System.out.print(" ");
//			}
//			for(int column = 1; column<=(8-row); column++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for(int i = 1; i<=7; i++){
			for(int j = 1; j<=13; j++){
				if((j >=1 && j<=(8-i)) || 
						(j>=6+i && j<=13)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
}
