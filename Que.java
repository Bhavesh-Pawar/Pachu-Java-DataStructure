import java.util.*;
public class Que<T>
{
	Stack<T> s1,s2;
	Que()
	{
		 s1= new Stack<T>();
		 s2= new Stack<T>();
	}
	public void enqueue(T x)
	{
		s1.push(x);
		System.out.println(x+" : inserted");
	}
	public void dequeue()
	{
		if(s2.empty())
		{
			while(!s1.empty())
			{
				T item=s1.pop();
				s2.push(item);
			}
		}
		System.out.println(s2.pop()+" : removed");
	}
	public static void main(String[] args) 
	{
			Que obj=new Que();
			obj.enqueue(4);
			obj.enqueue("bhavesh");
			obj.enqueue(1.005);
			obj.dequeue();	
			obj.dequeue();
	}

} 