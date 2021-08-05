import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class StreamExam {
	public static void main(String[] args) {
        
       List<Integer> myList = new ArrayList<>();
       
       for(int i = 1; i<100; i++) myList.add(i);
       
       //myList.forEach(i -> System.out.println(i));
       
       Stream<Integer> parallelStream= myList.parallelStream();
       Stream<Integer> higestNum = parallelStream.filter(p -> p>90);
       
       higestNum.forEach(p -> System.out.println("Higest Number"+ p));
       
        
    }

}
