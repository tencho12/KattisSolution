import java.util.*;
class Heart_Rate{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int b=sc.nextInt();
			float p=sc.nextFloat();

			
			float t=p/b;
			float abpm=60/t;
			float max=abpm+(60/p);
			float bpm=abpm-(60/p);

			System.out.printf("%.4f ", bpm );
			System.out.printf("%.4f ", abpm );
			System.out.printf("%.4f ", max );

		}

		sc.close();
	}
}