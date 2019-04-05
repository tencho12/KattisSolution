import java.util.*;

class is_prime{
    public static void main(String tencho[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean s=false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s=true;
                break;
            }
        }
        if(s)
            System.out.print("not a prime");
        else
            System.out.print("a prime");
    }
}