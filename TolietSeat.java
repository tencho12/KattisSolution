import java.util.*;
class TolietSeat{
    public static void main(String[] rko) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        int ch1=0, ch2=0, ch3=0;
        for(int i=1; i<s.length(); i++){
            if(i<2){
                if(!(s.substring(i-1,i).equals(s.substring(i,i+1)))){
                    ch1++; ch2++;
                }
            }
            else
            {
                if(!(s.substring(i,i+1).equals("D"))){
                    ch2++;
                }
                else
                    ch1++; 
            }
            if(!(s.substring(i-1,i).equals(s.substring(i,i+1))))
                ch3++;

            if(!(s.substring(i,i+1).equals("D")))
                ch2++;
            else
                ch1++;
        }
        System.out.print(ch1+"\n"+ch2+"\n"+ch3);
        scan.close();
    }
}