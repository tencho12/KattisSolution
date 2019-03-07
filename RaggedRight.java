import java.util.*;
class RaggedRight{
	public static void main(String rko[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		int t=0,c=0,sum=0;
		while(scan.hasNextLine()){
			String s= scan.next()+scan.nextLine();
			al.add(s.length());
			if(s.length()>t)
				t=s.length();
			sum=0;
			for(int i=0; i<c; i++){
				if((int)al.get(i)!=t)
					sum+=(int)Math.pow(t-(int)al.get(i),2);
			}
			c++; 
		}
		System.out.print(sum);
	}
}
