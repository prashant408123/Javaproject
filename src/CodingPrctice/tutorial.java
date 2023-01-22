package CodingPrctice;

import java.util.Scanner;

public class tutorial {


public static void main(String[] args) {
	
String a = "MADAM";
String b= "";

for (int i =a.length()-1;i>=0;i--)
{
	b= b+a.charAt(i);
}
if (a.equals(b))
{
System.out.println("String is pallindrome");
}
else {
	System.out.println("String is not pallindrome");
}

}
}
