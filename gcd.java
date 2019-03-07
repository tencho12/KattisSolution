import java.io.*;
import java.util.*;

class Gcd{
	public static void main(String tencho[]){
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the first Number: ");
	int n1 = sc.nextInt();	//get user input as integer
	System.out.println("Enter the Second Number: ");
	int n2 = sc.nextInt();    //get user input as integer
	System.out.println("Select the operation:\n 1/ find gcd : \n 2/ find Multiplicative inverse :");
	int c = sc.nextInt(); //provide choice for the user to select the operation
		if(c == 1 ){
			int a = gcdfinder(n1,n2); //function call
			System.out.println("gcd is "+a);//find the gcb of the numbers
		}
		else{
			int b = inversefinder(n2,n1); //function call
			if(b==5)
				System.out.print("NO inverse since 'b' becomes 0"); //when there is no inverse
			else
			System.out.print("Multiplicative inverse  is "+b);	//print the inverse
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
		while (a > 1) 
		{
			q = a / b;
			temp = b;
			b = a % b; 
			a = temp;
			temp = x0; 
			x0 = x1 - q * x0; 
			x1 = temp;
		}
		if (x1 < 0) 
			x1 += b0;
		return x1;
	}
}