
public class PrintNumberInWord {

	public static void main(String[] args) {
		
		int number = 5;
		
		if(number == 1)
		{
			System.out.println("One");
		}
		else if(number == 2)
		{
			System.out.println("Two");
		}else if(number == 3)
		{
			System.out.println("Three");
		}else if(number == 4)
		{
			System.out.println("Four");
		}else if(number == 5)
		{
			System.out.println("Five");
		}else if(number == 6)
		{
			System.out.println("Six");
		}
		
		
		//Switch
		switch (number)
		{
		case 1:	
			System.out.println("One"); 
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		default:
			System.out.println("valore default");
		
		
		}
	}

}
