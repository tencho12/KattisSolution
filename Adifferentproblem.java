import java.util.*;
import java.lang.*;

class Adifferentproblem
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		List al=new ArrayList();
		long a=1;
		while (sc.hasNextLong())
		{
			a=sc.nextLong();
			long b=sc.nextLong();

			long c=Math.abs(a-b);
			al.add(c);		    
	    }
		    
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	}
}