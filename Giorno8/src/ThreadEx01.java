
public class ThreadEx01 {

	//implementare Runnable che stampa il contatore di loop for tra 0 e 10
	
	static Integer cont = null;
	
	
	static class MyRunn implements Runnable{
		
		
		@Override
		public void run() {

			
			
				for( int x = 0; x < 10; x++) {
				

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("" + x);
			}
			
			
		}
		
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		new Thread(new MyRunn()).start();

		System.out.println("End of main");
	}

}
