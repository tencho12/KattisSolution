import java.io.*;
import java.util.*;

class Trystring
{
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				nn=s.setcharAt(i, 'T');
			}	
		}
		System.out.println(nn);
		
	}
}