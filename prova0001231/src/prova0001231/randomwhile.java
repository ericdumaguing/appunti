package prova0001231;

public class randomwhile {
public static void main(String[] args) {
	
	int x=0;
	int r=0;
	int sum1=0;
	
	while (r<3) {
		x= (int) (Math.random()*100);
		if((x%2)!=0) {
			r++;
			sum1+=x;
		
			
			System.out.println("num.dispari random:"+x);
		}
		
	}
		System.out.println("somma:" +sum1);
	}
	

}


