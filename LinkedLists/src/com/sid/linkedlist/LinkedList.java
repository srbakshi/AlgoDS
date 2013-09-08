package com.sid.linkedlist;

public class LinkedList {

	public Node head = null;
	
	public LinkedList(int[] is) {
		for(int i : is){
			addAtEnd(i);
		}
	}

	public void addAtHead(int data){
		System.out.println("Adding at head: "+data);
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
	}
	
	public void addAtEnd(int data){
		System.out.println("Adding at end: "+data);
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
	
	public void deleteNode(int d){
		System.out.println("Removing all "+d+"s");
		Node l = head;
		Node f = null;
		
		while(l != null){
			
			if(l.data == d){
				if(f == null){
					head = l.next;
					f = head;
				}
				else{
					f.next = l.next;
				}
			}
			else{
				f = l;
			}
			l = l.next;
		}
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
	
	public class Node{
		public Node next = null;
		public int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
}
