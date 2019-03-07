import java.io.*;
import java.util.*;

class Space
{
	public static void main(String tencho[])
	{
	Scanner sc= new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<>();
	int l =sc.nextInt();
	int n=sc.nextInt();
	int c=0;
	int r=1;
	for(int i=n;i<n;i++)
	{
		int in=sc.nextInt();
		
		for(int j=0;j<r;j++)
		{
			int in2=in-0;
			int 
			
			if(!arr.contains(in2))
			 arr.add(in2);	
			c=in2;
		}
		
		 
		r++;
	}
	System.out.print(arr.size());
	
}

}