class Calc{
	int num1;
	int num2;
	int result;
	
	public Calc() {
	
	//	num1=5;
		//System.out.print("In a Constructor ");
	}
	
}


class Add{
	int a;
	int b;
	int result;
	
	public void calc(int a, int b) {
		result=a+b;
		System.out.println(result);
	}
}

class Student{
	String first_name;
	String last_name;
	String location;
	
	public void details(String first_name, String last_name, String location) {
		System.out.println("Hi My Name Is "+ first_name+" " + last_name);
		System.out.println("I stay in " + location);
	}
	
}

public class OOP {
	public static void main(String[] args) {
		
		//Calc obj = new Calc();
		Add obj2 = new Add();
		obj2.calc(5,6);
		obj2.calc(6, 7);
		//System.out.print(obj.num1);
		
		Student su = new Student();
		su.details("Biplob","Kalita","Btm LayOut");
		su.details("Kritika","Sharma","Assam");
		
		
	}
}
