import java.util.*;

public class ContatoreDiVocaboli {

	public static void main(String[] args) {

		
		String	 parola="";
		
		int vocali= 0;
		int consonanti = 0;
		
		Scanner in= new Scanner(System.in);
		
		
		
		System.out.print("Scrivi una parola almeno di 10 caratteri: ");
		parola = in.next();
		char[] carattere= new char[parola.length()];
		
		
		
		
		if(parola.length()<10)
		{
			System.out.print("Errore la parola è meno di 10 di caratteri!");
		}
		else
		{
			System.out.print("Ripeti il programma.");
			
		}
		
		
		for(int i = 0; i < carattere.length; i++)
		{
			carattere[i] = parola.charAt(i);
			
			char let=carattere[i];
			
	
				if((let == 'a') || (let == 'e')|| (let == 'i') || (let == 'o')|| (let == 'u'))
				{
					
					System.out.print(let);
					vocali++;
					
				
				}
				else 
				{
				
					consonanti++;
				}
				
		}
		
		System.out.print("Ci sono: "+ vocali + " vocali");
		System.out.println("Ci sono: "+ consonanti + " consonanti");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
