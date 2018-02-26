
public class HarmonicSum {

	public static void main(String[] args) {

		
		int maxDenominator = 50000;
		int minDen = 2;
		double sum2R = 0.0;
		double sum2L = 0.0;
		
		
		for(int denominator = 1; denominator <= maxDenominator; ++denominator)
		
			 sum2R += 1 / (double) denominator;
		
		
		for(int den = 1; maxDenominator >= minDen; ++den)
		
			 sum2L += 1 / (double) den;
		
		
		
		System.out.println(" The sum from left-to-right is : " + sum2R);
		System.out.println(" The sum from left-to-right is : " + sum2L);
		 
		
	}

}
