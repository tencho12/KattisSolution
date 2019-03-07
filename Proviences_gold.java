import java.io.*;
import java.util.*;

class Proviences_gold{
	public static void main(String ten[]){
		Scanner sc=new Scanner(System.in);
		String []arr={"Provience","Duchy","Estate","Gold","Silver","Copper"};
		//int[] arr2={8,5,2};
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=(a*3)+(b*2)+(c*1);

		if(sum>=8)
			System.out.print(arr[0]+ " or "+arr[3]);
		else if(sum>=5 && sum<8)
			System.out.print(arr[1]+ " or "+arr[4]);
		else if(sum>=2 && sum<5)
			System.out.print(arr[2]+ " or "+arr[5]);
		else if(sum<=1 && sum<2)
			System.out.print(arr[5]);
	}
}