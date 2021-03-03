import java.util.*;
class BST<Key extends Comparable<Key>,Value>
{
	 Node root;
	class Node
	{
	Key key;
	Value value;
	Node left,right;
	Node(Key key,Value value)
	{
		this.key=key;
		this.value=value;
	}
	}
	public void put(Key k,Value v)
	{
		root=put(root,k,v);
	}
	private Node put(Node x,Key k,Value v)
	{
		if(x==null) return new Node(k,v);
		int cmp=k.compareTo(x.key);
		if(cmp<0) x.left=put(x.left,k,v);
		else
			if(cmp>0) x.right=put(x.right,k,v);
		else x.value=v;
		return x;
	}
	public Value get(Key k)
	{
		Node x=root;
		while(x!=null)
		{
		int cmp=k.compareTo(x.key);
		if(cmp < 0) x=x.left;
		else if(cmp>0) x=x.right;
		else return x.value;
		}
		return null;
	}
	public Key min()
	{
		Node temp=min(root);
		return temp.key;
	}
	private Node min(Node x)
	{
		Node temp=x;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp;
	}
	public void delMin()
	{
		root=delMin(root);
	}
	private Node delMin(Node x)
	{
		if(x.left==null) return x.right;
		x.left=delMin(x.left);
		return x;
	}
	public void preOrder(Node x)
	{
		if(x==null) return;
		System.out.print(x.key+"==>"+x.value+" ");
		preOrder(x.left);
		preOrder(x.right);
	}
	public void postOrder(Node x)
	{
		if(x==null) return;
		postOrder(x.left);
		postOrder(x.right);
		System.out.print(x.key+"==>"+x.value+" ");
	}
	public void inOrder(Node x)
	{
		if(x==null) return;
		postOrder(x.left);
		System.out.print(x.key+"==>"+x.value+" ");
		postOrder(x.right);
	}
	public void levelOrder(Node x)
	{
		Queue <Node> o=new LinkedList<Node>();
		o.add(x);
		while(!o.isEmpty())
		{
			Node temp=o.poll();
			System.out.print(temp.key+"==>"+temp.value+" ");
		if(temp.left!=null) o.add(temp.left);
		if(temp.right!=null) o.add(temp.right);
		}
	}
	public void preOrder()
	{
		preOrder(root);
		System.out.println();
	}
	public void postOrder()
	{
		postOrder(root);
		System.out.println();
	}
	public void inOrder()
	{
		inOrder(root);
		System.out.println();
	}
	public void levelOrder()
	{
		levelOrder(root);
		System.out.println();
	}
	public void delete(Key key)
	{
		root=delete(root,key);
	}
	private Node delete(Node x,Key key)
	{
		if(x==null) return null;
		int cmp=key.compareTo(x.key);
		if(cmp<0) x.left=delete(x.left,key);
		else if(cmp>0) x.right=delete(x.right,key);
		else
		{
			if(x.left==null) return x.right;
			if(x.right==null) return x.left;
			Node temp=x;
			x=min(temp.right);
			x.right=delMin(temp.right);
			x.left=temp.left;
		}
		return x;
	}
	public static void main(String[] args) 
	{
		BST <String,Integer> obj=new BST <String,Integer>();
		obj.put("abhishek",4);
		obj.put("bhavesh",1);
		obj.put("ayush",2);
		obj.put("aabhash",3);
		obj.put("chaheti",5);
		obj.put("aavesh",6);
		/*System.out.println("PreOrder:");
		obj.preOrder();
		System.out.println("PostOrder");
		obj.postOrder();
		System.out.println("InOrder:");
		obj.inOrder();*/
		System.out.println("levelOrder:");
		obj.levelOrder();
		//System.out.println(obj.get("bhavesh"));
		//System.out.println(obj.get("ayush"));
		obj.delete("aabhash");
		System.out.println("levelOrder:");
		obj.levelOrder();
	}
}