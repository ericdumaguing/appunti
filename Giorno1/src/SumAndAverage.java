
public class SumAndAverage {

	public static void main(String[] args) {

		double sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for( int number = lowerbound; number <= upperbound; ++number)
		{
			sum= sum + number;
		}
		
		average = sum / 100 ;
		
		System.out.println(sum);
		System.out.println(average);
		
		
		int number=lowerbound;
		
		while(number <= upperbound)
		{
			sum= sum + number;
			
			++number;
		}
		
		System.out.println(sum);
		
		

		
		do
		{
			sum= sum + number;
			
			++number;
		}while(number <= upperbound);
		
		
		System.out.println(sum);
		
		
		
		int count= 0;
		
		for( number = lowerbound; number <= upperbound; ++number)
		{
			sum= sum + number;
			++count;
		}
		
		System.out.println(sum);
		
		
	}

}
