import java.util.*;
import java.lang.*;
class Poker_Hand {
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);

		List<Character> al=new ArrayList<>();
	
		int count=0;
		for(int j=0;j<5;j++)
		{
			int c=0;
			String s=sc.next();
			al.add(s.charAt(0));
			for(int i=0;i<al.size();i++)
			{
				if(s.charAt(0)==al.get(i))
					c++;
			}

			if(c>=count)
				count=c;	
		}
		System.out.print(count);
		
		sc.close();
	}
}