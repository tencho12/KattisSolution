import java.util.*;
class Pvra{
    public static void main(String[] rko) {
        Scanner scan = new Scanner(System.in);
        int r= scan.nextInt();
        int c= scan.nextInt();
        String arr[][]= new String[r][c];
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<r; i++){
            String s=scan.next();
            for(int j=0; j<c; j++)
                arr[i][j]=s.substring(j,j+1);
        }
        for(int i=0; i<r; i++){
            int ch=0;
            String ans="";
            for(int j=0; j<c; j++){
                if(arr[i][j].equals("#")||j==c-1)
                {
                    if(j==c-1)
                    {
                        if(arr[i][j].equals("#"))
                            ch=0;
                        else {ans+=arr[i][j];
                        ch++;}
                    }
                    if(ch>1)
                        al.add(ans);
                    ch=0;
                    ans="";
                }
                else
                {
                    ans+=arr[i][j];
                    ch++;
                }
            }               
        }
        for(int j=0; j<c; j++){
            int ch=0;
            String ans="";
            for(int i=0; i<r; i++){
                if(arr[i][j].equals("#")||i==r-1)
                {
                    if(i==r-1)
                    {
                        if(arr[i][j].equals("#"))
                            ch=0;
                        else {ans+=arr[i][j];
                        ch++;}
                    }
                    if(ch>1)
                        al.add(ans);
                    ch=0;
                    ans="";
                }
                else
                {
                    ans+=arr[i][j];
                    ch++;
                }
            }               
        }
        Collections.sort(al);     
        System.out.print(al.get(0));
        scan.close();
    }
}