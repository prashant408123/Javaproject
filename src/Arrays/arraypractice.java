package Arrays;

public class arraypractice {
	
	
	static void reverse(int arr[],int n,int k)
	{
		
		for(int i=0;i<n;i+=k)
		{
			int left = i;
			int right = Math.min(i+k-1,n-1);
			int temp;
			
			while(left<right)
			{
				temp= arr[right];
				arr[left]=arr[right];
				arr[right]=temp;
				
				left+=1;
				right-=1;
						
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {1235110341};
		int k=3;
		 int n = arr.length;
	     
	        reverse(arr, n, k);
	     
	        for (int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	}
		
	}


