import java.util.*;

class HeightOdering
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[21];
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<21;j++)
			{
				arr[j]=sc.nextInt();
			}
				for(int l=1;l<20;l++)
				{
					for(int k=l+1;k<21;k++)
					{
						if(arr[l]>arr[k])
							count++;

					}
				}
				System.out.println(arr[0]+" "+count);
		}
			
	}
}