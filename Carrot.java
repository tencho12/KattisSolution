import java.io.*;
import java.util.*;

class Carrot
{
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next()+sc.nextLine();
		}
		System.out.print(m);		
	}
}