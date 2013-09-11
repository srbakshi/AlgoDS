package com.sid.linkedlist.addtwolists;

import com.sid.linkedlist.LinkedList;
import com.sid.linkedlist.LinkedList.Node;

public class MathAddLists {

	public static Node sum(Node a, Node b){
		if(a == null && b == null) return null;
		if(a == null) return b;
		if(b == null) return a;
		
		LinkedList ll = new LinkedList(new int[]{});
		int carry = 0, sum = 0;
		while(a != null || b != null){
			int d1 = (a==null)?0:a.data;
			int d2 = (b==null)?0:b.data;
			sum = d1 + d2 + carry;
			carry = sum/10;
			ll.addAtEnd(sum%10);
			if(a != null) a = a.next;
			if(b != null) b = b.next;
		}
		
		//The carry will always be single digit
		ll.addAtEnd(carry);

		return ll.head;
	}
	
}
