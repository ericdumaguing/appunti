package prova0001231;

public class random {

	public static void main(String[] args) {
	
		int x=0;
		int r=0;
		int sum1=0;
		
		for (r=0; r<3; r++) {
			x=(int) (Math.random()*100);
			if((x%2)==0)
				x++;
				sum1+=x;
			System.out.println("num.random dispari:  " +x);
		}
	
	System.out.println("num.somma tot:  "+sum1);
	}
	
	
}
