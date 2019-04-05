import java.util.*;

class prime_finder{
    public static void main(String tencho[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for(int j=2;j<n;j++){
            boolean s=false;
            for(int i=2;i*i<=j;i++){
                if(j%i==0){
                    s=true;
                }
            }
            if(s)
                System.out.println(j+ " not a prime");
            else
                System.out.println(j+ " a prime");
        }
        
        
    }
}