public class MaxPQ <key extends Comparable<key>>
{
	private key []pq;
	int N;
	public MaxPQ(int capacity)
	{
		pq=(key []) new Comparable[capacity];
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	private boolean less(int i,int j)
	{
		return pq[i].compareTo(pq[j])<0;
	}
	public void insert(key x)
	{
		pq[++N]=x;
		swim(N);
	}
	public key delMax()
	{
		key max=pq[1];
		int t=N--;
		key temp=pq[1];
		pq[1]=pq[t];
		pq[t]=temp;
		sink(1);
		pq[N+1]=null;
		return max;
	}
	private void swim(int k)
	{
		while(k>1 && less(k/2,k))
		{
			key temp=pq[k];
			pq[k]=pq[k/2];
			pq[k/2]=temp;
			k=k/2;
		}
	}
	private void sink(int k)
	{
		while(2*k<=N)
		{
			int j=2*k;
			if(k<N && less(j,j+1)) j++;
			if(!less(k,j)) break;
			key temp=pq[k];
			pq[k]=pq[j];
			pq[j]=temp;
			k=j; 
		}
	}
	public static void main(String[] args) 
	{
	MaxPQ <Integer> obj= new MaxPQ<Integer>(5); 
	MaxPQ <Character> obj2=new MaxPQ<Character>(5);
	for(int i=1;i<=4;i++)
	{
		obj.insert(i);
	}
	for (char i='a';i<='d' ;i++ ) 
	{
		obj2.insert(i);	
	}
	System.out.println(obj.delMax());
	System.out.println(obj2.delMax());	
	} 
}