import java.util.*;
class Quadrant{
	public static void main(String tencho[]){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),y=scan.nextInt();
		if(x>0 && y>0)
			System.out.print("1");
		else if(x>0 && y<0)
			System.out.print("4");
		else if(x<0 && y<0)
			System.out.print("3");
		else if(x<0 && y>0)
			System.out.print("2");
		scan.close();
	}
}
