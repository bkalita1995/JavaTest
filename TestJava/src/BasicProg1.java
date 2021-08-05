import java.util.Scanner;

public class BasicProg1 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			String input = "";
			
			
			while(!input.equals("yes")){
				
				System.out.println("Enter a number");
					int number = scanner.nextInt();
							if(number%2==0) {
								System.out.print(number+" Is Even Number");
							}else {
								System.out.print(number+" is Not a Even Number");
							}
				
				System.out.println("\n\nYes to Exit \nAny Number or Latter to Continue");
				input = scanner.next().toLowerCase();	
			}
		}
	}
	
	
}
