import java.util.*;

class Aaah
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		String a=sc.next()+sc.nextLine();
		String b=sc.next()+sc.nextLine();

		if(a.length()<b.length())
			System.out.println("no");
		else 
			System.out.println("go");
	}
}