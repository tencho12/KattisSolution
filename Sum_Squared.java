import java.util.*;
import java.lang.*;
class Sum_Squared {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);

		int l=sc.nextInt();
		
		for(int i=1;i<=l;i++)
		{
			int sum=0;
			int k=sc.nextInt(); int b=sc.nextInt();  int n=sc.nextInt();
			while(n>0)
			{
				int r=n%b;
				sum+=Math.pow(r,2);
				n/=b;
			}
			System.out.println(i+" " + sum);
		}

		
		sc.close();
	}
}