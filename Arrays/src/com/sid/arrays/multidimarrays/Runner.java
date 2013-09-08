package com.sid.arrays.multidimarrays;

public class Runner {

	public static void main(String[] args) {
		int arr[][] = {
			{1,2,0,4},
			{5,6,7,8},
			{9,0,11,12}
		};
		
		System.out.println("Input");
		RowColumnZero.prettyPrintArray(arr);
		System.out.println("Output");
		RowColumnZero.setRowColZero(arr);
	}

}
