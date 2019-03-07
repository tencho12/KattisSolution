import java.util.*;

class Datum
{
    public static void main(String tencho[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int date=sc.nextInt();
        int month=sc.nextInt();
        String arr2[]={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
        int m=0;
        for(int i=1;i<month;i++)
        {   
            m=(m+arr[i-1])%7;
        }
        m=(m+date)%7;
        System.out.println(arr2[m]);
    }
}