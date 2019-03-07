import java.io.*;
import java.util.*;

class Hangover
{
	public static void main(String tencho[])
	{
	Scanner sc= new Scanner(System.in);
	double a= 0;
	do{
	a= sc.nextDouble();
	double ans=0;
	int n=2;
	int c=0;
	while(!(ans>=a))
	{
		float s= (float)1/n;
		ans= ans+s;
		n++;
		c++;
	}
	System.out.println(c);
	}while(a!=0.00);
	
}

}