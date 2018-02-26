
public class PizzaEater {

	static Integer sliceOfPizza = null;
	
	static class Eater implements Runnable {
		
		private Waitress w = null;
		
		public Eater(Waitress w) {

			this.w = w;
		}
		
		@Override
		public void run() {

			System.out.println("Arrivo al ristorante");
			while (sliceOfPizza < 1) {
				
				synchronized (sliceOfPizza) {
					
					if (sliceOfPizza < 1) 
						System.out.println("Attendo arrivo pizza");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
			int sliceEated = 0;
			while (sliceOfPizza > 0) {
		
				synchronized (sliceOfPizza) {
					sliceOfPizza--;
					sliceEated++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Mangio fetta di pizza (" + sliceOfPizza + ")");
				
				if (sliceEated > 5) 
					w.endOfPizza();
			}
			
			System.out.println("Pago il conto per " + 
								(sliceEated / 4) + 
								" pizze e esco");
		}
	}
	static class Waitress implements Runnable {
		
		private int max_pizza = 3;
		
		@Override
		public void run() {

			System.out.println("Inizio lavoro camerire");
			
			int x=0;
			while (x<max_pizza) {
				
				if (sliceOfPizza < 2) {
					
					System.out.println("Salve, sono il camerire e vi porto una pizza");
					synchronized (sliceOfPizza) {
						sliceOfPizza += 4;
						x++;
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Fine lavoro camerire");
		}
		public void endOfPizza() {
			
			max_pizza = 0;
		}
	}
	
	public static void main(String[] args) {
		
		Waitress waitress = new Waitress();
		Eater eater = new Eater(waitress);
		
		Thread eaterT = new Thread(eater),
			   waitressT = new Thread(waitress);
		
		sliceOfPizza = 0;
		
		System.out.println("Restaurant init");
		
		eaterT.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitressT.start();
		
		
		while (eaterT.isAlive() || waitressT.isAlive())
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		System.out.println("Restaurant finalized");
	}
}
