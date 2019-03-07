import java.util.*;
import java.lang.*;

class Skocimis
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int d=b-a;
		int d2=c-b;

		if(d2>d)
		{
			System.out.print(d2-1);
		}
		else
			System.out.print(d-1);
	}
}