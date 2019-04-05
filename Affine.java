
import java.io.*;

/**
* This Program can be used to decrypt Affine Cipher (A Generalized Ceasar Cipher where the key can be between 1 and 26).
* The Program accepts a user input through the Standard Input Output as a cipher text.
* The cipher text received is then tested with all possible keys from 1 through 26 and displayed on the standard output as
* plain text.
* The user can make out the message from the plain texts displayed on the standard output as a result of Brute-Force.
* The Program Decrypts each of the cipher character be it UPPERCASE or lowercase
* The Punctuation marks, and spaces or any other character apart from the lowercase or UPPERCASE Characters are preserved.
*
* @author khusant chhetri
* @date 20-Mar-18
*/
class Affine {
	public static void main(String args[]) throws IOException {
		Affine obj=new Affine();
		String cipher;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Cipher Text: ");
		cipher=br.readLine(); //Getting the Cipher Text from the user
		obj.decryptAffine(cipher); //passing the cipher text as an arguement to the decrypter method
	}
	
	public void decryptAffine(String cipher) {
		/* Method to decrypt the cipher text entered by the user */
		/* The decryptAffine method takes one String parameter as a cipher text and prints all the 26 key possibilities as a result of a brute force */
		String plain; //To store the plain text
		int buff; //Temporary Variable to Compute the plaintext
		int i,j; //loop control variables
		for(i=0;i<26;i++) {
			plain=""; //reinitializing plain text output to empty string for new line
			buff=0;
			for(j=0;j<cipher.length();j++) { //for 26 possibilities
				if (cipher.charAt(j) >= 'A' && cipher.charAt(j) <= 'Z') {
					//For decrypting the Uppercase Letters
					buff=cipher.charAt(j)+i;
					if(buff>90)
						buff-=26;
					plain+=(char)(buff);
				} else if (cipher.charAt(j) >= 'a' && cipher.charAt(j) <= 'z') {
					//For decrypting the lowercase letters
					buff=cipher.charAt(j)+i;
					if(buff>122)
						buff-=26;
					plain+=(char)(buff); //appending to plain text string
				} else {
					//For decrypting/printing all the other characters as it is, if the character(s) are neither uppercase nor lowerase
					plain+=cipher.charAt(j);
				}
			}
			System.out.println(plain); //printing all the lines of the brute force result
		}
	}
}