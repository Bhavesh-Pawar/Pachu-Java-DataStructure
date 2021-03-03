    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }


    }
class LL
{
    Node root;
    private Node insert(Node root,int data)
    {
        if (root==null)
        {root=new Node(data);
            return root;}
        else
        { 
        Node temp=root;
        Node newNode=new Node(data);
        while(temp.next!=null)
        {                 
            temp=temp.next;
        }
        temp.next=newNode;   
        }
        return root;
    }
    private void print(Node root)
    {
        Node temp=root;
        while(temp!=null) 
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insert(int data)
    {
        root=insert(root,data);
    }
    public void print()
    {
        print(root);
    }
    private Node delete(Node root, int data)
    {
        Node temp=root;
        Node next=null;
        boolean b=false;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                next=temp.next;
                b=true;
                break;
            }
            else
                temp=temp.next;
        }
        temp.next=next;
        if(b==true) System.out.println(data + " got deleted.");
        else System.out.println("No such Element");
        return root;
    }
    private Node reverse(Node root)
    {
       Node pre=null,next=null;
       Node temp=root;
       while(temp!=null)
       {
           next=temp.next;
           temp.next=pre;
           pre=temp;
           temp=next;
       }
       root=pre;
       return root;
    }
    public void delete(int data)
    {
        root=delete(root,data);
    }
    public void reverse()
    {
        root=reverse(root);
    }
    private Node deleteDuplicate(Node root)
    {
        Node current=root;
        while(current!=null)
        {
            Node temp=current;
            while(temp!=null && temp.data==current.data)
            {
                temp=temp.next;
            }
            current.next=temp;
            current=current.next;
        }
        return root;
    }
    public void deleteDuplicate()
    {
        root=deleteDuplicate(root);
    }
            
}
public class LinkedList_
{
    public static void main(String[] args) 
    {
        LL obj=new LL();
        obj.insert(1);
        obj.insert(1);
        obj.insert(2); 
        obj.insert(3);
        obj.insert(3);
       // obj.insert(4);
        obj.deleteDuplicate();
        obj.print();
    }
    
}
