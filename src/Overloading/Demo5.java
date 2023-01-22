package Overloading;

public class Demo5 {

	public static void main(int a)
	{
		System.out.println("1 int argument" +a);
	}
	
	public static void main(String b)
	{
		System.out.println("1 string arguments"+b);
	}
	
	
	public static void main(int[] a)
	{
		System.out.println("1 int array argument"+a);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		Demo5.main(100);
		Demo5.main("Selenium");
		int[]xyz= {10,20,30,50,60};
		Demo5.main(xyz);
			
		
	}


}
