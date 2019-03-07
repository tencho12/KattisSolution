import java.io.*;
import java.util.*;

class Duplicate{
	public static void main(String ten[]){
		Scanner sc=new Scanner(System.in);

		String s=sc.next()+sc.nextLine();
		String []arr=s.split(" ");
		List<String> al=new ArrayList<String>();
		int count=0;
		for(int i=0;i< arr.length;i++){
			if(!al.contains(arr[i]))
				al.add(arr[i]);
			else
				count++;
		}
		if(count>0)
			System.out.print("no");
		else
			System.out.print("yes");
	}
}