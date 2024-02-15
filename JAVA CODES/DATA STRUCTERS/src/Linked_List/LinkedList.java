package Linked_List;

public class LinkedList {
protected Node head;

public LinkedList() {
	this.head=null; // we should only use this if there is no dummy head
}

public boolean isEmpty() {	
	return head==null;
}

public Node first() {
	return head;
}

public void insertAfter(int data,Node p) {
	if(p!= null){ // no need this control if there is a dummy head
		Node newNode= new Node(data,p.next);
		p.next=newNode;
	}
	else {
		Node newNode= new Node(data,head);
		head=newNode;
	}
		
}
public void add(Node n) {
	if(head==null) {
		head=n;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
				
			}
		temp.next=n;
		}
	
}
}
