import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Welcome to ABC Bank\n");
		
		int chance =3;
		double balance=100;
		String restart="y";
		int option1;
		int options2;
		int withdrawlAmount=0;
		int dipositAmount=0;
		
				
		while(chance!=0) {
			
			System.out.print("\n\nTo Continue Enter 1 \nTo Exit Enter 2 ");
			option1=sc.nextInt();
			
			if(option1==1) {
			
				System.out.println("\nEnter Your Pin ");
				int pin = sc.nextInt();
			
					if(pin==1234){
						System.out.print("WelCome ABC Coustomer\n");
							while(!restart.equals("no") || !restart.equals("n")) {
								System.out.print("\nPlease Select Option\n");
								System.out.print("1 For Balance Enquiry\n");
								System.out.print("2 For Cash withdrawl\n");
								System.out.print("3 For Cash Deposit\n");
								System.out.print("4 For Mini Statement\n");
							
								options2=sc.nextInt();
								
								if(options2==1) {
									System.out.println("Your Current Accoutn BAlance Is " + balance);
									System.out.println("Enter Y to go Back N to Exit");
									restart=sc.next().toLowerCase();
									
									if(restart.equals("no") || restart.equals("n")) {
										System.out.print("\nThank You\n");
										break;
									}
								
								}else if(options2 == 2) {
									System.out.print("\nPlease Enter Amount To Withdrawls ");
									 withdrawlAmount=sc.nextInt();
									
										if(balance>withdrawlAmount) {
											balance= balance-withdrawlAmount;
											System.out.println("\nCurrent Balance: " + balance);
											System.out.println("Enter Y to go Back N to Exit");
												restart= sc.next().toLowerCase();
													if(restart.equals("no") || restart.equals("n")) {
														//System.out.print("\nThank You\n");
														break;
													}
										
										}else {
											System.out.println("Sorry Current Balance is Less than Entered Amount"); 
											restart="y";
										}
										
								}else if(options2==3) {
									System.out.print("Enter Amount To Deposit");
									 dipositAmount=sc.nextInt();
									balance=balance + dipositAmount;
									System.out.println("Your Current Accoutn BAlance Is " + balance);
										
									System.out.println("Enter Y to go Back N to Exit");
									restart= sc.next().toLowerCase();
										if(restart.equals("no") || restart.equals("n")) {
											//System.out.print("\nThank You\n");
											break;
										}
								
								}else if(options2==4) {
									System.out.println("Current Balance: " + balance);
									System.out.println("Wthdrawl Amount: " + withdrawlAmount);
									System.out.println("Dipositl Amount: " + dipositAmount);
									break;
								}else {
									System.out.print("Please Valid Option");
									restart="y";
								}					
						}
					
					}else if(pin!=1234) {
					System.out.print("Incorrect Pin\n");
					chance = chance-1;
					
					if(chance==0) {
						System.out.print("Your Card Is Blocked");
						}
					}
					
					}else {
					System.out.println("Thank You For Using ABC ATM");
					System.out.print("Please Collect Your Card\n");
					break;
				}
			}
	}			
	}

}
