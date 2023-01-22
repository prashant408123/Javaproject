package FrequentlyAskJavapgm;

public class Swapping {

	public static void main(String[] args) {


		int a=687, b=345 ;
		
		
		System.out.println("before swaapping numbers are "+a+"  "+b);
		// logic1= using third variable
//		
//		int t = a; //t=10
//	    a=b;//a=20
//		b=t;//b=10
		
		//logic 2 =by usinh + & - without using third value
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//logic3 = by using * and / without using third value
		//here a and b values should not not be zero
		
		// by using single statement
		
		b=a+b-(a=b);
		
		
		System.out.println("after swaapping numbers are "+a+"  "+b);
	}

}


