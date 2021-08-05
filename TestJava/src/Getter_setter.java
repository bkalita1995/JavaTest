class AccountDetails {
	
	private int balance;
	private String name;
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int Balance) {
		balance = Balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		name = Name;
	}
	
}




public class Getter_setter {

	public static void main(String[] args) {
		
		
		AccountDetails details = new AccountDetails();
//		details.balance=25;
//		details.name= "Biplob";
		
		details.setBalance(45000);
		System.out.println(details.getBalance());
		
		
		details.setName("Biplob Kalita");
		System.out.print(details.getName());

	}

}
