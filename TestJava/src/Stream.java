import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Stream {

	public static void main(String[] args) throws IOException {
//		Pattern patt = Pattern.compile(" ");
//		patt.splitAsStream("Hi This Biplob Kalita").forEach(System.out::println);
	
//		IntStream.range(11, 25)
//		 .forEach(System.out::println);
		
		
		Files.list(Paths.get("")).forEach(System.out::println);
	
	}

}
