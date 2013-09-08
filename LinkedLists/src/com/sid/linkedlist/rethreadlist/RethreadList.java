package com.sid.linkedlist.rethreadlist;

import com.sid.linkedlist.LinkedList.Node;

public class RethreadList {
	
	public static void rethreadList(Node head){
		if(head == null){
			return;
		}
		
		//Make s point to center of linked list
		Node f = head;
		Node s = head;
		while(f != null){
			f = f.next.next;
			s = s.next;
		}
		
		//Set f to start of linked list again
		f = head;
		
		Node t1 = null;
		Node t2 = null;
		while(s != null){
			t1 = f;
			t2 = s;
			f = f.next;
			s = s.next;
			t1.next = t2;
			t2.next = f;
			// Remove the circular reference when s falls off
			if(s == null){
				t2.next = null;
			}
		}
	}
}
