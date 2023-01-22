package Overloading;

public class Demo2 {

	public static void abc() {
		System.out.println("0 args");
	}
	
	public static void abc(int a) {
		
		System.out.println("1 int args" +a);
	}
	
	public static void abc(int a, String b) {
		
		System.out.println("i int and 1 string args" +a +b);
		
	}
	 public static void abc (String b, int a) {
		 System.out.println("1 string ang 1 int args" +b +a);
	 }
	
	 public static void main (String[] args) {
		 
		 Demo2.abc();
		 Demo2.abc(200);
		 Demo2.abc(300, "testing");
		 Demo2.abc("automation", 400);
	 }
}
