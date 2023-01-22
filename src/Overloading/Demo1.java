package Overloading;

public class Demo1 {

	
	public void abc() {
		System.out.println("0 args");
	}
	
	public void abc(int a) {
		
		System.out.println("1 int args" +a);
	}
	
	public void abc(int a, String b) {
		
		System.out.println("i int and 1 string args" +a +b);
		
	}
	 public void abc (String b, int a) {
		 System.out.println("1 string ang 1 int args" +b +a);
	 }
	
	 public static void main (String[] args) {
		 
		 Demo1 obj = new Demo1();
		 obj.abc();
		 obj.abc(100);
		 obj.abc(1000, "selenium");
		 obj.abc("Testing", 10000);
		 
		 
	 }
	 
}
