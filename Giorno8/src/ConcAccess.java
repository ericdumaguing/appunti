import java.util.ArrayList;
import java.util.List;

public class ConcAccess {
	
	
	static List<String> msgs = new ArrayList<String>();
	
	
	
	
	
	

	static class MyRunn1 implements Runnable{
		
	
			public void run() {
				System.out.println("starting og thread 1");
				
				
				try {
					Thread.sleep(1000);
				
				
			}catch(InterruptedException e) {
				
						
				
				synchronized (msgs) {
					
					for (int x= 0; x<10;x++) 
						
						msgs.add("from thread 1: iteration " + (x-1));
					
				}
				System.out.println("ending of thread");
				}
		}
		
		
		
			static class MyRunn2 implements Runnable{
				
				
				public void run() {
					System.out.println("starting og thread 2");
					
					synchronized (msgs) {
						
						for (int x= 0; x<10;x++) 
							
							msgs.add("from thread 2: iteration " + (x-1));
						
					}
					System.out.println("ending of thread");
					}
					
			}
			
			
			
			
			
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new  MyRunn1()),
				t2 = new Thread(new  MyRunn2()); 
		
		t1.start();
		t2.start();
		
		
		while(t1.isAlive() || t2.isAlive())
			
			try {
				Thread.sleep(100);
			}catch ( InterruptedException e)
		{
				e.printStackTrace();
		}
		
		
		synchronized (msgs) {
			
			System.out.println("printing msgs");
			for(String msg : msgs)
				System.out.println("msg: "+ msg);
		}
			
		}
		
		
	}
	
}
