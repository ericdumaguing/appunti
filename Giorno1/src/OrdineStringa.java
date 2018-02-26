import java.util.Scanner;

public class OrdineStringa {

	public static void main(String[] args) {

		
		Scanner in= new Scanner(System.in);
		String parola="";
		StringBuffer reverse = new StringBuffer(parola.length());
		
		
		System.out.print("Inserisci la parola: ");
		parola=in.next();
		

		for( int i = parola.length()-1; i >= 0; i-- )
		{
			reverse.append(parola.charAt(i));
		}
		
		String parolainversa = reverse.toString();

		System.out.println("La parola inversa è: " + parolainversa);
		
		String parola2="";
		StringBuffer reverse2  = new StringBuffer(parola2.length());
		
		System.out.print("Inserisci la parola piu' di 7 lettere: ");
		parola2=in.next();
		
		for ( int n = parola2.length()-2; n >= 0; n--)
		{
			reverse2.append(parola2.charAt(n));
		}
		
		
		String parolainversa2 = reverse2.toString();
		
		System.out.println("La parola inversa è: " + parolainversa2);
		
		
		String parola3="";
		StringBuffer reverse3  = new StringBuffer(parola3.length());
		
		System.out.print("Inserisci la parola piu' di 7 lettere: ");
		parola3=in.next();
		
		for ( int n = parola3.length()-2; n >= 2; n--)
		{
			reverse3.append(parola3.charAt(n));
		}
		
		
		String parolainversa3 = reverse3.toString();
		
		System.out.println("La parola inversa è: " + parolainversa3);
		
		
		
		
		
	}

}
