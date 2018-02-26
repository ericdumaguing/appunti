import javax.management.BadAttributeValueExpException;

public class Clock {

	
	// dare la possibilita' di memorizzare lo stato del tempo in termini di HH-MM:s
	//
	//fornire i segementi metodi:
	// - void setTime(int, int, int)
	// - String getTime()
	// - long getTimeInMillis() <--- ritorna i ms a partire dalle 00:00.0
	// - void tick() <-- incrementa i secondi 1
	// - boolean  isAM()
	// - boolean equals(Object)
	// - String toString() <-- stampa l'ora nel formato HH:MM.s
	//						ES 01:01:1
	//						12:10:40
	//						23:59:59
	
	// costruttori:
	// - default <-- Clock()
	// - Clock(int, int, int)
	
	
	
	
	
	int ore, minuti, secondi;
	
	private String getZeroValue(int val) {
		
		return (val < 10 ? "0" : "") + val;
	}
	public Clock() {
		
		ore = 0;
		minuti = 0;
		secondi = 0;
		
	}
	
	
	
	
	
	
	public void setTime(int ore, int minuti, int secondi) throws BadAttributeValueExpException  {
		
		
		if(ore < 0 || ore >23 || minuti < 0 || minuti > 59 || secondi < 0 || secondi > 59)
			throw new BadAttributeValueExpException ( "Invalid argument\rh = " + ore + "\n" + "m = " + minuti + "\ns= "+ secondi); 
			

				this.ore = ore;
				this.minuti = minuti;
				this.secondi = secondi;
	}
	
	public Clock(int ore, int minuti , int secondi) throws BadAttributeValueExpException {
		
		setTime(ore, minuti, secondi);
	}
	/*
	public boolean setOre(int ore) {
		
		if(ore < 0 || ore > 24 ) {
			this.ore = ore;
			return true;
		}
		else
			return false;
	}
	
	
	public boolean setMinuti(int minuti) {
		
		if( minuti < 0 || minuti > 60) {
			this.minuti = minuti;
			return true;
		}
		else
			return false;
	}
	
	public boolean setSecondi(int secondi) {
		
		if( secondi < 0 || secondi > 60 ) {
			this.secondi = secondi;
			return true;
		}
		else 
			return false;
	}
	
	*/
	public int getOre() {
		
		return ore;
	}
	
	public int getMinuti() {
		
		return minuti;
	}
	
	public int getSecondi() {
		
		return secondi;
	}
	
	

	
	
	public void Tick() {
		secondi++;
		 if( secondi > 59) {
			 secondi = 0;
			 minuti++;
		 }
		 
		 if(minuti > 59)
		 {
			 minuti = 0;
			 ore++;
		 }
		 
		 if(ore > 23) {
			 ore = 0;
		 }
			 
		
	}
	
	
	public boolean isAM() {
		
		return ore < 11;
	}
	
	public String getTime() {
		
		return getZeroValue(ore) + ":" + getZeroValue(minuti) + ":" + secondi;
	}
	
	public long getTimeInMillis() {
		
		return secondi + (minuti*60) + (ore * 3600) * 1000;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Clock))
			return false;
					
					Clock c = (Clock) obj;
		
		return ore == c.getOre() && minuti ==  c.getMinuti() && minuti == c.getSecondi();
	}
	
	@Override
	public String toString() {
		return getTime();
	}
	public static void main(String[] args) {
	
	Clock c1 = null,
		  c2 = null;
	
	try {
		c1 = new Clock();
		c2 = new Clock(10,20,70);
	} catch (BadAttributeValueExpException e) {
		System.out.println(" Bad clock value!" + ((String) e.toString()));
	}
	
	if( c1 != null && c2 != null)
	
	for( int x = 0; x < 1000; x++) {
		System.out.println(c2.toString());
		c2.Tick();
	}
	else 
		System.out.println("Impossible good execution");
	
	
		
	}
	
	
	
	
	
}
