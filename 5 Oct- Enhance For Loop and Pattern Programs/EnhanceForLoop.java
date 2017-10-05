package com.bmpl.javaprograms;

public class EnhanceForLoop {

	public static void main(String[] args) {

		int array[] = {32,54,76,32,
						65,43,2165,876,
						54, 76, 
						32,65,32,76};
		
		//System.out.println(array[40]);
		
//		for(int i = 0; i<array.length; i++){
//			System.out.println(array[i]);
//		}

		//enhanced for loop
		
		//traversing array--> efficient loop
		for(int arr : array){
			System.out.println(arr);
		}
	}

}
