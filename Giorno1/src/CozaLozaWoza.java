
public class CozaLozaWoza {

	public static void main(String[] args) {
		
		int lowerbound = 1,
			upperbound = 110;
		
		
		String res = null;
		

		
		for(int number = lowerbound; number <= upperbound; ++number)
		{
			res = " ";
			
			if( number % 3 == 0   ) 
				
				res += "coza\n";
				
			
			
			if( number % 5 == 0) 
				res += "loza\n";
				
				
			
			if( number % 7 == 0) 
				res += "woza\n";
			
			
			
			
		}
		
		System.out.println(res);
		
	}

	
	
}
