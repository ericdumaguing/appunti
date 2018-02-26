import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx01 {
	
	
	
	List<Integer> vals = null;
	
	
	
	
	public ListEx01() {
		vals = new ArrayList<Integer>(20);
		
	}
	
	
	
	public void put(int val) {
		// TODO: inserire elemento nelle lista
		
		vals.add(val);
		
		
		
	}
	
	
	public boolean remove(int index) {
		// TODO: rimuovere elemento all' indice;
		//ritornare true se l'eliminazione va a buon fine, false altrimenti
		
		if ( index < 0) {
		vals.remove(index);
		return true;
		}
		else return false;
		
	}
	
	
	public boolean removeObj(Integer val) {
		// TODO: rimuovere elemento all' indice;
				//ritornare true se l'eliminazione va a buon fine, false altrimenti
	
		if( val < 0) {
			vals.remove(val);
			return true;
		} else 
			return false;
		
	
	
	}
	
	
	
	public int findObj(Integer val) {
		// TODO: ritornare l'indice corrispondente all' elemento  val o -1 se non trovate 
		return vals.indexOf(val);
		
	}
	
	public Integer getMax() {
		
		// TODO: ritornare elemento di valore massimo
		
	
		Iterator<Integer> it = vals.iterator();
		int Max = it.next();
		
		while(it.hasNext()) {
			int elem = it.next();
			if(elem>Max)
				Max = elem;
		}
		
		return Max;
		
		}
	public int getMaxInd() {
		
		// TODO: ritornare l'indice corrispondente all'elemento di valore massimo
		return vals.indexOf(getMax());
	}
	
	public int sum() {
		//TODO: ritornare somma di tutti gli elementi 
		//VINCOLI: utilizzare ciclo foreach (es: for(Integer val : vals) {...}
		int somma= 0;
		for(Integer val : vals) {
			
		somma=somma + vals.get(val);
		}
		
		return somma;
		
		
	}
	
	public int sumIt() {
		//TODO: ritronare somma di tutti gli elemnti 
		//VINCOLI: utilizzare iteratore 
		Iterator<Integer> it = vals.iterator();
		int somma = 0;
		while(it.hasNext()) {
			
			 somma += it.next();
			 
			
		}
		
		return somma;
		
	}
	
	
	@Override
	public String toString() {
		// TODO: ritornare la lista di tutti gli elementi e la somma nel formato seguente:
				//			[elem1, elem2, elem3, ..., elemN] = somma
		
			StringBuilder sb = new StringBuilder();
			
			sb.append("Lista elementi: " + vals.toString() + "\n");
		
			return sb.toString();
		
			}
			
			public static void main(String[] args) {
				
				// TODO: instanziare la nuova classe
				//		 inserire 100 elementi casuali all'interno della lista
				// 		 testare tutti i metodi verificandone la correttezza
				
				
				ListEx01 l = new ListEx01();
			
				for(int i = 0; i<100; i++)
				{
					l.put((int)(Math.random()*100));
				}
				
				System.out.println(l.toString());
				
				System.out.println("Somma: " + l.sum());
				System.out.println("Somma IT : " + l.sumIt());
				System.out.println("Max: " + l.getMax());
				System.out.println("Max ind: "+ l.getMaxInd());
				System.out.println( "remove: " + l.remove(2));
				System.out.println( "remove obj: " + l.removeObj(4));
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
		}