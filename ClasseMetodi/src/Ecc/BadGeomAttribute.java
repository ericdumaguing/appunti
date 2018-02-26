package Ecc;

import javax.management.BadAttributeValueExpException;

abstract public class BadGeomAttribute extends BadAttributeValueExpException {

	



	/**
	 * 
	 */
	private static final long serialVersionUID = 156L;
	/*
	- creare classe astratta BadGeomAttribute con i seguenti vincoli:
		- estende la classe BAEE
		- estensione del messaggio di deafult (getMessage())
		- serialVersionUID = 156L
		- implementare construttore che accetti in ingresso il nome del 
			parametro errato (string) e il valore (double)
		- creare classe BadRaggio che estende BadGeomAttribute
		- creare classe InsuffRaggio che estende BadRaggio da lanciare nel caso in cui
			dato il raggio, l'area  del cerchio sia inferiore a 0.1
		- creare classe HeavyRaggio che estende BadRaggio da lanciare nel in cui dato il raggio, l'area del cerchio sia superiore a 100
		- creare classe BadLato che estende BadGeomAttribute
		- creare classi InsuffLati e HeavyLati che seguono la logistica del cerchio applicato alla classe Rect
		
		- nel main:
			istanziare 10 cerchi e 10 rettangoli
			con parametri double ricavati random [ -1000 ; +1000 ] e stampare a video un 
			messaggio consistente con i risultati
			
		N.B. : in questo caso nessun costrutoto try-catch e' richiesto all'interno delle classi i controlli vanno fatti in fase di istanza(nel main)
	*/	
	
	
	
	@Override
	public abstract String getMessage();
	
	
	String err;
	double val;

	
	
	public BadGeomAttribute(String err, double val) {
		
		super(null);

		this.err = err;
		this.val = val;
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
