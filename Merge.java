public class Merge
{
	static int x[];
	static int y[];
	public static void merge(int a[],int low,int mid,int high)
	{
		int b[]=new int[a.length];
		x=a;
		y=b;
		int i=low,j=mid+1;
		int k=0;
		while(i<=mid && j<=high)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[i];i++;
			}
			else {b[k]=a[j];j++;}
			k++;
		}
		if(i>mid)
		{
			while(j<=high)
			{
				b[k]=a[j]; j++;k++;
			}
		}
		else
			{
				while(i<=mid)
				{
					b[k]=a[i];i++;k++;
				}
			}
			for (int x=0;x<a.length ;x++) 
			{
			a[x]=b[x];	
			}
	}
	public static void sort(int a[],int low,int high)
	{
		if(high<=low) return;
		else
			{int mid=(low+high)/2;
		sort(a,low,mid);
		sort(a,mid+1,high);
		merge(a,low,mid,high);
		printf(a);
		}
	}
	public static void printf(int a[])
	{
		for (int i=0;i<a.length ;i++ ) 
		{
			System.out.print(x[i]+" ");	
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int a[]={1,8,10,2,3,5,7};
		sort(a,0,a.length-1);
	}
}