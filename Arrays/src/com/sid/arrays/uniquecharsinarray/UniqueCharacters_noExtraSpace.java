package com.sid.arrays.uniquecharsinarray;

public class UniqueCharacters_noExtraSpace {

	public static boolean isUnique(String s) {
		if(s == null){
			return false;
		}
		
		char[] ch = s.toCharArray();
		int n = ch.length;
		
		for(int i=1; i<=n-1; i++){
			
			for(int j=0; j<i; j++){
				if(ch[i] == ch[j]){
					return false;
				}
			}
		}
		return true;
	}
}
