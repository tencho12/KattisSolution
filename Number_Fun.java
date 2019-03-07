import java.io.*;
import java.util.*;
import java.math.*;

class Number_Fun
{
	public static void main(String tencho[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();

				if(a+b==c || Math.abs(a-b)==c || a*b==c || (((a/b)==c && (a%b)==0)|| (b/a)==c && (b%a)==0))
					System.out.println("possible");
				else
					System.out.println("Impossible");
		}
}

}