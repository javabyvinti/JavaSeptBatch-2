package com.bmpl.javaprograms;

public class InnerLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j<= 3; j++)
			{
				if(i==j)
				{
					break;
				}
				else
				{
					System.out.println("Value of i=" + i + " Value of j=" +j);	
				}
				
			}
			
		}
		
	}

}