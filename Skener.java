import java.util.*;
class Skener{
    public static void main(String[] rko) {
        Scanner scan = new Scanner(System.in);
        int r= scan.nextInt();
        int c= scan.nextInt();
        int zc= scan.nextInt();
        int zr= scan.nextInt();
        String arr[][]= new String[r][c];
        for(int i=0; i<r; i++){
            String s=scan.next();
            for(int j=0; j<c; j++)
                arr[i][j]=s.substring(j,j+1);
        }
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               for(int k=0; k<zr; k++){
                    System.out.print(arr[i][j]);
               } 
            }
            System.out.println();
            for(int m=1;m<zc;m++)
            {
                for(int j=0; j<c; j++){
                   for(int k=0; k<zr; k++){
                        System.out.print(arr[i][j]);
                   } 
                }
                System.out.println();
            }
        }
        scan.close();
    }
}