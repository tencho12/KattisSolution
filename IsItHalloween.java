import java.util.*;

class IsItHalloween {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();

		if(s.equals("OCT") && n==31 ||s.equals("DEC") && n==25 )
			System.out.print("yup");
		else
			System.out.print("nope");
		
		sc.close();
	}
}