package com.bmpl.javaprograms;

/*
 
 A
 BB
 CCC
 DDDD
 EEEEE 

      5
     44
    333
   2222
  11111
     
 */

public class Pattern2 {

	public static void main(String[] args) {
		
		//char temp = 'A';
		
//		for(char row = 'E'; row>='A'; row--)
//		{
//			for(char column = 'E'; column>=row; column--)
//			{
//				System.out.print(row);
//				//System.out.print(temp);
//			}
//			//temp++;
//			System.out.println();
//		}
		
		
		
		//Pattern 2 solution
		int k = 5;
		for(int row = 1; row<= 5; row++)
		{
			
			for(int column = 1; column<=5; column++)
			{
				if(column>=(6-row)){
					System.out.print(k);
				} else{
					System.out.print(" ");
				}
				//System.out.print(row);
				//System.out.print(temp);
			}
			k--;
			//temp++;
			System.out.println();
//			for(int column = 1; column<=row; column++){
//				System.out.println(row);
//			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
