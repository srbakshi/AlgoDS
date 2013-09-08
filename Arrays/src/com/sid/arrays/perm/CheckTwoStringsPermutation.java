package com.sid.arrays.perm;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoStringsPermutation {

	public static boolean isPermutation(String s1, String s2){
		if(s1 == null || s2 == null){
			return false;
		}
		if(s1.length() != s2.length()){
			return false;
		}
		int n = s1.length();
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for(int i=0; i<n; i++){
			Integer val = hm.get(ch1[i]);
			if(val == null){
				val = 0;
			}
			hm.put(ch1[i], ++val);
		}
		
		for(int i=0; i<n; i++){
			Integer val = hm.get(ch2[i]);
			if(val == null){
				return false;
			}
			hm.put(ch2[i], --val);
		}
		
		for(Integer val : hm.values()){
			if(val != 0){
				return false;
			}
		}
		return true;
	}
	
	
}
