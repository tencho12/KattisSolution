import java.io.*;
import java.util.*;
import java.lang.*;

class Soylent
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				arr2[i]=(int)Math.ceil((float)arr[i]/400);
			}
			for(int j=0;j<n;j++)
				System.out.println((arr2[j]));
	}
}
