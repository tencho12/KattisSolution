import java.util.Scanner;
class Ahhh{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next()+sc.nextLine();
		String b=sc.next()+sc.nextLine();
		if(a.length() < b.length())
			System.out.print("no");
		else
			System.out.print("go");
	}
}