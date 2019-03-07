import java.util.*;
import java.lang.*;
class Baby_Bites {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);

		int count=0,count2=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String s=sc.next();
			if(s.equals("mumble"))
				count++;
			else if(Integer.parseInt(s)==i)
				count2++;

		}
		if(n==count2 || (count+count2)==n)
			System.out.print("makes sense");
		else
			System.out.print("something is fishy");
		sc.close();
	}
}