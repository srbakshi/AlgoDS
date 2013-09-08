package com.sid.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new int[]{1,2,3,4,5,6});
		ll.addAtEnd(7);
		ll.addAtHead(9);
		ll.addAtEnd(-1);
		ll.printLinkedList();
	}
}
