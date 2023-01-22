package CodingPrctice;

public class CountNoChar {

	public static void main(String[] args) {
	
		String a = "Prashant Babasaheb Panchal";
		
		int count = 0;
		
		System.out.println("Size of rhe String is: "+a.length());
		
		for (int i = 0;i<a.length();i++)
		{
			if (a.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println("the number of character in the String: "+count);
	}

}
