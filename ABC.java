import java.util.*;

class ABC
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int a=arr[0];
		int b=arr[1];
		int c=arr[2];

		String s=sc.next();
		for(int i=0;i<3;i++)
		{
			String s1=s.substring(i,i+1);
			if(s1.equals("A"))
				System.out.print(a+" ");
			else if(s1.equals("B"))
				System.out.print(b+" ");
			else if(s1.equals("C"))
				System.out.print(c+" ");
		}

	}
}
		