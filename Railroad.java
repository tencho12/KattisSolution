import java.util.*;
class Railroad{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int r=(x*4)+(y*2);
		if(r%4==0 && r%2==0)
			System.out.print("possible");
		else
			System.out.print("impossible");
		sc.close();
	}
}