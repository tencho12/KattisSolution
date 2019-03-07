import java.util.*;
import java.lang.*;

class Plamna
{
    public static void main(String tencho[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int r=(int)(Math.pow(4,n)+Math.pow(2,n+1))+1;
        System.out.print(r);
    }
}
