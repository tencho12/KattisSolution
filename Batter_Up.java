import java.util.*;
class Batter_Up{
	public static void main(String tencho[]){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		double ans=0;
		int res=0;
		int count=0;
		for(int i=0;i<x;i++)
		{
			
			int r=scan.nextInt();
			if(r<0)
				count++;
			else
			  res=res+r;
		}
		ans=(double)res/(x-count);
			System.out.println(ans);

		scan.close();
	}
}

