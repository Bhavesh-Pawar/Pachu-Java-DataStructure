class Stk
{
	int s[];
	int top=0;
	Stk()
	{
		s=new int[1];
	}
	public void push(int x)
	{
		if(top==s.length)
		{
			resize(2*s.length);
		}
		s[top++]=x;
		System.out.println(x+" : inserted");
	} 
	public int pop()
	{
		if(top>0 && top<(s.length/4)) resize(s.length/2);
		int item=s[--top];
		return item;
	}
	public void resize(int capacity)
	{
		int copy[] =new int[capacity];
		for(int i=0;i<top;i++)
		{
			copy[i]=s[i];
		}
		s=copy;
	} 
}
public class Res
{
	public static void main(String[] args) 
	{
		Stk obj =new Stk();
		obj.push(4);
		obj.push(10);
		obj.push(15);
		System.out.println(obj.pop()+" : popped");
		System.out.println(obj.pop()+" : popped");
	}
}