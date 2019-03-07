import java.util.*;

class Sibice
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int b=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			int z=sc.nextInt();
			int v=(l*l)+(b*b);
			double ans=Math.sqrt(v);
			if(ans>=z)
				System.out.println("DA");
			else
				System.out.println("NE");
		}
	}
}