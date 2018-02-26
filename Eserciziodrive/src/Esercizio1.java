import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Esercizio1 {

	public static void main(String[] args) throws IOException {

		
		File f = new File("a.txt");
		File g = new File("b.txt");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader(fr);
		FileOutputStream fos = new FileOutputStream(g);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);
		int cont = 1;
		
		String riga;
		riga = br.readLine();
		if(f.exists()) {
			System.out.println("esiste");

			while( riga != null) {
				
				System.out.println(cont+":"+ riga);
				riga = br.readLine();
				cont++;	
				
				if(cont % 2 == 0) {
				pw.println(riga);
				pw.flush();
				

			}
			
			}	
		
		} else {
			System.out.println("non esiste");
			
		}
		
		pw.println("Numero righe lette: ");
		for(int i = 0; i < cont - 1; i++) {
			
			pw.print("x ");
			pw.flush();
		}
		pw.println(" ");
		 
		char c;
		pw.println("Numero caratteri letti: ");
		for(int i = 0; i < cont - 1; i++) {
		c=(char) fr.read();
		
		pw.print("y ");
		pw.flush();
		}
		
		
		
		
		
		
		

}
}


