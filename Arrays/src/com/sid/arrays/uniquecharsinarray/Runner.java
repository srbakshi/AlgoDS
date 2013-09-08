package com.sid.arrays.uniquecharsinarray;

public class Runner {

	public static void main(String[] args){
		String[] input = {
				"abcdea",
				"abc",
				"",
				"a",
				"aaa",
				null
		};

		// Method 1
		System.out.println("***Hashmap method***");
		for(String in : input){
			boolean result = UniqueCharacters.isUnique(in);
			System.out.println(in+":\t\t"+result);	
		}
		
		// Method 2
		System.out.println("\n***No extra space, no sorting***");
		for(String in : input){
			boolean result = UniqueCharacters_noExtraSpace.isUnique(in);
			System.out.println(in+":\t\t"+result);	
		}
	}
	
}
