import java.util.Scanner;

public class  wk6_lab5 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		
		
		//Math.random syntax: Min + (int)(Math.random() * ((Max - Min) + 1))
		
		int computerChoice = 0 + (int)(Math.random()*(3-0)+1);		
		
		System.out.println("How many times would you like to play the game?");
		
		int games = input.nextInt();
		boolean turns = true;
		int runs = 0;
		
		int userWins =0;
		int compWins =0;
		
		
		while (turns)
		{
			
		
		// ROCK = 1 PAPER = 2 SCISSORS = 3	
		System.out.println("Choose: ROCK, PAPER, SCISSORS (all CAPS) ?");
	
		String choice = input.next();
		runs ++;
		turns = runs <games;
			
	//	System.out.println(computerNum);
		
			
			
		if ((computerChoice == 1))
		{	
			System.out.println("The computer chose ROCK");
			
			if ((choice.equals("ROCK")))
			System.out.println("Its a tie");
			
			else if ((choice.equals("PAPER")))
			{
				System.out.println("You win!");
			}	userWins++;
			
			if ((choice.equals("SCISSORS")))
			{
				System.out.println("You lose");
				compWins++;
			}
		}
			
			
		else if ((computerChoice == 2))
		{	
			System.out.println("The computer chose PAPER");
			
			if ((choice.equals("ROCK")))
			{
				System.out.println("You lose");
			
				compWins++;
			}
			if ((choice.equals("PAPER")))
				System.out.println("Its a tie!");
			
			if ((choice.equals("SCISSORS")))
			{
				System.out.println("You win");
		
				userWins++;
			}
		}
			
		
		else if ((computerChoice == 3))
		{	
			System.out.println("The computer chose SCISSORS");
			
			if ((choice.equals("ROCK")))
			{
				System.out.println("You win!");
				userWins++;
			}
			if ((choice.equals("PAPER")))
			{
				System.out.println("You lose!");
				compWins++;
			}
			if ((choice.equals("SCISSORS")))
				System.out.println("Its a tie");
			
		}
		
	
			
		}
		System.out.println("You won "+ userWins +" times");
		System.out.println("You lost " + compWins+ " times");
	  
		if (userWins > compWins)
		{	
			System.out.println("Yaay! You win!");
		}
		if (userWins < compWins)
		{
			System.out.println("Oh no, you lost!");
		}
		if (userWins == compWins)
		{	
			System.out.println("Its a tie!");
		
		}
	  }
	
	

}
