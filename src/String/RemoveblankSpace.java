package String;

public class RemoveblankSpace {

	public static void main(String[] args) {
		String a= "  pras  ha n     t";
		String b= a.replaceAll("\\s", "");
		System.out.println(b);
	}

}
