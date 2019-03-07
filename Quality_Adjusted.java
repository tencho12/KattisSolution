import java.util.*;
class Quality_Adjusted {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		float sum=0;
		for(int i=0;i<n;i++)
		{
			float r=0;
			float a=sc.nextFloat(),b=sc.nextFloat();
			r=a*b;
			sum=sum+r;
		}

		System.out.printf("%.2f",sum);
		sc.close();
	}
}