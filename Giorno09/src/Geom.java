import java.util.List;
import java.util.Map;

public class Geom {

	public static abstract class FiguraGeom {
	
		Map<String, Integer> lati;
		
		// init from map
		public FiguraGeom(Map<String, Integer> map) { /*...*/ }
		
		// calcola perimetro
		public double getPerim() { /*...*/ }
		
		// calcola area
		public abstract double getArea();
		
		// restituisce una nuova FiguaraGeom con ogni lato dato dalla somma
		// dei lati dell'istanza corrente con i lati di fg
		// purché l'istanza corrente sia dello stesso tipo di fg
		// null altrimenti
		public abstract FiguraGeom sum(FiguraGeom fg);
	}
	// triangolo rettangolo
	public static class TriangoloRect extends FiguraGeom {
		
		// init da 3 lati (cateto1, cateto2, ipotenusa)
		public TriangoloRect(int c1, int c2, int ipot) { /*...*/ }
		// init da mappa
		public TriangoloRect(Map<String, Integer> lati) { /*...*/ }
	}
	// rettangolo
	public static class Rect extends FiguraGeom {  
		
		// init da 2 lati (lato1, lato2)
		public Rect(int l1, int l2) { /*...*/ }
		// init da mappa
		public Rect(Map<String, Integer> lati) { /*...*/ }
	}
	
	// lista figure geometriche
	List<FiguraGeom> figure;
	// triangolo rappresentante della somma di tutti i triangoli
	// inseriti in figure
	TriangoloRect sumTriang;
	// rettangolo rappresentante della somma di tutti i rettangoli
	// inseriti in figure
	Rect sumRect;
	
	// thread che genera casualmente 3 trinagoli seguiti da 2 rettangoli e li
	// mette nella lista di supporto figure
	public static class Generator implements Runnable { /*...*/ }
	// estrae tutte le figure nella lista figure e calcola la figura sommata risultante
	// in sumTriang e sumRect
	public static class Summer implements Runnable { /*...*/ }
	
	// lancia i due thread, richiede la fine dei lavori ai thread dopo 10s e
	// stampa a video il risultato
	public static void main(String[] args) {
		
	}
}
