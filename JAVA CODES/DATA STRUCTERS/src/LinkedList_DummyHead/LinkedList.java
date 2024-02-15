package LinkedList_DummyHead;



public class LinkedList {
protected Node head;

public LinkedList() {
	head= new Node(null,null); // we should only use this if there is a dummy head
}

public Node zeroth() {
	return head;
}
public Node first() {
	return head.next;
}
public boolean isEmpty() {	
	return first()==null;
}

public void insertAfter(int data,Node p) {
	
		Node newNode= new Node(data,p.next);
		p.next=newNode;
}

public Node find(Integer data) {
	Node curr=first();
	while(curr!=null) {
		if(curr.data.equals(data))
			return curr;
		curr=curr.next;
	}
	return null;
}

public Node findPrevious(Integer data) {
	Node curr=zeroth();
	while(curr.next!=null) {
		if(curr.next.data.equals(data))
			return curr;
		curr=curr.next;
	}
	return null;
}

public void remove(Integer data) {
	Node n=findPrevious(data);
	if(n != null)
		n.next=n.next.next;
}

public void print(){
	Node curr = first();
	System.out.println(" --> ");
	
	while(curr!=null) {
		System.out.println(curr.data.toString()+" --> ");
		curr=curr.next;
	}
	System.out.println("null");
}

public void makeEmpty() {
	head=new Node(null,null);
}
public void detectLoop() {
	Node slow=head;
	Node fast=head;
	int flag=0;
	while(slow!=null && fast!=null && fast.next!=null ) {
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) {
			flag=1;
			break;
		}
	}
	if(flag==1)
		System.out.println("Loop var");
	else 
		System.out.println("Loop yok");
}
public int KaçEleman() {
	Node curr=first();
	int sayaç=0;
	while(curr!=null) {
		sayaç++;
		curr=curr.next;
	}
	return sayaç;
}
public Node nThFromLast(int n) {
	Node curr=head;
	int length=KaçEleman();
	int konum=length-n+1;
	if(konum==1) {
		curr= head;
	}
	else {
		for(int i=1;i<konum;i++) {
				curr=curr.next;
			}
		}
	return curr;
}
public Node SonElemanýBul() {  // listeyi tersten yazdýrmak için
	Node curr=head;
	while(curr.next!=null) {
		curr=curr.next;
	}
	return curr;
}
public void Reverse() {
	Node lastElement=SonElemanýBul();
	System.out.println(lastElement.data);
	Node prevElement=findPrevious(lastElement.data);
	while(prevElement!=null) {
		System.out.println(prevElement.data);
		prevElement=findPrevious(prevElement.data);
		
	}
	
}
public void alternateSplit(LinkedList L1, LinkedList L2) {
	Node a=this.zeroth();
	Node b=L1.head;
	Node c=L2.head;
	int num=1;
	while(a!=null) {
		if(num%2!=0) {
		L1.insertAfter(a.data, b);
		b=b.next;
		num++;
		a=a.next;
	}
	else {
		L2.insertAfter(a.data, c);
		c=c.next;
		num++;
		a=a.next;
	}
	}
	
}
/*public void Toplama(LinkedList l1,LinkedList l2) {
	LinkedList yeni=new LinkedList();
	Node x=yeni.head;
	Node son1=l1.SonElemanýBul();
	Node son2=l2.SonElemanýBul();
	int kalan=0;
	while(son1!=null && son2!=null) {
		int sayý=son1.data+son2.data+kalan;
		kalan=0;
		if(sayý==10) {
			kalan=1;
			sayý=0;
			Node newNode=new Node(sayý);
			x.next=newNode;
			x=x.next;
		}
		else if(sayý>10) {
			kalan=sayý%10;
			sayý=sayý/10;
			Node newNode=new Node(sayý);
			x.next=newNode;
			x=x.next;
		}
		else {
			Node newNode=new Node(sayý);
			x.next=newNode;
			x=x.next;
		}
			son1=findPrevious(son1.data);
			son2=findPrevious(son2.data);
	}
}
*/

}

