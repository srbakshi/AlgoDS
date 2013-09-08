package com.sid.linkedlist.rethreadlist;

import com.sid.linkedlist.LinkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new int[]{1,3,5,7,9,2,4,6,8,0});
		System.out.println("Input list:");
		ll.printLinkedList();
		RethreadList.rethreadList(ll.head);
		System.out.println("Output list:");
		ll.printLinkedList();
	}
}
