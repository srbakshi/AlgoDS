package com.sid.arrays.uniquecharsinarray;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
	
	public static boolean isUnique(String input){
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
}
