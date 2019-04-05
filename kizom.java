import java.io.*;
import java.util.*;

class kizom{
    public static void main(String tencho[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=0;i<n;i++){
            String s=sc.next()+sc.nextLine();
            int sum=0;
                String []arr=s.split(" ");
            for(int j=0;j<arr.length;j++){
                sum+=Integer.parseInt(arr[j]);
            }
            System.out.println(sum);
        }
    }
    
}