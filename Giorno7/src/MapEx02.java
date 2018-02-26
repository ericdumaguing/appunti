import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx02 {

	
	Map<String, Integer> wordCounter = null;

	String nomeFile;

	
	public MapEx02(String nomeFile) {
		
		this.nomeFile = nomeFile;
		//...
	}
	
	public void countWord() throws FileNotFoundException  {
		//TODO: aprire il file all'indirizzo nomeFile
		//contare le occorrenze di tutte le parole contunute nel file
		//salvando i dati all'interno del dizionario
		
		//FileReader fr = new FileReader (f);
		
		//BufferedReader br = new BufferedReader(fr);
		
		File f = new File (nomeFile);
		Scanner input = new Scanner(f); 
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();
		int count = 0;
		while(input.hasNext()) {
			String word = input.next();
			System.out.println(word);
			
			wordCounter.put(word, 0);
			if( word == word) {
			 count = count + 1;
			}
	    }
		
		//for(int val : )
		
		System.out.println(wordCounter);
		System.out.println(count);
		
	   
	  }
		

		
		
		
		
		
	/*
	
	@Override
	public String toString() {

		//TODO: ritornare rappresentazione del dizionario nel formato
		// parola --> 10
		// altraparola -->13
		// ... ---> ... 
		

		
		return ;
	}
	*/
	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO: dopo aver generato un file con testo lorem ipsum (vedi google)
		//passare all'inderizzo del file al costrutture  della classe corrente 
		//avviare il conteggio di parole
		//stampare il r

		
		MapEx02 m = new MapEx02("lorem.txt");
		
		System.out.println(m.toString());
		
		m.countWord();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
