import java.util.*;

class AlphabetSpam
{
	public static void main(String [] rko)
	{
		Scanner scan = new Scanner(System.in); 
		
		String s= scan.next();

		char arr[]= s.toCharArray();
		int ch[]={0, 0, 0 ,0};

		for(int i=0; i<s.length(); i++)
		{
			if(arr[i]=='_')
			{
				ch[0]++;
			}
			else if((int)arr[i]>96&&(int)arr[i]<123)
			{
				ch[1]++;
			}
			else if((int)arr[i]>64&&(int)arr[i]<91)
			{
				ch[2]++;
			}
			else
				ch[3]++;
		}
		for(int i=0; i<4; i++)
		{
			double y=10*ch[i]/s.length(),y1;
			int t=0;
			for(int j=0; j<15; j++)
			{
				y1=y*10;
				if(y%10!=y1%10)
				{
					t++;
					break;
				}
			}

			if(t==0)
				System.out.printf("%.16f\n",(double)ch[i]/s.length());
			else
				System.out.printf("%.15f\n",(double)ch[i]/s.length());
		}
			
	}
}