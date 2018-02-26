
public class ThreadManager2 {

	
	
	static class MyThread extends Thread{
		
		final String NAME;
		
		
		public MyThread(String name) {
			
			NAME = name;
			
			System.out.println("init thread1\"" + name + "\"");
		}
		
	
		public synchronized void start() {
			
			System.out.println("start thread\"" +  NAME + "\"");
		}
		
		
		
		public void run() {
			System.out.println("running thread\"" + NAME + "\"");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(" end of thread\"" + NAME + "\"");
		}
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
