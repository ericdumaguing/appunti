package prova0001231;

public class basco {
	

	
	public abstract class A{
		abstract void metodoA();
		
		private void metodoB() {
			metodoA();
		}
		
	}
	
	public  class  B extends A{
	void metodoA() {
	}
	
	void metodoB() {
		
	}
	 
	String getSize = null;

	}
	
	
	
	public static void main(String[] args) {
		

//		int []a = { 1,2,3,4,5,6};
//		
//		
//		int i = a.length - 1;
//		
//		
//		while( i>=0)
//		{
//			System.out.println(a[i]);
//			i--;
//		}
		
		
//		int x = 0, y = 10;
//		
//		try {
//			y/=x;	
//		}
//		//System.out.println("/ by 0");
//		
//		catch (Exception e) {
//			
//			System.out.println("error");
//		}
		
//		int a = 10;
//		
//		switch (a) {
//		case 1:
//			System.out.println("val 1");
//			
//			break;
//		case 5:
//			System.out.println("val 5");
//			
//			break;
//		case 10:
//			System.out.println("val 10!");
//			
//			break;
//		case 15:
//			System.out.println("val 15");
//			
//			break;
//
//		default:
//			System.out.println("default");
//		}
		
		
//		
//		int a[][] = new int[3][];
//		
//		a[1] = new int[] {1,2,3};
//		
//		a[2] = new int [] {4,5};
//		
//		System.out.println(a[1][1]);
		
		
		String parolaDaInvertire  = " parola";
		String stringaInvertita = "";
		
		for(int i = parolaDaInvertire.length() - 1; i>=0 ; i--)
		{
			stringaInvertita += parolaDaInvertire.charAt(i);
		}
		System.out.println(stringaInvertita);
	}
}
