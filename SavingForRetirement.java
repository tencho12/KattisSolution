import java.util.*;

class SavingForRetirement
{
    public static void main(String tencho[])
    {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double br=sc.nextDouble();
        double bs=sc.nextDouble();
        int a=sc.nextInt();
        double as=sc.nextDouble();
        if( b>=20 && br<=100 && b<=br && a>=20 && a<=100 && as>=1 && bs<=100)
        {
            double dif=br-b;
            double s=dif*bs;
            double ass=s/as;
            double sss=Math.ceil(ass);
            double las=as*sss;
            a=a+(int)sss;
            if(las==s)
            {
                a=a+1;
                System.out.print(a);
            }
            else
            {
                System.out.print(a);
            }
        }
    }
}