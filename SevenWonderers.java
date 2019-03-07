import java.util.Scanner;
class SevenWonderers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int a=0,b=0,c=0,s;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='C')
				a++;
			if(input.charAt(i)=='T')
				b++;
			if(input.charAt(i)=='G')
				c++;
		}
		if(a<b && a<c)
			s=a;
		else if(b<c)
				s=b;
			else
				s=c;
		System.out.print((a*a+b*b+c*c+s*7));
	}
}