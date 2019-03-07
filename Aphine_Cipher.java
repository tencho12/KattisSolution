import java.io.*;
import java.util.*;
class Aphine_Cipher{
    public static void main(String arg[]){
        Aphine_Cipher ob=new Aphine_Cipher();  
        ob.decrypt(); 
    }
    void decrypt()
        {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the string to decrypt:");
            String cypher=scan.nextLine();  //recieve the string
            int temp_index;  //create temporary variable
            for(int i = 0; i < 26; i++){
            String real_message=""; //declare empty string
            for(int j = 0; j < cypher.length(); j++){
                if(cypher.charAt(j)==' '){ //checking condition for space
                    real_message+=' ';
                    j+=1;
                }
                    
                temp_index=cypher.charAt(j);
                temp_index=temp_index-i%26;
                
                if(temp_index < 'A')
                    temp_index+=26;
                real_message=real_message+(char)temp_index; //deciphering formulae
            }
            System.out.println(real_message); //printing out the result
        }
     }
}