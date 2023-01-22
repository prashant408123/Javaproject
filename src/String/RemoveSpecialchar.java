package String;

public class RemoveSpecialchar {

	public static void main(String[] args) {
		String p="pra@!sh*ant&";
		
		String d= p.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(d);

	}

}
