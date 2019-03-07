import java.io.*;
import java.util.*;
class passive
{
    public static void main(String tenchop[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String s=sc.next();
            String arr[]=s.split(" ");
            n=arr.size;
        }
        for(int i=0;i<n;i++)
        {
        
            System.out.println(arr[i]);
        }
    }
}