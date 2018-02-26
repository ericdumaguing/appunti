
public class ThreadManager {

	
	static class  MyRunn1 implements Runnable {
	
			
		public void run() {
			try {
				 Thread.sleep(5000);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			 System.out.println("Io sono il primo Thread");
		}

		static class MyRunn2 implements Runnable {
			
		
			public void run() {
				
				System.out.println("Io sono il primo Thread");
			}
				
			
		}
	
		
		public static void main(String[] args) {
			
			
			Thread t1 = new Thread(new MyRunn1(), " nome prima Thread ");
			
			t1.setDaemon(on);
			
			
			
		}
		
		
		
		
		
		
	
	
}
