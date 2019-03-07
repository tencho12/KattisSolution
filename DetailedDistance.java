import java.util.*;
import java.util.*;

class DetailedDistance
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		float x1=1;
		List al=new ArrayList();
		while(x1!=0)
		{
			x1=sc.nextFloat();
			if(x1!=0)
			{
				float y1=sc.nextFloat();
				float x2=sc.nextFloat();
				float y2=sc.nextFloat();
				float p=sc.nextFloat();

				float z1=Math.abs(x1-x2);
				float z2=Math.abs(y1-y2);
				float s1=(float)(Math.pow(z1,p))+(float)(Math.pow(z2,p));
				float pp=(float)Math.pow(s1,(1/p));
				al.add(pp);
			
			}
		}
		for(int i=0;i<al.size();i++)
			System.out.printf("%.10f\n",al.get(i));

	}
}