import java.io.*;
import java.util.*;

class Gcd_recursive{
	public static void main(String tencho[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first Number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second Number: ");
	int n2 = sc.nextInt();
	System.out.println("Select the operation:\n 1/ find gcd : \n 2/ find Multiplicative inverse :");
	int c = sc.nextInt();
		if(c == 1 ){
			int a = gcdfinder(n1,n2);
			System.out.println("gcd is "+a);
		}
		else{
			int b = inversefinder(n2,n1);
			if(b==1)
				System.out.print("NO inverse");
			else
			System.out.print("Multiplicative inverse  is "+b);	
		}
	}

	static int gcdfinder(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcdfinder(b,a%b);
		}
	}
	static int inversefinder(int a, int b)
	{
		int b0 = b, temp, q;
		int x0 = 0, x1 = 1;
		if (b == 1) 
			return 1;
		if(a>1) 
		{
			q = a / b;
			if(q==0)
			{
				return 1;
				break;
			}
			temp = b;
			x0 = x1 - q * x0; 
			x1 = temp;
			b = a % b; 
			a = temp;
			temp = x0;
			return inversefinder(a,b) 
		}
		if (x1 < 0) 
			x1 += b0;
		return x1;
	}
}