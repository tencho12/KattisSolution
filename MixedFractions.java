import java.util.*;

class MixedFractions{
	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		int a,b,i,d,c=0;
		
		boolean x=true;
		
		while(x){
			a=s.nextInt();
			b=s.nextInt();
			if(a==0 && b==0)
			break;
			i=(int)a/b;
			l.add(i);
			d=a%b;
			l.add(d);
			l.add(b);
			c++;
		}
		for(int j=0;j<c*3;j+=3){
			System.out.println(l.get(j)+" "+l.get(j+1)+" / "+l.get(j+2));
		}
	}
}