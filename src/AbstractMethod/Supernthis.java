package AbstractMethod;

public class Supernthis {

	
	int i = 18;
	
	public  void thiskeyword() {
		
		int a=100;
		
		System.out.println(a);
		System.out.println(this.i);
	}
		
		public static void main (String []args ) {
			
			Supernthis key = new Supernthis();
			
			key.thiskeyword();
			
			
		}
			
			
		
		
	}
	

