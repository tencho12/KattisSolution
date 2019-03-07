import java.io.*;
import java.util.*;
import java.math.*;

class pattern2
{
	public static void main(String tencho[])
	{
		for(int i=0;i<3;i++)
		{		
			for(int j=0;j<4;j++)
			{
				if(i==1 && j==1 || i==1 && j==2 || i==0 && j==3 || i==2 && j==3 )
				System.out.print("   ");
			else
				System.out.print(" * ");
			}
			System.out.println();
		}	
}

}