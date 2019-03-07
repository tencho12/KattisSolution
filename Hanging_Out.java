import java.util.*;
class Hanging_Out{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();

		int count=0;
		for(int i=0;i<m;i++)
		{
			String s=sc.next() + sc.nextLine();
			String[] val=s.split(" ");
		
			
			if(val[0].equals("enter"))
			{
				if(Integer.parseInt(val[1])<=n)
					n=n-Integer.parseInt(val[1]);
				else
					count++;
			}
			else if(val[0].equals("leave"))
				n=n+Integer.parseInt(val[1]);
			
		}
		System.out.print(count);
		sc.close();
	}
}