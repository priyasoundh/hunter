import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		int i=0;
		while(n>0)
		{
			a[i]=n%10;
			n=n/10;
			i++;
		}
		n=i;
		int j=2;
		double sum=0;
		for(i=n-1;i>=0;i--)
		{
			sum=sum+Math.pow(a[i],j);
		}
		i=(int)sum;
		System.out.println(i);
	}
}
