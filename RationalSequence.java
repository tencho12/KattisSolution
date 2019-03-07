import java.util.*;
class RationalSequence{
	public static void main(String tencho[]){
		Scanner scan= new Scanner(System.in);
		int not=scan.nextInt();
		for(int z=0; z<not; z++){
			int n=1,gn=scan.nextInt();
			String gs=scan.next();
			String sub[]=gs.split("/");
			int p=Integer.parseInt(sub[0]);
			int q=Integer.parseInt(sub[1]);
			String ans="";
			while(p!=1||q!=1){
				if(p>q){
					p=p-q;
					ans="R"+ans;
				}
				else{
					q=q-p;
					ans="L"+ans;
				}			
			}
			for(int i=0; i<ans.length(); i++){
				if(ans.substring(i,i+1).equals("L")){
					n=n*2;
				}
				else
					n=n*2+1;
			}
			System.out.println(gn+" "+n);
		}		
	}
} 