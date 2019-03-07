import java.util.*;
import java.io.*;
import java.nio.file.*;
class Polyalphabeticfile
{
	public static void main(String tencho[]) throws IOException
	{
		String s = "";
		 s = new String(Files.readAllBytes(Paths.get("inputfile.txt")));
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
		//String se =(String)charCountMap;
		//Files.write(Paths.get("output.txt"),se.getBytes());
	}
}