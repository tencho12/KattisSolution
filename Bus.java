import java.util.*;

class Bus
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int r=sc.nextInt();
			double z=0;
			for(int j=0;j<r;j++)
				z=(z+0.5)*2;
			int v=(int)z;
			System.out.println(v);
		}
	}
}