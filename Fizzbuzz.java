import java.io.*;
import java.util.*;

class Fizzbuzz
{
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			if(i%x!=0&& i%y!=0)
			{
				System.out.println(i);
			}
			else if(i%x==0&&i%y==0)
				System.out.println("FizzBuzz");
			
			else if(i%x==0)
				System.out.println("Fizz");
			
			else if(i%y==0)
				System.out.println("Buzz");

			

		}
	}
}