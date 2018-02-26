import java.util.Random;

public class NumeriCasuali {

	public static void main(String[] args) {
		
		
		Random rand= new Random();
		
		//NUMERO MAX
		
		
		int max = -1;
		double media = 0.0;
		
		for( int x = 0; x < 10; x++)
		{
			int buf = (int) ( Math.random() * 100);
			
			System.out.println(" Testo se " + buf + " e' piu' grande di " + max);
			
			
			//if(max < buf)
				//max=buf;
			max = Math.max(buf, max);
			
		}
		
		
		
		System.out.println("Il numero piu' grande che ho trovato e' " + max);

		
		// NUMERO MAX NEGATIVO
		
		
		int max2= -200; 
		
		
		for ( int m = -10; m < 0; m++)
		{
			int buf2 = rand.nextInt(100)-200;
			
			
			System.out.println(" Testo se " + buf2 + " e' minore di " + max2);
			


			max2 = Math.max(buf2, max2);
					
					
					
					
					
		}
		
		
		
		System.out.println("Il numero piu' grande che ho trovato e' " + max2);
		

   //MEDIA
		
			for( int e = 0; e < 10; e++)
			{
				int buf3= rand.nextInt(200)-100;
				
				System.out.println(" Numeri: " + buf3 );
				
				media = buf3/10;
						
				
				
			}
			
			System.out.println("La media: " + media);
			
			
			
			
			
		}
		
	
	
	
		
		
		
		
		
		
		
	}


