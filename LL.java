import java.util.Scanner;
class Node
{
	int info;
	Node next;
}
public class LL
{
	static Node first;
	public static void create()
	{
		Scanner scan=new Scanner(System.in);
		Node cpt =new Node();
		Node ptr =new Node();
		char i;
     System.out.print("Enter info of 1st Node :");
     ptr.info=scan.nextInt();
     first=ptr;
     do
     {
     System.out.print("Enter info for next Node :");
     cpt.info=scan.nextInt();
     ptr.next=cpt;
     ptr=cpt;
     System.out.print("Press 1 for continue...");
     i=scan.next().charAt(0);
     }while(i=='1');
     ptr.next=null;
	}
	public static void traverse()
	{
     Node ptr = new Node();
     ptr=first;
     while(ptr!=null)
     {
     	System.out.print(ptr.info+"    ");
     	ptr=ptr.next;
     }
     System.out.println();
	}
	public static void main(String[] args) {
		create();
		traverse();
	}
}