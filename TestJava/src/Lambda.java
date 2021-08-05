interface A{
	void show(int i);
}


//class Xyz implements A{ 
//	public void show(int i) {
//		System.out.print("Hello " + i);
//	}
//}





public class Lambda {

	public static void main(String[] args) {
		
		A obj;

//		obj=new A() // Anonymous Inner Class
//		{
//			
//			public void show(int i) {
//				System.out.print("Hello " + i);
//			}
//			
//			
//		};
		
		
// Lambda Expression
		
		obj = (i) -> System.out.print("Hello" + i);
		
		
		obj.show(6);
		
	}

}
