import java.util.Random;
public class Shuf
{
	public static void shuffle(int a[])
	{
		Random rand =new Random();
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int r=rand.nextInt(i+1);
			int swap=a[i];
			a[i]=a[r];
			a[r]=swap;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int a[]=new int[100];
		for(int i=0;i<=99;i++)
		{
			a[i]=i;
		}	
		shuffle(a);
	}
}