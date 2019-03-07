import java.util.*;

class YinandYan
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int count=0,count1=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='W')
			count++;
		else if(s.charAt(i)=='B')
			count1++;
	}
	if(count==count1)
		System.out.print(1);
	else
		System.out.print(0);

	}
}