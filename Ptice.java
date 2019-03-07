import java.util.*; 
class Ptice
{
	public static void main(String [] rko)
	{
		Scanner reader = new Scanner(System.in);
		int n= reader.nextInt();
		char a[]={'A','B','C'};
		char b[]={'B','A','B','C'};
		char g[]={'C','C','A','A','B','B'};
		int c[]={0,0,0};
		
		int l;
		String s=reader.next();
		char arr[]=s.toCharArray();

		for(int i=0; i<n; i++)
		{
			if(arr[i]==a[i%3])
				c[0]++;
			if(arr[i]==b[i%4])
				c[1]++;
			if(arr[i]==g[i%6])
				c[2]++;
		}

		if(c[0]>c[1])
		{
			if(c[0]>c[2])
				l=c[0];
			else
				l=c[2];
		}
		else
		{
			if(c[1]>c[2])
				l=c[1];
			else
				l=c[2];
		}
		System.out.println(l);
		if(c[0]==l)
		{
			System.out.println("Adrian");
		}
		if(c[1]==l)
		{
			System.out.println("Bruno");
		}if(c[2]==l)
		{
			System.out.println("Goran");
		}

	}
}