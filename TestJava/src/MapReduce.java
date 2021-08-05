import java.util.Arrays;
import java.util.List;

public class MapReduce {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(5,4,3,2,1);
		
//		int sum=0;
//		for (int no:values) {
//			sum= sum + no;
//		}
//		
//		System.out.println(sum);
		
		int sum = values.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		
		int sum1=values.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum1);
	}

}
