package Tree;


public class TreeOperations {
	TreeNode root;
	
	public TreeOperations() {
		root=null;
	}
	
	public void listAll (TreeNode eleman)
	{	 

		if(eleman!=null) {
			
			listAll(eleman.firstChild);
			System.out.println(eleman.directory_name);
			
		
			
			
		}
		
		
	}
	
	int total_size=0;
	public int listAllSizes(TreeNode eleman)
	{
		if(eleman.firstChild==null) {
			
		}
		listAllSizes(eleman.nextSibling);
		TreeNode x=eleman.firstChild;
		int toplam=0;
		System.out.print(eleman+": ");
		while(x!=null) {
			toplam+=x.directory_size;
			x=x.nextSibling;
		}
		System.out.println(toplam);
		
		
		return 0;
	}
}
