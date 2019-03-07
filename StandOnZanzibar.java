import java.util.*;

class StandOnZanzibar
{
	public static void main(String tencho[])
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];

		for(int i=0; i<n; i++)
		{
			int s=0,n1=0,i1=0;

			while(true)
			{
				int n2= scan.nextInt();

				if(n2==0)
					break;
				if(n2>(2*n1)&&i1>0)
					s=s+(n2-(2*n1));
				n1=n2;
				i1++;
			}
			arr[i]=s;
		}
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}
}