import java.io.*;
import java.util.*;

class Engineering_math
{
	public static void main(String tencho[])
	{
	Scanner sc = new Scanner(System.in);
	
	String s=sc.next() + sc.nextLine();
	//String s=s1.toLowerCase();
	String[] words=s.split(" ");
	List<String> ls=new ArrayList<String>();
	List<String> ls2=new ArrayList<String>();

	for(int i=0;i<words.length;i++)
	{
		String s2=words[i];
		String s3=s2.toLowerCase();
		if(!ls.contains(s3))
		{

			ls.add(s3);
			ls2.add(s2);
		}
		else
			ls2.add(".");
	}
	for(int i=0;i<ls2.size();i++)
	{
		System.out.print(ls2.get(i)+" ");
	}
}

}