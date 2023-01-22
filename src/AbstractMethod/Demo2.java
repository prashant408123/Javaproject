package AbstractMethod;

public class Demo2 extends Demo1 {

	@Override
	public void m3() {
		System.out.println("m3 mehod is demo2");	
	}
	
	public void abc() {
		
		System.out.println("abc methos in demo2 class");
	}
	
	public void pqr() {
		System.out.println("pqr methos in demo2 class");
	}
	
	public static void main(String[] args) {
		
		
		Demo2 abst = new Demo2();
		
		
		abst.m1();
		abst.m2();
		abst.m3();
		abst.abc();
		abst.pqr();
		
		

	}

	

}
