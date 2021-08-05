import java.util.Arrays;
import java.util.List;



public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values= Arrays.asList(5,4,3,2,1);
			
// External Loops		
		
//		for(int i =0; i<values.size();i++) {
//			System.out.print(values.get(i));
//		}
		
//		for(int i : values) {
//			System.out.println(i);
//		}
		
//Internal Loops -> Java 8 Features		
		values.forEach(i -> System.out.print(i));
	}

}
