package String;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String a= "prashantpanchal";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<a.length();i++)
		{
		char ch= a.charAt(i);
		int b = a.indexOf(ch, i+1);
		
		if(b==-1) {
			sb.append(ch);
		}
		}
		System.out.println(sb);
		
	}

}
