import java.math.BigDecimal;  
import java.util.*;  
public class Main {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner scan = new Scanner(System.in);  
        while(scan.hasNext()){  
            BigDecimal a = scan.nextBigDecimal();  
            int b = scan.nextInt();  
            String ans = a.pow(b).stripTrailingZeros().toPlainString();  
            if(ans.startsWith("0"))  
                ans = ans.substring(1);  
            System.out.println(ans);  
        }  
        scan.close();  
    }  
  
}