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

public class ProgrammaScritturaFile {

	public static void main(String[] args) throws IOException {

		
		
			File f = new File("risultato.txt");
		
		
		if(f.exists()) {
			
			System.out.println("esiste");
			
		} else {
			
			System.out.println("non esiste");
			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			PrintWriter pw = new PrintWriter(osw);
			pw.println(" ciao mondo!");
			pw.flush();
			fos.close();
		}
	}

}
