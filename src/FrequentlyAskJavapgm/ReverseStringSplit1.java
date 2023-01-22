package FrequentlyAskJavapgm;

public class ReverseStringSplit1 {

	public static void main(String[] args) {
		
		String a = "Deepali Prashant Panchal";
		String []b= a.split(" ");
		for(int i =b[0].length()-1;i>=0;i--)
		{
			System.out.print(b[0].charAt(i));
		}
		System.out.println();
		

		for(int i =b[1].length()-1;i>=0;i--)
		{
			System.out.print(b[1].charAt(i));
		}
		System.out.println();

		for(int i =b[2].length()-1;i>=0;i--)
		{
			System.out.print(b[2].charAt(i));
		}
		System.out.println();
	}

}
