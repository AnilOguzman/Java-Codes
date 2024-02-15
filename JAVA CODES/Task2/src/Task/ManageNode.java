package Task;

public class ManageNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(1);    // name i 1   left node null
		Node n2=new Node(n1,2);
		Node n3=new Node(n2,3);     // sað name
		Node n4=new Node(n3,4);
		Node n5=new Node(n4,5);
		Node n6=new Node(n5,6);
		Node n7=new Node(n6,7);
		Node n8=new Node(n7,8);
		Node n9=new Node(n8,9);
		
		System.out.println(n9.getPath());
		n5.LeftNode=null; //n5'in n4 ile olan baðlantýsýný kopardým.
		System.out.println(n4.getPath());
		System.out.println(n9.getPath());
	}

}
