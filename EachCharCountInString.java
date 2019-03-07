import java.io.*;
import java.util.*;
class EachCharCountInString
{
	
	static void characterCount(String inputString)
	{
		//Creating a HashMap containing char as a key and occurrences as  a value

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		//Converting given string to char array

        char[] strArray = inputString.toCharArray();

        //checking each char of strArray

        for (char c='a';c<'z';c++)
        {
        	for(int i=0;i<strArray.length;i++)
        	{

        		if(strArray[i]==c)
			{
				//If char is present in charCountMap, incrementing it's count by 1

				charCountMap.put(c, charCountMap.get(c)+1);
			}
        	}
			
		}

        //Printing the charCountMap

        System.out.println(charCountMap);
	}

    public static void main(String[] args)
    {
       characterCount("tenzin tenzin");
    }
}