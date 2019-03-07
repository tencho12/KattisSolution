import java.util.*;
class PlantingsTrees{
    public static void main(String[] rko) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int z=0; z<n; z++){
           arr[z]=scan.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
        int t=0,loc=0;

        for(int i=0; i<n; i++)
        {
            int t1=arr[i]-n+i;
            if(t1>t)
            {
                t=t1;
                loc=i;
            }
        } 
        System.out.print(arr[loc]+loc+2);
        scan.close();
    }
}