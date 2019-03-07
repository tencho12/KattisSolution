import java.util.*;
import java.lang.*;
class DRM_Messages{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		String sub1 = s.substring(0,len/2), sub2 = s.substring(len/2);
		String a1="",a2="",af="";

		int sum=0,sum1=0;
		for(int i=0; i<len/2; i++){
			sum+=(int)sub1.charAt(i)-65;
			sum1+=(int)sub2.charAt(i)-65;
		}
		for(int i=0; i<len/2; i++){
			int n3=((int)sub1.charAt(i)-65)+sum;
			a1+=(char)((n3%26)+65);
			int n4=((int)sub2.charAt(i)-65)+sum1;
			a2+=(char)((n4%26)+65);
		}
		for(int i=0; i<len/2; i++){
			int n3=((int)a1.charAt(i)-65)+((int)a2.charAt(i)-65);
			af+=(char)((n3%26)+65);
		}
		System.out.println(af);
		sc.close();
	}
}
