package com.sid.linkedlist.partitionlist;

import com.sid.linkedlist.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(new int[]{1,2,3,4,5,6,7,8,9,0});
		System.out.println("Input: ");
		ll.printLinkedList();
		
		ll.head = PartitionList.partitionList(ll.head, 9);
		
		
		System.out.println("Output: ");
		ll.printLinkedList();
		
	}

}
