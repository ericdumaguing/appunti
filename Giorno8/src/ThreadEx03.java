
import java.util.ArrayList;
import java.util.List;

public class ThreadEx03 {

	
	//Thread 1 : inserisce 100 interi casuali all'interno di list
	//thread 2 : prende tutti gli elementi contenuti in listi e ne fa copia da inserire in
	// list2;
	//
	//subito prima di terminare  la propria esecuzione thread1 fa la somma di tutti gli elementi 
	//contenuti in listi e la mette in variabili sum1
	//thread 2 : fa la stessa cosa con list 2 e sum2 
	//
	//prima di terminare la main confronta il valore di sum1 e sum2 e informa l'utente della
	//relativa uguglianza o meno
	
	
	 static List<Integer> list1 = null,
			list2 = null;
	
	 static Integer sum1 = null,
			sum2 = null;
			

	 static class FillerRun implements Runnable{
		 
		 
		 @Override
		public void run() {

			 
			 for(int i = 0; i < 100; i ++) {
				 int n = (int)(Math.random()*101);
					list1.add(n);
					
			 	}
			 System.out.println(list1.toString());
		 	}
	 }
	 
		static class getElem implements Runnable{
			
			@Override
			public void run() {
				
				for(int i = 0; i < 100; i ++) {
				list2.addAll(list1);
				}
				System.out.println(list2.toString());
				
				
				
				
			}
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		list1 = new ArrayList<Integer>(100);
		list2 = new ArrayList<Integer>(100);
		
		Thread te = new Thread(new FillerRun());
		Thread tg = new Thread(new getElem());
		
		te.start();
		tg.start();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
