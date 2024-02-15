package BinaryTree;

import Stack.Stack_Array;

public class BinaryNodeOperations {
	
	BinaryNode root;
	
	BinaryNodeOperations(){
		root=null;
	}
	
	void preorder(BinaryNode t){	//root left right 
		  if (t != null) {
				System.out.print(t.data);
				preorder(t.left);
				preorder(t.right);
		  }
		}
	
	void inorder(BinaryNode t){	 //left root right 
		  if (t != null) {
				inorder(t.left);
				System.out.print(t.data);
				inorder(t.right);
		  }
	}
	
	void postorder(BinaryNode t){	//left right root 
		  if (t != null) {
			  postorder(t.left);
			  postorder(t.right);
			  System.out.print(t.data);
		  }
	}
	
	int findMax(BinaryNode t) 
	{
	     
		int max = 0;
		if (t != null) {
	       max = t.data;  
	       int left = findMax(t.left);
			// Compare left against root
	       if (t.left != null && left>max)
	            max = left;
			int right = findMax(t.right);
			// Compare right against root
	       if (t.right != null 
				&& right>max)
	            max = right;
	   }
	   return max;
	}
	public static int max =-1;
	int findMax1(BinaryNode t) 
	{
		if (t != null) {
			if(max<t.data) max=t.data;
			findMax1(t.left);
			findMax1(t.right);
	  }
		return max;
	}
	int maxDepth(BinaryNode node)
    {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
  
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
	
	BinaryNode mirror(BinaryNode node)
    {
        if (node == null)
            return node;
 
        /* do the subtrees */
        BinaryNode left = mirror(node.left);
        BinaryNode right = mirror(node.right);
 
        /* swap the left and right pointers */
        node.left = right;
        node.right = left;
 
        return node;
    }

	
	public void isIdentical(BinaryNode t,BinaryNode p,Stack_Array x,Stack_Array w) {
		
		
		
		if (t != null) {
			x.push(t.data);
			isIdentical(t.left,null,x,w);
			isIdentical(t.right,null,x,w);
	  }
		
		
		if (p != null) {
			w.push(p.data);
			isIdentical(null,p.left,x,w);
			isIdentical(null,p.right,x,w);
	  }		
	}
	
	public Boolean isSymetric(BinaryNode t,BinaryNode p) {
		
		if(t==null && p==null) {
			return true;
		}
		
		if(t!=null && p!=null && t.data==p.data) {
			boolean a=isSymetric(t.left,p.right);
			boolean b=isSymetric(t.right,p.left);
			return a&&b;
		}
		
		
		return false;
	}
	
	public int isBST(BinaryNode t,Flag flag){
		
		
		if(t==null) {
			return 0;
		}
		
		
			int ana=t.data;
			
			int a=isBST(t.left,flag);
			
			int b=isBST(t.right,flag);
			
			if(ana<a || ana>b && (a!=0 && b!=0) ) {
				flag.flag=false;
			}
			
		
		
		
		
		return t.data;
	}
	
	public boolean isbst(BinaryNode t) { //yarým bu 
		if(t==null) {
			return true;
		}
		if(t.left==null && t.right==null) {
			return true;
		}

		if(t.left.data>t.data || t.right.data<t.data) {    //burasý hata veriyo
			return false;
		}
		else {
			boolean a=isbst(t.left);
			boolean b=isbst(t.right);
			
			if(a&&b) { 
				return true;
				}
			else { 
				return false; 
				}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
