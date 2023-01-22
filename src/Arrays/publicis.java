package Arrays;

import java.util.Scanner;

public class publicis {

	
		public static void main(String[] args)
		   {
		      int i, j, x;
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("Enter the Size of Array: ");
		      int tot = scan.nextInt();
		      int[] arr = new int[tot];
		      
		      System.out.print("Enter " +tot+ " Elements for the Array: ");
		      i=0;
		      while(i<tot)
		      {
		         arr[i] = scan.nextInt();
		         i++;
		      }
		      
		      j=tot-1;
		      i=0;
		      while(i<j)
		      {
		         x = arr[i];
		         arr[i] = arr[j];
		         arr[j] = x;
		         i++;
		         j--;
		      }
		      
		      System.out.println("\nReverse of Given Array is: ");
		      i=0;
		      while(i<tot)
		      {
		         System.out.print(arr[i]+ " ");
		         i++;
		      }
		   }
		
	}


