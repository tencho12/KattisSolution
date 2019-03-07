import java.util.*;
import java.lang.*;

class JustaMinute
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=0;
		int s=0;
		List al=new ArrayList();
		List ml=new ArrayList();
	for(int i=0;i<n;i++)
		{
			m=sc.nextInt();
			s=sc.nextInt();
			if(m<=60&&s<=3600)
			{
				al.add(m);
				ml.add(s);
			}
		}

			double sum=0;
			double sum2=0;

			for(int i=0;i<al.size();i++)
			{
				int t=(int)al.get(i);
				sum=sum+(double)t;	
			}
			sum=sum*60;
			for(int i=0;i<ml.size();i++)
			{
				int z=(int)ml.get(i);
				sum2=sum2+(double)z;
			}
			
			double l=sum2/sum;
	
	if(l<1)
			{
				System.out.print("measurement error");	
			}
		else
			System.out.printf("%.9f",l);
	
	}
}