import java.util.*;
import java.lang.*;

class JumbledCompass
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	
	if(a>b)
	{
		int s=a-b;
		if(s<=180)
		{
			System.out.print(s);
		}
		else
		{
			s=360-s;
			System.out.print(s);
		}
	}
	if(a<b)
	{
		int s=a-b;
		if(s>=-180)
		{
			s=s*-1;
			System.out.print(s);
		}
		else
		{
			s=s+90;
			System.out.print(s);
		}
	}
	if(a==b)
		System.out.print("0");
		
	}
}