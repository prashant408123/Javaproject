package CodingPrctice;

import java.util.HashMap;
import java.util.Scanner;

public class countEachCharacter {
	
	public static void getcharCount(String name) {
		
		HashMap <Character, Integer> hmap= new HashMap<Character, Integer> ();
		
		char [] str= name.toCharArray();
		
		for(char c:str)
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
		
	
		System.out.println(name+ " : "+hmap);
	}
		
		
		
	public static void  main (String []args) {
		
		getcharCount("aabbbcccddddddeemmnnnooo");
		
		getcharCount("Ptashant Babasaheb Panchal");
	}
	
}