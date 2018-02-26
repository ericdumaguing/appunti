import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Progrmma{

	public static void main(String[] args) throws IOException {
		File f = new File("prova.txt");
		
		
		if(f.exists()) {
			System.out.println("esiste");
		FileInputStream fis = new FileInputStream(f);
		FileReader fr = new FileReader (f);
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		System.out.println(isr.ready());
		br.close();
		System.out.println(isr.ready());
		System.out.println(br.ready());
		} else {
			
			System.out.println("non esiste");
		}
		
		System.out.println("-------------");
		BufferedReader br = new BufferedReader( new FileReader("prova.txt"));
		
		String riga = br.readLine();
		while( riga != null) {
			System.out.println(riga);
			riga = br.readLine();
		}
		
		
		
		
	}

}
