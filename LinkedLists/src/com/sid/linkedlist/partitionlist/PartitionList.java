package com.sid.linkedlist.partitionlist;

import com.sid.linkedlist.LinkedList.Node;

public class PartitionList {

	public static Node partitionList(Node head, int data){
		if(head == null) return null;
		
		Node h = head;
		while(h.next != null && h.next.data != data){
			h = h.next;
		}
		//If data not found in list
		if(h.next == null){
			return head;
		}
		
		//Move found node to beginning of list
		Node t = h.next;
		h.next = h.next.next;
		t.next = head;
		head = t;
		
		h = head;
		while(h.next != null){
			if(h.next.data <= data){
				Node t2 = h.next;
				h.next = t2.next;
				t2.next = head;
				head = t2;
			}
			else{
				h = h.next;	
			}
			
		}
		
		return head;
	}
	
}
