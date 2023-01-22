package Overloading;

public class Demo4 {

	public Demo4() {
		
		System.out.println("zero args in demo4 method");
		
	}
	public Demo4( int a) {
		System.out.println("one int args in demo4 method");
	}
	 public Demo4(String b) {
		 
		 System.out.println("one string in demo4 method");
	 }
	 
	 public Demo4(int a, int b) {
		 System.out.println("one int and string args in demo4 method");
	 }
	 
	 Demo4 obj = new Demo4(10,100);
	 
}
