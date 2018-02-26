
public class Box<E> {

	
	private E e;
	
	public void setE(E e) {
		this.e = e;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return e.toString();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box();
		b1.setE(10);
		
		Box<String> b2 = new Box<>();
		b2.setE("Hello");
	
		
		System.out.println("out1: " + b1.toString());
		System.out.println("out2: " + b2.toString());
		
		
		
		
		
		
		
		
		
	}

}
