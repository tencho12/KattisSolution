import java.io.*;
import java.util.*;

class Cetvrta
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
				{
					arr[i][j]=sc.nextInt();
				}

		}
			if(arr[0][0]==arr[1][0])
			{
				System.out.print(arr[2][0]);
			}
			else if(arr[0][0]==arr[2][0])
			{
				System.out.print(arr[1][0]);
			}
			else 
			System.out.println(arr[0][0]);	

		if(arr[0][1]==arr[1][1])
			{
				System.out.print(" "+arr[2][1]);
			}
			else if(arr[0][1]==arr[2][1])
			{
				System.out.print(" "+arr[1][1]);
			}
			else 
			System.out.print(" "+arr[0][1]);	
		
		}
		
		}