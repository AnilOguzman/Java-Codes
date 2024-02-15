package BinaryTree;

import Stack.Stack_Array;

public class BinaryNodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNodeOperations myBT=new BinaryNodeOperations();
		BinaryNode bt2= new BinaryNode(2,null,null);
		BinaryNode bt7= new BinaryNode(7,null,null);
		BinaryNode bt9= new BinaryNode(9,null,null);
		BinaryNode bt6= new BinaryNode(6,null,null);
		BinaryNode bt5= new BinaryNode(5,null,null);
		BinaryNode bt11= new BinaryNode(11,null,null);
		BinaryNode bt3= new BinaryNode(3,null,null);
		myBT.root=bt2;
		bt2.left=bt7;
		bt2.right=bt9;
		bt7.left=bt3;
		bt7.right=bt6;
		bt6.left=bt5;
		bt6.right=bt11;
		
		BinaryNodeOperations myCT=new BinaryNodeOperations();
		BinaryNode ct2= new BinaryNode(2,null,null);
		BinaryNode ct7= new BinaryNode(7,null,null);
		BinaryNode ct9= new BinaryNode(9,null,null);
		BinaryNode ct6= new BinaryNode(6,null,null);
		BinaryNode ct5= new BinaryNode(5,null,null);
		BinaryNode ct11= new BinaryNode(11,null,null);
		BinaryNode ct3= new BinaryNode(3,null,null);
		myCT.root=ct2;
		ct2.left=ct7;
		ct2.right=ct9;
		ct7.left=ct3;
		ct7.right=ct6;
		ct6.left=ct5;
		ct6.right=ct11;
//		BinaryNodeOperations myCT=new BinaryNodeOperations(); //simetrik aðaç
//		BinaryNode ct2= new BinaryNode(1,null,null);
//		BinaryNode ct7= new BinaryNode(2,null,null);
//		BinaryNode ct9= new BinaryNode(2,null,null);
//		BinaryNode ct6= new BinaryNode(3,null,null);
//		BinaryNode ct5= new BinaryNode(4,null,null);
//		BinaryNode ct11= new BinaryNode(3,null,null);
//		BinaryNode ct3= new BinaryNode(4,null,null);
//		myCT.root=ct2;
//		ct2.left=ct7;
//		ct2.right=ct9;
//		ct7.left=ct6;
//		ct7.right=ct5;
//		ct9.left=ct3;
//		ct9.right=ct11;
		
		BinaryNodeOperations myDT=new BinaryNodeOperations(); //binary search tree
		BinaryNode dt2= new BinaryNode(1,null,null);
		BinaryNode dt7= new BinaryNode(2,null,null);
		BinaryNode dt9= new BinaryNode(3,null,null);
		BinaryNode dt6= new BinaryNode(4,null,null);
		BinaryNode dt5= new BinaryNode(5,null,null);
		BinaryNode dt11= new BinaryNode(6,null,null);
		BinaryNode dt3= new BinaryNode(7,null,null);
		myDT.root=dt5;
		dt5.left=dt7;
		dt5.right=dt11;
		dt11.right=dt3;
		dt7.left=dt2;
		dt7.right=dt9;
		dt9.right=dt6;
		
		
		
//		myBT.preorder(myBT.root);
//		System.out.println();
//		
//		myBT.inorder(myBT.root);
//		System.out.println();
//		
//		myBT.postorder(myBT.root);
//		System.out.println();
		
//	int max=myBT.findMax1(myBT.root);
//	System.out.println("max is: "+max);
		
//		System.out.println("leaf count is: "+ getLeafCount1(myBT.root));
//		
//		System.out.println("max height is: "+ maxHeight(myBT.root));
//		
//		int depth=myBT.maxDepth(myBT.root);
//		System.out.println("max depth is: "+depth); 
	
//	BinaryNode x=myBT.mirror(myBT.root);
//	System.out.println(x.left.data);	

        
//		Stack_Array x=new Stack_Array();
//		Stack_Array w=new Stack_Array();
//       myBT.isIdentical(myBT.root,myCT.root,x,w);
//        esitmi(x,w);
		
//		boolean a=myBT.isSymetric(myCT.root, myCT.root);
//		System.out.println(a);
		
//		Flag f=new Flag();
//		myDT.isBST(myDT.root, f);
//		System.out.println(f.flag);
		
		
		System.out.println(myDT.isbst(myDT.root));
	}
	 
	static int getLeafCount(BinaryNode n) {
		   if(n == null) 
			   return 0;
		   if(n.left == null && n.right == null) 
			   return 1;
		   else return getLeafCount(n.left)
		               + getLeafCount(n.right);
	}
	
	static int getLeafCount1(BinaryNode n) {
		int toplam=0;
		if(n.left==null && n.right==null) {
			return 1;
		}
		
		
		int leftLeaf=getLeafCount1(n.left);
		int rightLeaf=getLeafCount1(n.right);
		
		 toplam+=leftLeaf+rightLeaf;

		
		
		return toplam;
	}
	static int maxHeight(BinaryNode n) {
		  if(n == null) 
			  return -1;
		  
		  int lHehight = maxHeight(n.left);
		  int rHeight = maxHeight(n.right);
  
		  return Integer.max(lHehight, rHeight) +1;
	}

	
	public static void esitmi(Stack_Array x,Stack_Array w) {   
		boolean Flag=true;
		
		while(!x.isEmpty() && !w.isEmpty()) {
			int a=x.pop();
			int b=w.pop();
			if(a!=b) {
				Flag=false;
			}
		}
		if(!x.isEmpty() && w.isEmpty() || x.isEmpty() && !w.isEmpty()) {
			Flag=false;
		}
		System.out.println(Flag); 
	}

}
