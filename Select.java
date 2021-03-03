public class Select
{

	public  void sort(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[min])
					min=j;
				int swap=a[i];
				a[i]=a[min];
				a[min]=swap;
				for (int x=0;x<n ;x++ ) {
					System.out.print(a[x]+" ");
				}
				System.out.println();
		}
	} 
	public static void main(String[] args) 
	{
		Select oj=new Select();
		int a[]={10,7,1,5,8};
		//char b[]={'S','O','R','T','E','X','A','M','P','L','E'}; 
		oj.sort(a);
		//oj.sort(b);
	}
}