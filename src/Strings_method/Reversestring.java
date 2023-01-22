package Strings_method;

public class Reversestring {

	public static void main(String[] args) {
		// reverse operation on strings
		
		String abc = "selenium";
		int xyz = abc.length()-1;
		for (int i=xyz;i>=0;i--) { 
			
			System.out.print(abc.charAt (i));
		}

		
		String pqr = "JAVA";
		int stp = pqr.length()-1;
		for (int lmn = stp;lmn>=0;lmn--) {
			System.out.print(pqr.charAt(lmn));
		}
	}

}
