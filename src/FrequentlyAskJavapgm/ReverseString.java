package FrequentlyAskJavapgm;

public class ReverseString {

	public static void main(String[] args) {
		
		String abc = "123456";
		
		for(int i = abc.length()-1; i>=0;i--)
		{
		 System.out.print(abc.charAt(i));
		}
		
		
//		char a[] = abc.toCharArray();
//		int len = abc.length();
//		System.out.println(len);
//		for (int i = len-1; i>=0;i--)
//		{
//			System.out.print(a[i]);
//		}
	
	}
}


