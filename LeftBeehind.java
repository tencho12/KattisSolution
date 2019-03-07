import java.util.*;
import java.lang.*;

class LeftBeehind
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0&&y==0)
				break;

				if(x+y==13)
					System.out.println("Never speak again.");
				else if(x==y)
					System.out.println("Undecided.");
				else if(x>y)
					System.out.println("To the convention.");
				else if(y>x)
					System.out.println("Left beehind.");
		}	
	}
}