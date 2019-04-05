import java.io.*;
import java.util.*;

class Sideways_Sorting{
    public static void main(String tencho[]){
        Scanner sc=new Scanner(System.in);
        Sideways_Sorting ob=new Sideways_Sorting();
        ArrayList<String> al=new ArrayList<>();

        while(sc.hasNextLine()){
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(r==0 && c==0)
                break;
            
            for(int i=0;i<r;i++){
                String s1=sc.next();
                ob.stringBuild(s1,c,al);
            }
            System.out.println(al);

        }
    }
    void stringBuild(String s1,int c, ArrayList al){
        for(int i=0;i<c;i++){
            String sf="";
            sf=sf+s1.substring(i,i+1);
        }
        al.add(sf);
    }
}