import java.util.*;
class ANewAlphahet{
	public static void main(String rko[]){
		Scanner scan = new Scanner(System.in);
		char alpha[]= new char[26];
		String symb[]={"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\//[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","'/","2"};
		for(int i=97; i<123; i++)
			alpha[i-97]=(char)i;
		String s= scan.next()+scan.nextLine();
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			int ch=0;
			for(int j=0; j<26; j++)
			{
				if(s.charAt(i)==alpha[j])
				{
					ch++;
					System.out.print(symb[j]);
					break;
				}
			}
			if(ch==0)
				System.out.print(s.charAt(i));
		}	
	}
}