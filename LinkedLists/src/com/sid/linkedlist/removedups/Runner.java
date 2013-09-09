package com.sid.linkedlist.removedups;

import com.sid.linkedlist.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new int[]{1,1,4,1,1,1,1,2,2,3,2,4,3,2,2});
		System.out.println("Input list: ");
		ll.printLinkedList();
		RemoveDups.removeDups(ll.head);
		
		System.out.println("Output list: ");
		ll.printLinkedList();
	}
}
