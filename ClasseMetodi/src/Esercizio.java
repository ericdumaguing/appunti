import java.util.Arrays;

public class Esercizio {

	static class ArrEs
	{
		int[] intArr = { 3,5,10,100,40000, 17};
		
		
		void es1()
		{
			
			System.out.println("Hello");
		}
		
		void es2()
		{
			
			
			for( int x = 0; x < intArr.length; x++)
			{
				System.out.println(x + ": " + intArr[x]);
			}
			
			System.out.println(" End of method and return ");
			return;
		} 
		
		void es3()
		{
			
			
			for( int val : intArr)
			{
				System.out.println(val);
			}
			
			System.out.println(" End of method and return ");
			return;
		} 
		
		void setAllZero()
		{
			for(int x = 0; x < intArr.length; x++)
			{
				intArr[x] = 0;
			}
		}
		
		public ArrEs(String val)
		{
			System.out.println(val);
			es2();
		}
		
		
		public int[] getintArr()
		{
			return intArr;
		}
		
		public void sayHello()
		{
			System.out.println("Hello");
		}
		
		public ArrEs()
		{
			es2();
			setAllZero();
			es3();
			
		}
	}
	
	
	static class MathArray
	{
		int[] buff;
		
			public MathArray ()
			{
				int[] b = {3, 4 ,56 ,7, 88, 92, 2, 10};
				buff = b;
			}
			
			public int getSum()

			
			{
				int ris = 0;
				// ritorna la somma di tutti gli elementi contenuti nel vettore
				for( int x = 0; x < buff.length; x++)
				{
					ris += buff[x];
					
				}
				
				return ris;
				
			}
			
			
			public int getAvg()
			{
				int ris = 0;
				// ritorna la somma di tutti gli elementi contenuti nel vettore
				for( int x = 0; x < buff.length; x++)
				{
					ris += buff[x];
					
					
				}
				ris = ris / buff.length;
				
				return ris;
			}
			
			
			
			public boolean thereIsNega()
			{
				for( int x = 0; x < buff.length; x++)
				
					if(buff[x] < 0)
						{
							
							return true;
						}
				
					
						return false;
					
				
			}
			
			public void reverseArr()
			{
				int [] rev = new int[buff.length];
				for ( int x = 0; x < buff.length; x++)
				
					rev[buff.length - 1 - x] = buff[x];
				
					buff = rev;
			}

	/*
			public static Integer getSumArray() 
			{
				if ( arr = null)
					return null;
				
				int sum = 0;
				for (int a :)
			}
	
		*/	
	
	}			
			static class ArrayManipulation {
				
				int[] myInt = {3, 4, 5, 10};
				
				
				public static Integer getMax(int[] arr)
				{
					 
					
					if	(arr == null)
						
						return null;
					
					int max = 0;
					
					for( int x = 0; x < arr.length; x++) 
					
						if(arr[x] > max )
						
							max = arr[x];
					
					return max;
					
				}
				
				
				
				
			
				
				public static Integer findElem( int[] arr, int elem)
				{
					
					int indice = 1;
					
					
					if ( arr == null )
						return null;
					
					for( int x = 0; x < arr.length; x++)
					{
						if( elem == arr[x])
						
							indice += x;				
							
					}
					
					return indice;
					
					
				}
				
				
				
				
	

			public static int[] conc(int[] ar1, int [] ar2)
			{
				if ( ar1 == null)
				{
					return null;
				}
				
				if ( ar2 == null)
				{
					return null;
				}
				
				int leng = ar1.length + ar2.length;
				
				int[] res = new int[leng];
				
				int ind = 0;
				
				for(int e : ar1)
					res[ind++] = e;
				for(int e : ar2)
					res[ind++] = e;

				return res;
				
			
	
					
					
					
					
					
					
			}
			
			/*
			public static int[] minusArr(int[] arr1, int[] arr2)
			{
				if ( ar1 == null)
				{
					return null;
				}
				
				if ( ar2 == null)
				{
					return null;
				}
				
				if (arr1.length != arr2.length )
				{
					return null;
				}
						
						
						int lng  = arr1.length;
				
				int[] res = new int[lng]
				
				
				
			}
	
*/
	
			}

	

	
	
	
	public static void main(String[] args) {
		/*
			ArrEs es=new ArrEs();
			ArrEs es2 = new ArrEs("Hello World");
			
			es.sayHello();
			es2.sayHello();
		
		int[] arr = es.getintArr();
		*/
		/*
		MathArray ma = new MathArray();
		
		int sum = ma.getSum();
		
		System.out.println(" TOT: " + sum);
		
		
		int media = ma.getAvg();
		
		System.out.println(" MEDIA: " + media);
		
		String str = null;
		str = "";
		
		if(ma.thereIsNega()== false)
		{
			System.out.println("Non ci sono numeri negativi");
		}
		else
		{
			System.out.println("Ci sono numeri negativi");
		}
		
		
		ma.reverseArr();
		*/
		int [] arr1 = { 3, 5, 10, 20, 50}, arr2 = {7, 7, 7, 7, 10}, arr3 = {4, 5,};
		
		int numero = 3;
		
		
		ArrayManipulation ma = new ArrayManipulation();
		
		System.out.println(" Massimo = " + ArrayManipulation.getMax(arr1));
		System.out.println(" Numero = " + numero + " Posizione: " + ArrayManipulation.findElem(arr1, numero) );
		System.out.println(" Array1 + Array2 = " + ArrayManipulation.conc(arr1, arr2) );
		

		
		
		
		
	}

}
