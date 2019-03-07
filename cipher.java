import java.util.*;

class cipher
{
	public static void main(String[] args) {
		//String alpha[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String alpha="abcdefghijklmnopqrstuvwxyz";
		Scanner sc=new Scanner(System.in);
		int p;

		System.out.print("Enter the string to decrypt:");
		String s=sc.next();
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<26;j++)
			{
				if(s.charAt(i)==(alpha.charAt(j)))
				{
					p=(j-i)%26;
					ans=ans.concat(alpha.charAt(p));
				}	
			}
		}
		for(int i=0;i<ans.length();i++)
		{
			System.out.print(ans.charAt(i));
		}
	}
}