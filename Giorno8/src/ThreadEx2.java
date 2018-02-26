import java.util.ArrayList;
import java.util.List;


public class ThreadEx2 {

	static private List<String> queue = null;
	

	
	
	static class FIllerRunn implements Runnable{
		
		@Override
		public void run() {

				
				if (queue.isEmpty())
					System.out.println("Lista vuota");
				else 
					queue.removeAll(queue);
		
		}
	}
		

	static class EmptierRunn implements Runnable{
		
		
		@Override
		public void run() {
			int num= 0;
			for(int i = 0; i < 10; i++)
			{
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				num = ((int)( Math.random()*10));

				queue.add((String.valueOf(num)));
				System.out.println(""+ queue);
			}
				
		}
	}
	
public static void main(String[] args) {
		
		Thread tf = new Thread(new FIllerRunn()),
			   te = new Thread(new EmptierRunn());
		queue = new ArrayList<String>(10);
		tf.start();
		te.start();
		
		
		// attendo la fine dei tread con la isAlive()
		
		System.out.println("esecuzione completata...esco!");
	}
}
