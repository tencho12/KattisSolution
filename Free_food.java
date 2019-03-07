import java.io.*;
import java.util.*;

class Free_food{
	public static void main(String tencho[]){
	ArrayList<Integer> al=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();

	for(int i=0;i<n;i++){
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int j=a;j<=b;j++){
		if(!al.contains(j))
			al.add(j);
		}
	}
	System.out.print(al.size());
	}
}