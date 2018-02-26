package prova0001231;

public class Numprimi {

	public static void main(String[] args) {
		int max = 100;

		int d = 0;
		int n = 0;

		      for (n = 0; n < max; n++) {
			d = 2;
			
			while ((n % d!= 0) && (d < n))
				d++;
			
			if (d == n)
			
				
				System.out.println(n);
		
		}
	
	
	}
}