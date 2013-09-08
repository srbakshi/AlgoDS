package com.sid.arrays.compressarray;

public class Runner {

	public static void main(String[] args) {
		String[] s = {
			"aaaaaab",
			"",
			"a",
			"abcdd",
			"aaabcccdddde",
			"aaabcccddddee"
		};
		
		for(String str : s){
			String result = CompressString.compressString(str);
			System.out.println("Input: "+str);
			System.out.println("Output: "+result);
		}
	}

}
