package CodingPrctice;

import java.util.HashMap;

public class countcharcter {
	
	public static void countchar(String name) {
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		char ch[] = name.toCharArray();
		
		for (char c: ch)
		{
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else 
			{
				hmap.put(c, 1);
			}
			
		}
		
		System.out.println(name+" : "+hmap);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countchar("prashant babsaheb Panchal");
		countchar("sdet          ");
		
	}

}
