import java.io.*;
import java.util.*;

class AB
{
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String arr=sc.next();
		int count1=0,count2=0,count3=0;
		for(int i=0;i<5;i++)
		{

			if(arr.charAt(i)=='T')
				count1++;
			else if(arr.charAt(i)=='C')
				count2++;
			else if(arr.charAt(i)=='G')
				count3++;

		}
		int sum=(count1*count1)+(count2*count2)+(count3*count3)+7;
		System.out.println(sum);
	}
}