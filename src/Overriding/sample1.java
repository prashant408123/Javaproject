package Overriding;

public class sample1 {
	
	public void prashant() {
		System.out.println("prashant method in sample class");
	}

	public static void main(String[] args) {
		
		sample1 obj = new sample1();
		
		obj.prashant();
		
		Demo1 obj1 = new Demo1();
		
		obj1.prashant();
		
		
		
		

	}

}
