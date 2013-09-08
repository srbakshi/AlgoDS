package com.sid.arrays.compressarray;

public class CompressString {
	public static String compressString(String s){
		if(s == null || s.length() == 0) return null;
		
		int compLen = calcCompressedLen(s);
		
		if(s.length() <= compLen) return s;
		
		int count = 0, j=0; 
		char prev = 0;
		char[] a = s.toCharArray();
		char[] b = new char[compLen];
		
		for(int i=0; i<s.length(); i++){
			if(prev == 0){
				b[j++] = a[i];
				count ++;
				prev = a[i];
				continue;
			}
			
			if(a[i] == prev){
				count++;
			}
			else{
				b[j++] = (char) (count + '0');
				b[j++] = a[i];
				count = 1;
				prev = a[i];
			}
		}
		b[j] = (char)(count + '0');
		return String.valueOf(b);
	}

	static int calcCompressedLen(String s) {
		char[] a = s.toCharArray();
		
		char prev = a[0];
		int count = 2;
		for(int i=1; i<a.length; i++){
			if(a[i] != prev){
				prev = a[i];
				count +=2;
			}
		}
//		System.out.println("Original String length: "+s.length());
//		System.out.println("Compressed String length: "+count);
		return count;
	}
}
