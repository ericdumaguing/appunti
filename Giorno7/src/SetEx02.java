import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetEx02 {

	Set<Double> vals = null;
	
	public SetEx02() {
		
		vals = new HashSet<Double>();
	}
	
	
	public boolean put(double val) {
		
		//TODO: inserire elemento val
		//ritrona true se l'inserimento va a buon fine, false altrimenti
		
		vals.add(val);
		
		if(vals == null) return false;
		return true;
		
		
	}
	
	public int getSize() {
		
		//TODO: ritorna il numero di elementi contenuti nel set

		return vals.size();
	
	}
	
	public Set<Double> getMoreThen(double val) {
		
		//TODO: ritorna set contenente solo i valori maggiori di val
		Set<Double > res =  new HashSet<Double>();
		Iterator<Double> it = vals.iterator();
		double Max = it.next();
		
		while(it.hasNext()) {
			double v = it.next();
			if(v > val)
				res.add(v);
		}
		
		return res;
			

		
	}
	
	public  Map<Double, Integer> getMap(){
		
		//TODO: ritorna dizionario con tutte gli elementi di vals come chiavi e 0 come valore
	
	Map<Double, Integer> res = new HashMap<Double, Integer>();
	
	for(double val : vals)
	res.put(val, 0);
	return res;
	}
	

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		//TODO: instanziare classe
		// inserire 10.000 elementi (ATTENZIONE CHE ELEMENTO RIPETUTO NON VIENE INSERITO)
		// testare i metodi

		
		SetEx02 se2 = new SetEx02();
		
		for(int x = 0; x <10000; x++)
			while(!se2.put(Math.random()+1000)) {}
		
		System.out.print("Elem gt 500:" + se2.getMoreThen(500));
		System.out.println("Size: " + se2.getSize());
		System.out.println("Size: " + se2.getMap());
		
		
		
	}

}
