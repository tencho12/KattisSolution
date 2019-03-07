import java.util.*;

class EncodedMessage
{
    public static void main(String tencho[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            int l=s.length();
            int ls=0;
            int r=(int)Math.sqrt(l);
            List<String> al=new ArrayList<String>();
            String arr[][]=new String[r][r];
            String newArray[][]=new String[r][r];
            
            for(int j=0;j<r;j++)
            {
                for(int k=0;k<r;k++)
                {
                    if(ls<l)
                    {
                        arr[j][k]=s.substring(ls,ls+1);
                        ls++;
                    }
                }
            }
            for(int row=0; row<r;row++)
			{
	        	for(int col=0; col<r; col++)
	        	{
	            	newArray[row][col] = arr[(r-1)-col][row];
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