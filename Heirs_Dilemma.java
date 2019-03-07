import java.util.*;
import java.lang.*;
class Heirs_Dilemma {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);

		
		String s=sc.next();
		int l=Integer.parseInt(s);
		int h=sc.nextInt();
		if(h>987654)
			h=987654;
		int count=0;


		for(int i=l;i<=h;i++)
		{
			s=Integer.toString(i);
			int c=0;
			if(repeater(i)==0)
			{

				for(int j=0;j<s.length();j++)
					{
						int a=Integer.parseInt(s.valueOf(s.charAt(j)));
				
						if(a>0 && i%a==0)
						{
							c++;
						}
					else
						break;	
					}		
				if(c>5)
					count++;
			}
		}
		System.out.print(count);
		
		sc.close();
	}

	static int repeater(int a)
	{
		int count3=0;
		String s=Integer.toString(a);

		for(int j=0;j<s.length();j++)
			{
				for(int k=j+1;k<s.length();k++)
				{
					if(s.charAt(j)==s.charAt(k))
						count3++;
				}
			}
			return count3;
	}
}