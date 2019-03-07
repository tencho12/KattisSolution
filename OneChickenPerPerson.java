import java.util.*;

class OneChickenPerPerson
{
	public static void main(String [] arg)

	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int p=m-n;

		if(p>1)
			System.out.print("Dr. Chaz will have "+p+" pieces of chicken left over!");
		else if(p==0||p==1)
			System.out.print("Dr. Chaz will have "+p+" piece of chicken left over!");
		else if(p<0)
		{
			if(p==-1)
				System.out.print("Dr. Chaz needs "+(Math.abs(p))+" more piece of chicken!");
			else
				System.out.print("Dr. Chaz needs "+(Math.abs(p))+" more pieces of chicken!");

		}

	}
}