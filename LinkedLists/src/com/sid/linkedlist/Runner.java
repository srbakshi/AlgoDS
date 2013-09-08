package com.sid.linkedlist;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new int[]{1,2,3,4,5,6,6,6});
		ll.addAtEnd(7);
		ll.addAtHead(9);
		ll.addAtEnd(-1);
		ll.printLinkedList();
		ll.deleteNode(5);
		ll.printLinkedList();
		ll.deleteNode(6);
		ll.printLinkedList();
		ll.deleteNode(-1);
		ll.printLinkedList();
		ll.deleteNode(9);
		ll.printLinkedList();
		ll.deleteNode(9);
		ll.printLinkedList();
		ll.deleteNode(1);
		ll.printLinkedList();
		ll.deleteNode(2);
		ll.printLinkedList();
		ll.deleteNode(3);
		ll.printLinkedList();
		ll.deleteNode(4);
		ll.printLinkedList();
		ll.deleteNode(7);
		ll.printLinkedList();
		ll.deleteNode(9);
		ll.printLinkedList();
	}
}
