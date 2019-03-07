import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class poly_alpha{
    public static void main(String[] tencho)
    {
        try {
            // creating a text file to store the text
            File file = new File("inputfile.txt");
             //  Reading the text file
            FileReader fr = new FileReader(file);
            // passing the file contents as a object to the BufferReader
           BufferedReader  br = new BufferedReader(fr);                                    
            String str;
            int ch;
            int count=0;
            int[] alpha=new int[26];
            while((str = br.readLine()) != null) // if the text file is not empty, then while loop wil execute.
            {
                
                int length=str.length();
                for(int i=0;i<length;i++)
                {
                    ch=str.charAt(i);//store it as a separate character at particular index
                    if(ch>=97&&ch<=122)
                    {
                        alpha[ch-97]++;
                        count+=1;
                    }
                    if(ch>=65&&ch<=90)
                    {   alpha[ch-65]++; 
                        count+=1;
                    }
                }   
            }  
            String ss;
            //code for checking the letter frequency
            System.out.println("Total number of characters = "+count);
            System.out.println("Letter\t\tFrequency\n");
            for(int k=0;k<26;k++)
            {
               ss=new Character((char)(k+65)).toString();
               
               System.out.print(ss +"\t\t"+ alpha[k]+"\n");
            }
            //codes for checking total numbers of characters and frequency of the letter 
            FileWriter f0 = new FileWriter("output.txt");
                f0.write("Total number of character is="+count+"\n");
                f0.write("Alpha\t\tFrequency\n");
                for (int i=0; i < 26; i +=1) { 
                    ss=new Character((char)(i+65)).toString();
                    f0.write(ss+"\t\t\t "+alpha[i]+"\n"); 
               }
                    f0.close();
            //codes for finding incidence of coincidence
            double incN=0,incOfCo=0,incD;
            for(int k=0;k<26;k++)
            {
                incN+=alpha[k]*(alpha[k]-1);
            }  
            incD=count*(count-1);
            incOfCo=incN/incD;
            if(incOfCo<0.065&&incOfCo>0.0385)
                System.out.print("polyalphaic cipher used\n with incidence of coincidence of ="+incOfCo);
            else
                 System.out.print("monoalphaic cipher used\nwith incidence of coincidence of ="+incOfCo);
               
            double key;
            key=(0.0265*count)/((0.065-incOfCo)+(count*(incOfCo-0.0385)));
            System.out.print("\nThe key Length is ="+key);   
            
        } catch(IOException e) {
            System.out.println("There is error");
        }
    }  
}
