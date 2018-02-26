
public class GenericMath {

	
	static <E extends Number> Double sum(E val1, E val2) {
		
		return val1.doubleValue() + val2.doubleValue();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Double sum1 = GenericMath.sum(new Integer(10), new Integer(10)),
				sum2 = GenericMath.sum(10.5f, 20.3f),
				sum3 = GenericMath.sum(.3d, new Integer(10));
		
		
		System.out.println(" sum1 = "+ sum1);
		System.out.println(" sum2 = "+ sum2);
		System.out.println(" sum3 = "+ sum3);
	}
	
	
	
}
