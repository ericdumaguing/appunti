import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ProgrammaLogging {
	
	
	static Logger log = Logger.getLogger("Programmalogging");
	
	
	
	
	
	
	public static void  main(String[] args) {
		
		
		LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.INFO);
		
		
		try {
		log.log(Level.INFO,"Inizio programma ");
		
		
		int a  = 10;
		int b = 20;
		
		log.log(Level.FINE, "a: " +  a + ", b: " + b);
		
		int somma = a + b;
		int x = 0;
		
		double q = 10 / x;
		log.log(Level.FINE, "somma : "+ somma);
		
		log.log(Level.INFO, "fine programma");
		
		} catch (Exception e)
		{
			log.log(Level.SEVERE, "erroe" + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
