import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class VigenereCipher{
public static void main(String[] args) {
try{
//make file object
File file = new File("cipher.txt");

//read file object
FileReader fr = new FileReader(file);

//store content read by FileReader
BufferedReader br = new BufferedReader(fr);

//read br object and store as String
String string;
int ascii;
int count=0;
int[] alphabet=new int[26]; //creating alphabet objects

while((string = br.readLine()) != null) //counting characters
{
int length=string.length();
for(int i=0;i<length;i++)
{
ascii=string.charAt(i);
if(ascii>=97&&ascii<=122)
{
alphabet[ascii-97]++;
count+=1;
}
if(ascii>=65&&ascii<=90)
{   alphabet[ascii-65]++;
count+=1;
}
}
}

String alpha;
//a) Outputs number of occurances of each alphabet
System.out.println("Alphabet\t\tFrequency");
System.out.println(".........\t\t.........");

for(int k=0;k<26;k++)
{

alpha=new Character((char)(k+65)).toString();

System.out.print(alpha +"\t\t\t"+alphabet[k]+"\n");
}
System.out.println("Character count = "+count);



//b and c) outputing a) in a file
FileWriter output = new FileWriter("output.txt");
//write output to output.txt
output.write("Alphabet\tFrequency\n");
for (int i=0; i < 26; i +=1) {
alpha=new Character((char)(i+65)).toString();
output.write(alpha+"\t\t\t "+alphabet[i]+"\n");
}
output.write("Total number of character is="+count+"\n");
output.close();//file close
System.out.println("*************************************");

//find incidence of coincidence
double incN=0,incOfCo=0,incD;
for(int k=0;k<26;k++)
{
incN+=alphabet[k]*(alphabet[k]-1);
}
incD=count*(count-1);
incOfCo=incN/incD;
System.out.println("Cipher_type\t\tIncidence of Coincidence");
System.out.println("-----------\t\t------------------------");
if(incOfCo<0.065&&incOfCo>0.0385){
System.out.println("Polyalphabetic\t\t"+incOfCo);
}
else{
System.out.println("Monoalphabetic\t\t"+incOfCo);
}

//for finding key length
double key;
key=(0.0265*count)/((0.065-incOfCo)+(count*(incOfCo-0.0385)));
System.out.println("\nThe key Length is = "+key);
}
catch (IOException e)
{
System.out.println("Exception occured: "+e);
}
}
}
