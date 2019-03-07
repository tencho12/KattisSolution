import java.util.Scanner;
public class Int_extract {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        String inputString;
        //2
        System.out.println("Enter a string :");
        inputString = sc.nextLine();
        //3
        System.out.println("Following integers are found in the string : ");
        //4
        for (char ch : inputString.toCharArray()) {
            //5
            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}