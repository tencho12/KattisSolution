import java.util.*;

class SecretMessage
{
	public static void main(String tencho[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			List<String> al=new ArrayList<String>();
			String s=sc.next();
			int sl=s.length();
			int l=0;
			double m=Math.sqrt(sl);
			int rr=(int)Math.ceil(m);
			String arr[][]=new String[rr][rr];
			String newArray[][]=new String[rr][rr];
			for(int j=0;j<rr;j++)
			{
				for(int k=0;k<rr;k++)
				{
					if(l<sl)
					arr[j][k]=s.substring(l,l+1);
					else
						arr[j][k]="*";
						l++;
				}
			}
			for(int row=0; row<rr;row++)
			{
	        	for(int col=0; col<rr; col++)
	        	{
	            	newArray[row][col] = arr[(rr-1)-col][row];
	            	if(newArray[row][col]!="*")
	            	al.add(newArray[row][col]);
	       		}
	    	}
	    	for(int ss=0;ss<s.length();ss++)
			    {
			    	System.out.print(al.get(ss));
			   	}
			   	System.out.println();
		}	
	}
}