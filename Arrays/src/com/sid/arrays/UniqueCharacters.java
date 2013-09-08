package com.sid.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
	
	boolean isUnique(char[] ch){
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
		UniqueCharacters uc = new UniqueCharacters();
		String[] input = {
				"abcdea",
				"abc",
				"",
				"a",
				null
		};
		for(String in : input){
			boolean result = uc.isUnique(in.toCharArray());
			System.err.println(in+": "+result);	
		}
		
		
	}
}
