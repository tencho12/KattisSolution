import java.util.*;
class fav_recurssive{
    public static void main(String ten[]){
        Scanner sc=new Scanner(System.in);
        fav_recurssive ob=new fav_recurssive();
        int n=sc.nextInt();
        int r=ob.fav(n);
    }
    int fav(int n){
        if(n<=2) return 1;
        else return fav(n)+fav(n-1);
    }
}