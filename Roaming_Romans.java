import java.util.*;
class Roaming_Romans{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		
		double n=sc.nextDouble();
		//n = Math.round(n * 1000.0) / 1000.0;

		double r=n*1000*(5280.0/4854.0);
		r=Math.round(r);
		System.out.print((int)r);
		
		sc.close();
	}
}