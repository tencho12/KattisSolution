import java.io.*;
import java.util.*;

class AaddB
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sc.nextLine();
		}

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=i+2;k<n;k++)
				{
					if(arr[i]+arr[j]==arr[k])
					count++;
				}
			}
		}

		System.out.println(count*2);
	}
}