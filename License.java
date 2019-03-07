import java.io.*;
import java.util.*;

class License{
	public static void main(String ten[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int val=sc.nextInt();
			al.add(val);
		}
		int f=min(al);
		System.out.print(f);
	}
	public static int min(ArrayList<Integer> arr){
		return arr.indexOf(Collections.min(arr));
	}
}