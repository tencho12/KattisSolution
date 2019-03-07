import java.util.*;
class Friday{
	public static void main(String tencho[]){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0; i<n; i++){
			int day= scan.nextInt(), month=scan.nextInt();
			int arr[]= new int[month];
			int m=0,count=0;
			for(int j=0; j<month; j++){
				arr[j]=scan.nextInt();
			}
			for(int j=0; j<month; j++){
				if(m==0&&arr[j]>12)
					count++;
				m=(m+arr[j])%7;
			}
			System.out.println(count);
		}
	}
}