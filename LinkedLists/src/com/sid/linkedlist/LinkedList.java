package com.sid.linkedlist;

public class LinkedList {

	private Node head = null;
	
	public LinkedList(int[] is) {
		for(int i : is){
			addAtEnd(i);
		}
	}

	public void addAtHead(int data){
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
	}
	
	public void addAtEnd(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node t = head;
		while(t.next != null){
			t = t.next;
		}
		
		t.next = new Node(data);
	}

	public void printLinkedList(){
		if(head == null) return;
		
		Node t = head;
		while(t != null){
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.println();
	}
	
	private class Node{
		Node next = null;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
}
