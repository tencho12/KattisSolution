import java.io.*;
import java.util.*;

class Smart_phone
{
	public static void main(String tencho[])
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	List<String> ls=new ArrayList<String>();

	for(int i=0;i<n;i++)
	{
		String actual=sc.next();
		String half=sc.next();
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();

		for(int i=0;i<actual.length();i++)
		{
			if(half.equals(s1.substring(i,half.length()+i)))
				System.out.print(s1);	
		}

		
	}
 }

}