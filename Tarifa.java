import java.util.*;//completed

class Tarifa
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int arr[]=new int[s];
		int sum=n;
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<s;i++)
		{
			
			if(arr[i]<n)
				sum=sum+(n-arr[i]);
			else if(arr[i]>n)
			{
				int r=n-arr[i];
				sum=sum+r;
			}
		}
		System.out.println(sum);
	}
}