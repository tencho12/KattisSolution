import java.io.*;
import java.util.*;

class Areaofcircle
{
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		float area,tarea;
	//	int r=1,m=1,c=1;
	
		int r=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		while(r!=0&&m!=0&&c!=0)
		{
			

			if(0<r&&r<=1000&&1<=m&&m<=100000&&0<=c&&c<=m)
			{
			
				
				area=c/m;
				tarea=(22/7)*r*r;

				System.out.print("%0.5f",+tarea);
				System.out.print("%0.5f",+area);
				break;
			}
		}
		
	}
}