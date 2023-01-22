package FrequentlyAskJavapgm;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="MADAM";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
		b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
		System.out.println("String is pallidrome");
		}
		else
		{
		System.out.println("String is not pallidrome");
		}
		
	
	}

}
