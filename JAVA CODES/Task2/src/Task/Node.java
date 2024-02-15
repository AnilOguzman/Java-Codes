package Task;

public class Node {
	public Node LeftNode;
	public int name;
	
	Node(int name)
	{
		this.name=name;
		this.LeftNode=null;
	}
	Node(Node LeftNode,int name)
	{
		this.LeftNode=LeftNode;
		this.name=name;
	}
	public String getPath()
	{
		if(LeftNode==null)
			return name+"";
		return LeftNode.getPath()+"/"+name;
}
}