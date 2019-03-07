import java.util.*;
class Nasty_Hacks{
	public static void main(String tencho[]){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		for(int i=0;i<x;i++)
		{
			int r=scan.nextInt();
			int e=scan.nextInt();
			int c=scan.nextInt();

			int dif=r-(e-c);
			
		    if(dif<0)
				System.out.println("advertise");
			else if(dif>0)
				System.out.println("do not advertise");
			else
				System.out.println("does not matter");
		}
		scan.close();
	}
}