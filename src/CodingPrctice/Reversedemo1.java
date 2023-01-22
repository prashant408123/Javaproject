
package CodingPrctice;

public class Reversedemo1 {

	public static void main(String[] args) {
		
		String a[] = "Prashant Panchal".split(" ");
		
		String b = " ";
		
		for (int i = a.length-1;i>=0;i--)
		{
			b=b+a[i]+" ";
		}
		
		
		System.out.println("Reverse string is: "+b);
		//System.out.println(b.substring(0, b.length()-1));

	}

}
