public class Heap <key extends Comparable<key>>
{
	Comparable pq[];
	int N;
	Heap(int capacity)
	{
		pq=(key[]) new Comparable[capacity];
		N=capacity-1;
	}
	public void sort(Comparable pq[])
	{
		this.pq=pq;
		int N=pq.length-1;
		for(int k=N/2;k>=1;k--)
		{
			sink(k,N);
		}
		while(N>1)
		{
			key temp=(key)pq[1];
			pq[1]=pq[N];
			pq[N]=temp;
			sink(1,--N);
		}
	}
	private void sink(int k,int N)
	{
		while(2*k<=N)
		{
			int j=2*k;
			if(k<N && less(j,j+1)) j++;
			if(!less(k,j)) break;
			key temp=(key)pq[k];
			pq[k]=pq[j];
			pq[j]=temp;
			k=j; 
		}
	}
	private boolean less(int i,int j)
	{
		return pq[i].compareTo(pq[j])<0;
	}
	public static void main(String[] args) 
	{
		Heap <Integer> obj =new Heap<Integer>(7);
		Integer a[]=new Integer[7];
		for (int i=1;i<=6 ;i++ ) 
		{
			a[i]=i;
		}
		obj.sort(a);
	}
}