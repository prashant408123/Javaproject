package Overloading;

public class Demo3 {

	
	final void abc()
	{
		System.out.println("0 args final method");
	}

	
	final void abc(int a)
	{
		System.out.println("1 int args final method" + a);
	}
	
	final void abc(String b)
	{
		System.out.println("1 String args final method" +b );
	}
	

	public static void main(String[] args) {

		Demo3  obj =new Demo3();
		
		obj.abc();
		obj.abc(1000);
		obj.abc("tester");
		
		
		
	}



}
