import java.util.*;

class Regici2
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		int a=1;int b=0;
		int temp;
			for(int i=0;i<k;i++)
			{
				temp=b;
				b=b+a;
				a=temp;

			}	
			System.out.print(a+" "+b);
	}
}