import java.util.*;

class Zamka
{
	public static void main(String [] rko)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int x= scan.nextInt();
		int t,r;
		
		for(int i=n;; i++)
		{
			r=0;
			t=i;
			while(t!=0)
			{
				r+=t%10;
				t/=10;
			}

			if(r==x)
			{
				System.out.println(i);
				break;
			}
		}

		
		for(int i=m;; i--)
		{
			r=0;
			t=i;
			while(t!=0)
			{
				r+=t%10;
				t/=10;
			}
			if(r==x)
			{
				System.out.println(i);
				break;
			}
		}
	}
}