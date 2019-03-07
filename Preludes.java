import java.util.*;

class Preludes
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		String arr[]={"Bb","Db","Eb","Gb","Ab"};
		String arr1[]={"A#","C#","D#","F#","G#"};
		int c=0;
		while(sc.hasNextLine())
		{
		
		String s=sc.next()+sc.nextLine();
		c++;
		String arr2[]=s.split(" ");
		int check=0;
		
		for(int i=0;i<5;i++)
		{
			if(arr2[0].equals(arr[i]))
			{
				System.out.println("Case "+c+": "+arr1[i]+" "+arr2[1]);
				check++;
				break;
			}
			else if(arr2[0].equals(arr1[i]))
			{
				System.out.println("Case "+c+": "+arr[i]+" "+arr2[1]);
				check++;
				break;	
			}

		}
		if(check==0)
			System.out.println("Case "+c+": "+"UNIQUE");
	}
}
}