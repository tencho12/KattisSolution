import java.util.*;
class Star_Arrangements{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println(x+":");
		for(int i=2;i<=Math.ceil(x/2.0);i++)
		{
			int r=(int)Math.floor(x/(i+(i-1)));
			if(x-((i+(i-1))*r)==i || x-((i+(i-1))*r)==0)
			{
				System.out.print(i+",");
				System.out.println(i-1);
		}
		if( x%i==0)
			{
				System.out.println(i+","+i);				
			}
		}
		sc.close();
	}
}