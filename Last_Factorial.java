import java.util.*;
import java.lang.*;
class Last_Factorial  {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();
			
			for(int j=num-1;j>=1;j--)
			{
				num*=j;
			}
			String s=Integer.toString(num);
			System.out.println(s.charAt(s.length()-1));

		}
		
		sc.close();
	}
}