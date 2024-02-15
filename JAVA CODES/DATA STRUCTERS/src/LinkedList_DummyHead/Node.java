package LinkedList_DummyHead;


public class Node {
	
	protected Integer data;
	protected Node next;
	
	public Node(Integer data,Node next) {
		this.data=data;
		this.next=next;
	
	}
	public Node(Integer data) {
		this.data=data;
	}
}
