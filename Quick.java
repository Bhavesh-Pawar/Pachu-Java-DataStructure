public class Quick // 3 way Quick Sort N*logN Complexity
{
	public static void sort(int a[],int low,int high)
	{
		int v=a[low],lt=low,gt=high,i=low;
		if(high<=low) return;
		while(i<=gt)
		{
			if(a[i]<v) { int swap=a[lt]; a[lt]=a[i]; a[i]=swap; lt++;i++;}
		else if(a[i]>v) { int swap=a[i]; a[i]=a[gt]; a[gt]=swap; gt--;}
	else i++;}
	sort(a,low,lt-1);
	sort(a,gt+1,high);
	}
	public static void printf(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
	 int a[]={3,3,2,2,2,10,3,5,3,5,5,1,1};
	sort(a,0,a.length-1);
	printf(a);	
	}
}