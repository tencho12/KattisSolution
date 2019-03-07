import java.util.*;

class Autori
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int count=0;
	
		List<String> al=new ArrayList<String>();
		String arr[]=s.split("-");
		for(int i=0;i<arr.length;i++)
		{
			
			al.add(arr[i].substring(0,1));
		}
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i));
	}
}