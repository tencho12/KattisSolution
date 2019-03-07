import java.util.*;//completed

class EasiestProblemIsThis
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		List l=new ArrayList();
		int i,j,r,s,t;
		 int n=1;

		while(n!=0)
		{
			n=scan.nextInt();
			s=0;
			t=n;

			while(t!=0)
			{
				s+=t%10;
				t/=10;
			}

			for(i=11; ;i++)
			{
				j=n*i;

				r=0;

				while(j!=0)
				{
					r+=j%10;
					j/=10;
				}
				if(r==s)
				{
					l.add(i);
					break;
				}
			}
		}

		for(i=0;i<l.size();i++) System.out.println(l.get(i));
	}
}