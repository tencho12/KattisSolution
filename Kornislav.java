import java.io.*;
import java.util.*;

class Kornislav
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[4];
		int temp;
		int area;
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<4;i++)
		{
			for(int j=1; j < (4-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
		}
		
		area=arr[0]*arr[2]; 
		System.out.println(area);
	             
	}
}

 