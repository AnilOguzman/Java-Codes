package Linked_List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		
		Node n1=new Node(1);
		Node n2=new Node(2); 
		Node n3=new Node(3); 
		Node n4=new Node(4); 
		
		l.add(n1);
		l.add(n2);
		l.add(n3);
		l.add(n4);
		
		System.out.println(l.head.data);
		System.out.println(l.head.next.data);
		System.out.println(l.head.next.next.data);
		System.out.println(l.head.next.next.next.data);
		
		
		
		
	}

}
