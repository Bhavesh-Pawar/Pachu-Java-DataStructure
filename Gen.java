public class Gen
{
	public static <T extends Comparable<T>> T max(T x[])
	{
		T max=x[0];
		for (int i=0;i<x.length;i++ ) 
		{
			if(x[i].compareTo(max)>0) max=x[i];	
		}
		return max;
	}
	public static void main(String[] args) {
		Integer a[]={3,5,2,1};
		String b[]={"ab","bc","cd"};
		System.out.println(max(a));
		System.out.println(max(b));
		//System.out.println(max());
	}
}