import java.util.*;
import java.lang.*;
class Run_Length  {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		List<Integer> al=new ArrayList<>();

		char c=sc.next().charAt(0);
		String s=sc.next()+"@";
		StringBuilder str = new StringBuilder(""); 
		int count=1;
		if(c=='E')
		{
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
					count++;
				else
				{
					str.append(s.charAt(i));
					str.append(count);
					count=1;
				}
			}

			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
					count++;
				else
				{
					al.add(count);
					count=1;
				}
			}

			System.out.println(str);

		}
		else
		{
			for(int i=0;i<s.length()-1;i+=2)
			{
				int c_val=(int)s.charAt(i+1)-48;
				for(int j=0;j<c_val;j++)
				{
					str.append(s.charAt(i));
				}
			}
			System.out.print(str);
		}
		
		
		
		sc.close();
	}
}