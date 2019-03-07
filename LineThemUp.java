import java.util.*;
import java.lang.*;

class LineThemUp
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		int ch=0;
		if(n>=2&&n<=20)
		{
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.next();
			}
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j].compareTo(arr[i])<0)
					ch++;
			}
		}
		if(ch==0)
		System.out.print("INCREASING");
		else if(ch==((n*n)-n)/2)		
			System.out.print("DECREASING");
		else
			System.out.print("NEITHER");

	}
}