import java.io.*;
import java.util.*;

class Dicecup
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n==m)
		{
			System.out.println((n+1));
		}
		else if(n<m)
		{
			n=n+1;
			m=m+1;
			for(int i=n;i<=m;i++)
			System.out.println(i);	
		}
		else if(n>m)
		{
			m=m+1;
			n=n+1;
			for(int i=m;i<=n;i++)
			System.out.println(i);
		}		
}
}