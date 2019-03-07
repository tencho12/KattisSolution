import java.util.*;
import java.io.*;
class Polyalphabetic
{
	public static void main(String tencho[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 char[] strArray = s.toCharArray();
		 
		 for (char c : strArray) //iterate over the array using the for-each loop.
        {
			if(charCountMap.containsKey(c))
			{
				//If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		System.out.print(charCountMap);
	}

	void checker()
	{
		double n=0;
         double sum=0;
         for(int i=0;i<26;i++)
         {
             //for finding total length of a text
             n+=alpha[i];
             //for finding sum
             sum+=(double)alpha[i]*(double)(alpha[i]-1);
         }
         //for finding incidence
         double incidence=(1/(n*(n-1)))*sum;
         incidence=Math.round(incidence*1000.0)/1000.0;
         //checking the cipher used
         if(incidence>0.0385&&incidence<0.065)
         {System.out.println("Polyalphabetic Cipher is used:");}
         else if(incidence>0.065)
         {System.out.println("Monoalphabetic Cipher is used:");}
         //To find estimated keyword length
         double k;
         k=(0.0265*n)/((0.065-incidence)+n*(incidence-0.0385));
  System.out.println("The estimated keyword length is "+(int)k);      
}
	}
}