interface phone {
	void call();

	default void sms() {
		System.out.println("Sending SMS");
	}


}



class AndroidPhone implements phone {
	public void call(){
		System.out.println("Calling");
	}
}




public class inter_face {

	public static void main(String[] args) {
		
		phone p = new AndroidPhone();
		p.call();
		p.sms();
	}
}
