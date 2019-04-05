import java.util.*;
class fav_recurssive{
    public static void main(String ten[]){
        Scanner sc=new Scanner(System.in);
        fav_recurssive ob=new fav_recurssive();
        int n=sc.nextInt();
        
        System.out.print(fav(n));
    }
    public static int fav(int n){
        if(n==1 || n==2) 
            return 1;
        else 
            return fav(n-1)+fav(n-2);
    }
}