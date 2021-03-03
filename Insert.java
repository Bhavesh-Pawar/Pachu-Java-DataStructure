public class Insert
{
	public static void sort(int a[]) 
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j>0;j--)
				{if(a[j]<a[j-1])
					{int swap=a[j];
					a[j]=a[j-1];
					a[j-1]=swap;}
					else break;}
			for (int x=0;x<n ;x++ ) {
					System.out.print(a[x]+" ");
				}
				System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int a[]={10,7,1,5,8};
		sort(a);
	}
}