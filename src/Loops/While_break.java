package Loops;

public class While_break {

	public static void main(String[] args) {
		int i =5;
		while(i<=10) {
			i++;
			if (i==8) {
				continue;
			}
			System.out.println(i);
			
		}
	}

}
