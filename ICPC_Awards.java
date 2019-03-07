import java.util.*;
class ICPC_Awards{
	public static void main(String tencho[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String s=sc.next() + sc.nextLine();
			String[] as=s.split(" ");
			if(!al2.contains(as[0]))
			{

				al2.add(as[0]);
				al.add(s);
			}
			if(al.size()>11)
				break;
		}
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));


		sc.close();
	}
}