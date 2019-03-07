import java.util.*;
class TRY
{
	public static void main(String tencho[])
	{
		
		TRY.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,0,1)));
	}
	public static void ConvertBinaryArrayToInt(List<Integer> binary) {
        System.out.print(binary.stream().reduce((x, y) -> x * 2 + y).get());
        List number = Arrays.asList(2,3,4,5);
			System.out.print(number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i));
    }

}