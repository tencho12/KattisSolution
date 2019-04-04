import java.io.*;
import java.util.*;

class Bubble_sort{
    public static void main(String tencho[]) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        
    }
    
}