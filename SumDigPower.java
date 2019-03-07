import java.util.ArrayList;
class SumDigPower {
    
    public static void main(String arg[]){
      SumDigPower ob=new sumDigPow();

      ob.sumDigPow(60,100);
    }



    public static ArrayList sumDigPow(long a, long b) {
        // your code
        ArrayList al=new ArrayList();
        int c=1;
        for(long i=a;a<=b;i++)
        {
          long sum=0;
          while(i!=0)
          {
            long r=0;
            r=i%10;
            sum+=Math.pow(r,c);
            i=i/10;
            c++;
          }
          if(sum==i)
          {
            al.add(i);
          }
          
        }
        return al;
    }
}