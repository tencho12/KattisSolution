import java.util.*;
class Vauvau{
	public static void main(String rko[]){
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt(),B=scan.nextInt(),C=scan.nextInt(),D=scan.nextInt();
		int arr[]=new int[3];
		for(int i=0; i<3; i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<3; i++){
			int sum = 0;
		    if (arr[i] % (A + B) != 0 && arr[i] % (A + B) <= A)
		        sum++;
		    if (arr[i] % (C + D) != 0 && arr[i] % (C + D) <= C)
		        sum++;
		    if (sum == 0)
		        System.out.println("none");
		    if (sum == 1)
		        System.out.println("one");
		    if (sum == 2)
		        System.out.println("both");
		}
		scan.close();
	}
}