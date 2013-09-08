package com.sid.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
	
	static boolean isUnique(String input){
		if(input == null){
			return false;
		}
		
		char[] ch = input.toCharArray();
		int len = ch.length;
		Map<Character, Boolean> hm = new HashMap<Character, Boolean>();
		
		for(int i=0; i<len; i++){
			if(hm.get(ch[i]) == null){
				hm.put(ch[i], true);
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		String[] input = {
				"abcdea",
				"abc",
				"",
				"a",
				null
		};
		for(String in : input){
			boolean result = UniqueCharacters.isUnique(in);
			System.err.println(in+": "+result);	
		}
		
		
	}
}
