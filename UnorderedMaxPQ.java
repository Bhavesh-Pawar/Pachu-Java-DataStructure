public class UnorderedMaxPQ<key extends Comparable<key>>
{
	private key pq[];
	int N;
	UnorderedMaxPQ(int capacity)
	{
		pq=(key [])new Comparable[capacity];
	}
	public void insert(key x)
	{
		pq[N++]=x;
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	public key delMax()
	{
		int max=0;
		for(int i=0;i<N;i++)
		{
			if(pq[max].compareTo(pq[i])<0) max=i;
		}
		int t=N-1;
		key temp=pq[max];
		pq[max]=pq[t];
		pq[t]=temp;
		return pq[--N];
	}
	public static void main(String[] args) 
	{
		UnorderedMaxPQ<Integer> obj=new UnorderedMaxPQ<Integer>(5);
	for(int i=1;i<=4;i++)
	{
		obj.insert(i);
	}
	System.out.println(obj.delMax());
	}
}