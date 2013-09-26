import java.util.Scanner;

public class  RPS {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		
		
		//Math.random syntax: Min + (int)(Math.random() * ((Max - Min) + 1))
		
		int computerChoice = 0 + (int)(Math.random()*(3-0)+1);		
		
		// ROCK = 1 PAPER = 2 SCISSORS = 3	
		System.out.println("Choose: ROCK, PAPER, SCISSORS (all CAPS) ?");
	
		String choice = input.next();
		
			
	//	System.out.println(computerNum);
		
		if ((computerChoice == 1))
		{	
			System.out.println("The computer chose ROCK");
			
			if ((choice.equals("ROCK")))
			System.out.println("Its a tie");
			
			if ((choice.equals("PAPER")))
				System.out.println("You win!");
			
			if ((choice.equals("SCISSORS")))
				System.out.println("You lose");
			
		}
			
			
		else if ((computerChoice == 2))
		{	
			System.out.println("The computer chose PAPER");
			
			if ((choice.equals("ROCK")))
			System.out.println("You lose");
			
			if ((choice.equals("PAPER")))
				System.out.println("Its a tie!");
			
			if ((choice.equals("SCISSORS")))
				System.out.println("You win");
			
		}
			
		
		else if ((computerChoice == 3))
		{	
			System.out.println("The computer chose SCISSORS");
			
			if ((choice.equals("ROCK")))
			System.out.println("You win!");
			
			if ((choice.equals("PAPER")))
				System.out.println("You lose!");
			
			if ((choice.equals("SCISSORS")))
				System.out.println("Its a tie");
			
		}
			
	  
	  }
	

}
