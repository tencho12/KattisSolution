import java.util.*;
import java.lang.*;

class Beavergnaw
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int d=1;
		int v=1;
		List al=new ArrayList();
		while(d!=0 && v!=0)
		{
			d=sc.nextInt();
			v=sc.nextInt();
			if(d!=0 && v!=0 && d<v)
			{
				float ne=(float)(Math.PI)*(float)Math.pow(d/2,2)*d;
				float m=(float)ne-v;
				float md=(float)(4*m)/(float)Math.PI;
				float dd=(float)Math.pow(md,(1/3));
				al.add(dd);
			}
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.printf("%.9f",al.get(i));
		}
	}
}