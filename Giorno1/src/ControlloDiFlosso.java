
public class ControlloDiFlosso {

	public static void main(String[] args)
	{
		// esecuzione condizionale (branching)
		
		int a = 10;
		
		
		// if().. else if()...) else{}
		if(a < 8) //espressione booleana (true o false)
			{
				System.out.println("minore");
			}
				else if(a > 20)
					{
						System.out.println("minore o uguale");
					}
				else 
				{
					System.out.println("compreso tra 8 e 20");
				}
		
		//switch(){...}
		
		int x = 3;
		
		switch (x) 
		{ // considera i diversi casi di valorizzazione della variabile x
		
			case 1: // nel caso che x valga 1 => if(x==1)
				System.out.println("vale 1");
				break;
			case 2:
				System.out.println("vale 2");
				break;
			case 3: 
				System.out.println("vale 3");
				break;
			case 4:
				System.out.println("vale 4");
				break;
			default:
				System.out.println("valore default");
				
		}
	}

}
