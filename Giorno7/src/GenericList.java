
public class GenericList<T> {

	private T[] myArr = null;
	
	public GenericList(T[] arr) {
		
		this.myArr = arr;
	}
	
	
	@Override
	public String toString() {
		
		
		if(myArr == null) return "";
		
		StringBuffer sb = new StringBuffer();
		if(myArr.length < 1)
			sb.append("[ - empty - ]");
		sb.append("[ ");
		for( T elem : myArr) 
			sb.append(elem.toString() + ", ");
			
			sb.append(" ]");
			
			
			return sb.toString();
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		 Integer[] ints = { 10, 20, 30, 5};
		 
		 Float[] floats = { 10.5f, 14.6f, 17.9f};
		 String[] strings = { "Hello" , "World"};
		 Double[] doubles = {};
		 
		GenericList<Integer> glInt = new GenericList<Integer>(ints);
		GenericList<Float> glFloat = new GenericList<Float>(floats);
		GenericList<String> glString = new GenericList<String>(strings);
		GenericList<Double> glDouble = new GenericList<Double>(doubles);
		
		System.out.println("ints = " + glInt.toString());
		System.out.println("floats = " + glFloat.toString());
		System.out.println("Strings = " + glString.toString());
		System.out.println("doubles = " + glDouble.toString());
		
		
		
		
		
	}
	
}
