import java.util.*;
import java.lang.*;

class Statistics
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=1;
		List al=new ArrayList();
		int c=0;
		while (sc.hasNextInt())
		{
			n=sc.nextInt();
			c++;
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int t=arr[n-1]-arr[0];

			System.out.print("case "+c+":");
				System.out.println(" "+arr[0]+" "+arr[n-1]+" "+t);
		}
	}
}