package LinkedList_DummyHead;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list= new LinkedList();
		
		Node n5=new Node(5,null);
		Node n4=new Node(4,n5);
		Node n3=new Node(3,n4);
		Node n2=new Node(2, n3);
		list.head.next=n2; 
		list.head.data=1;

		LinkedList list1= new LinkedList();
		Node n6=new Node(9);
		Node n7=new Node(3);
		list1.head.next=n6;
		n6.next=n7;
		
		
		
		
	/*	
	System.out.println(list.head.data);
		System.out.println(list.head.next.data);
		System.out.println(list.head.next.next.data); 
		//list.print();
		
		list.detectLoop();
		
		/*Node x=list.nthToLast(2);
		System.out.println(x.data);*/
		
		
//		int length=list.KaçEleman();   /*Kaç elemanlý liste onu bulduk*/
//		System.out.println(length);
		
	//	Node deneme=list.nThFromLast(4); /*Sondan kaçıncı bulma yöntemi*/
	//	System.out.println(deneme.data);
		
	//	list.Reverse();  // listeyi tersten yazdýrma 
		
	
	}

}
