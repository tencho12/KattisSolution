import java.util.*;
import java.lang.*;

class CatandMouse
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		int t=0;
		int j=0;
		List <String> rw=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			r=sc.nextInt();
			t=sc.nextInt();
			j=sc.nextInt();

			double jd=2*Math.PI*r;
			double td=r;
			double tj=jd/j;
			double tt=td/t;

			if(tj>tt)
				rw.add("YES");
			else
				rw.add("NO");
		}
		for(int i=0;i<rw.size();i++)
			System.out.println(rw.get(i));
}
}