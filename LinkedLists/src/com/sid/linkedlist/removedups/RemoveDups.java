package com.sid.linkedlist.removedups;

import com.sid.linkedlist.LinkedList.Node;

public class RemoveDups {

	public static void removeDups(Node head) {
		if(head == null) return;
		
		Node curr = head;
		Node f = head;
		
		while(curr != null){
			while(f.next != null){
				if(f.next.data == curr.data){
					Node t = f.next;
					f.next = t.next;
					t.next = null;
				}
				else{
					f = f.next;
				}
			}
			curr = curr.next;
			f = curr;
		}
	}

}
