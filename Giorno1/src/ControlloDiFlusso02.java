
public class ControlloDiFlusso02 {

	public static void main(String[] args) {
		
		// CICLI
		
		//for
		
		for(int i=0; i < 10; i++) // serve per iterare un numero predefinito di volte
		{
			System.out.println(i);
		}
		
		// uguale 
		
		int x=0;
		 for(;x < 10; )
		 {
			 System.out.println(x);
			 x++;
		 }
		 
		 
		 //while()
		 
		 while(x > 0) // verifica che  x è >0 altrimenti non esegue il ciclo
		 {
			 // se la condizione (x) è vera allora stampa il system
			 System.out.println(x);
		 }
		 
		 
		 // do ... while()
		 
		 do 
		 {
			 //stampa il system
			 System.out.println(x);
			 x++; // x+1
			 // finchè la condizione non risulta >10 altrimenti continua stampare il system
		 }while (x<10);
		 
		 
	}

}
