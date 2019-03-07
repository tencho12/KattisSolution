import java.io.*;
import java.util.*;

class ArrayListTry
{
	public static void main(String []tencho)
	{
	ArrayList<String> slist=new ArrayList<String>();
	ArrayList<String> slist2=new ArrayList<String>();
	slist.add("tencho");
	slist.add("chophel");
	slist.set(0,"tenzin");
	//System.out.print(slist);
	List<String> listNames = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
List<Integer> listNumbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
System.out.println(listNames);
System.out.println(listNumbers);
	for (String element : slist2) {
	System.out.println(element);
} 
	}
}