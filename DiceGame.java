import java.util.*;

class DiceGame
{
	public static void main(String [] rko)
	{
		Scanner scan = new Scanner(System.in);
		int n=0, m=0;

		
		for(int j=0;j<4; j++)
		{
			int q= scan.nextInt();
			n+=q;
		}
		for(int j=0;j<4; j++)
		{
			int q= scan.nextInt();
			m+=q;
		}

		if(m==n)
			System.out.print("Tie");
		else if (m>n)
			System.out.print("Emma");
		else
			System.out.print("Gunnar");
	}
}