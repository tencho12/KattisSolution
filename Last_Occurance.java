import java.io.*;
import java.util.*;

class Last_Occurance{
    public static void main(String tencho[]) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        int search=sc.nextInt();
        int index=-1;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            
            if(search==arr[i])
                index=i+1;
        }
        System.out.print(index);
        
    }
    
}