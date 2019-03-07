import java.io.*;
import java.util.*;

class Modulo
{
	public static void main(String tencho[])
	{
	Scanner sc= new Scanner(System.in);
	int c=0;
	ArrayList<Integer> arr=new ArrayList<>(); 
	for(int i=0;i<10;i++)
	{
		int n=sc.nextInt();
		int mod=n%42;
		 
		 if(!arr.contains(mod))
		 arr.add(mod);

	}
	System.out.print(arr.size());
	
}

}