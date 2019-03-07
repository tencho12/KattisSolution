import java.io.*;
import java.util.*;

class Kemija
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next()+sc.nextLine();
		int n=s.length();
		char[] cha=s.toCharArray();
		char arr2[]={'a','e','i','o','u'};		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<5;k++)
			{
					if(cha[i]==arr2[k] && cha[i+1]=='p'&& cha[i+2]==arr2[k])
					{
						for(int j=i+1;j<n-2;j++)
						{
						cha[j]=cha[j+2];
						
						}
						n-=2;
					}
			}		
		}
			for(int k=0;k<n;k++)
			System.out.print(cha[k]);
		}
	}