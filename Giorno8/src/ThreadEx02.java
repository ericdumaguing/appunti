import java.util.ArrayList;
import java.util.List;

public class ThreadEx02 {

	static private List<String> queue = null;
	
	public ThreadEx02(){
		
		queue = new ArrayList<String>(20);
		
	}
	
	
	static class FIllerRunn implements Runnable{
		
		@Override
		public void run() {

				queue.removeAll(queue);

				if(queue == null)
					System.out.println("La lista è vuota");
		
		}
	}
		

	static class EmptierRunn implements Runnable{
		
		
		@Override
		public void run() {
			int num = 0;
			for(int i = 0; i <10; i++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				num =(int) Math.random()*10;
				String s = num + "";
				queue.add(s);
			}
				
		}
	}
	
public static void main(String[] args) {
		
		Thread tf = new Thread(new FIllerRunn()),
			   te = new Thread(new EmptierRunn());
		
		tf.start();
		te.start();
		
		// attendo la fine dei tread con la isAlive()
		
		System.out.println("esecuzione completata...esco!");
	}
}
