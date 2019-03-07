import java.util.*;

class Filip
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String r1 = new StringBuffer(a).reverse().toString();
		int x=Integer.parseInt(r1);
		String r2 = new StringBuffer(b).reverse().toString();
		int y=Integer.parseInt(r2);
		if(x>y)
			System.out.print(x);
		else
			System.out.print(y);

	}
}