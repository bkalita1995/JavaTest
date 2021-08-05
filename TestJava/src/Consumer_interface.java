import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

//class ConsImpl implements Consumer<Integer>{
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
//}


public class Consumer_interface {

	public static void main(String[] args) {
		
//		List<Integer> values = Arrays.asList(5,6,7,8,9);
//				
//		Consumer<Integer> c = new ConsImpl();
//		values.forEach(c);

	
//		List<Integer> values = Arrays.asList(5,4,3,2,1);
//		
//		Consumer<Integer> c = new Consumer<Integer>(){
//			
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
//		
		List<Integer> values = Arrays.asList(5,4,3,2,1);
		
//		Consumer<Integer> c = i -> System.out.println(i);
		
		values.forEach(i -> System.out.println(i));
		
	}

}
