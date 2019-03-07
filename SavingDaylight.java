import java.util.*;
import java.lang.*;

class SavingDaylight
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String s=sc.next()+sc.nextLine();
			String ss[]=s.split(" ");

			String []s3= ss[3].split(":");
			String []s4= ss[4].split(":");
		
		
		
			int h1=Integer.parseInt(s4[0]);
			int h2=Integer.parseInt(s3[0]);
			int m1=Integer.parseInt(s4[1]);
			int m2=Integer.parseInt(s3[1]);

			if(m2>m1)
			{
				m1=m1-m2+60;
				h1--;
				h1=h1-h2;
			}
			else
			{
				m1=m1-m2;
				h1=h1-h2;	
			}
			System.out.println(ss[0]+" "+ss[1]+" "+ss[2]+" "+h1+" hours "+m1+" minutes");
		
		}

	}
}