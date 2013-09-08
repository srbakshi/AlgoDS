package com.sid.arrays.perm;

public class Runner {

	public static void main(String[] args) {
		String[] s = {"ab", 
				"ba", 
				null, 
				"a",
				"",
				"hello",
				"elo",
				"olelh",
				"#$%^",
				"^#$%"
				};
		
		for(int i=0; i<s.length; i++){
			for(int j=0; j<s.length; j++){
				boolean result = CheckTwoStringsPermutation.isPermutation(s[i], s[j]);
				System.out.println(result+" : "+s[i]+" AND "+s[j]);	
			}
		}
	}
}
