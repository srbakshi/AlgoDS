package com.sid.arrays.multidimarrays;

public class RowColumnZero {

	public static int[][] setRowColZero(int[][] arr){
		
		if(arr == null) return null;
			
		boolean[] r = new boolean[arr.length];
		boolean[] c = new boolean[arr[0].length];
		
		for(int i=0; i<r.length; i++){
			for(int j=0; j<c.length; j++){
				if(arr[i][j] == 0){
					r[i] = true;
					c[j] = true;
				}
			}
		}
		
		for(int i=0; i<r.length; i++){
			if(r[i]){
				for(int j=0; j<c.length; j++){
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=0; i<c.length; i++){
			if(c[i]){
				for(int j=0; j<r.length; j++){
					arr[j][i] = 0;
				}
			}
		}
		prettyPrintArray(arr);
		
		return null;
	}

	static void prettyPrintArray(int[][] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
