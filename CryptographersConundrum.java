import java.util.*;
class CryptographersConundrum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=s.length();
		for(int i=0;i<s.length();i+=3){
			if(s.charAt(i)=='P')
				count--;
		}
		for(int i=1;i<s.length();i+=3){
			if(s.charAt(i)=='E')
				count--;
		}
		for(int i=2;i<s.length();i+=3){
			if(s.charAt(i)=='R')
				count--;
		}
		System.out.print(count);
	}
}