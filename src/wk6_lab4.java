import java.util.Scanner;

public class wk6_lab4 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;	
		computerNum = 0 + (int)(Math.random()*10);		
		
	//	int runs = 0;
		boolean result = true;
			
		while (result){
			
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
		
		
			
		boolean larger = computerNum < num;
		boolean smaller = computerNum > num;
		boolean equal = computerNum == num;
		
		
	  
		if (larger)
		{	
			System.out.println("Your guess is too large!");
			
		}
	  
		if (smaller)
		{	
			System.out.println("Your guess is too small!");
			
		}
		
		if (equal)
		{	
			System.out.println("You got it!");
			//result =false;
		
		}
		
		System.out.println("Do you want to try again? (1 for yes, 0 for no)");
		
		int answer = input.nextInt();
		//result = answer.equals("Y");
		
		switch (answer)
		{
		case 0:
			result = false;
			break;
			
		case 1:
			result = true;
			break;
			
		}
		
		
		
		}
		
	  }

}
