package com.sid.linkedlist.addtwolists;

import com.sid.linkedlist.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList(new int[]{9,9,9,9,9,9});
		LinkedList ll2 = new LinkedList(new int[]{9,9,9,9,9,9});
		ll1.printLinkedList();
		ll2.printLinkedList();
		LinkedList ll = new LinkedList();
		ll.head = MathAddLists.sum(ll1.head, ll2.head);
		System.out.println("-----------------");
		ll.printLinkedList();
	}

}
