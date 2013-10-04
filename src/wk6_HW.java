import java.util.Scanner;
import javax.swing.JOptionPane;

public class  wk6_HW {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		
		
		//Math.random syntax: Min + (int)(Math.random() * ((Max - Min) + 1))
		
			
		//The below code converts the string input to an int
		int games = Integer.parseInt(JOptionPane.showInputDialog("How many times would you like to play the game?"));
		
		//int games = input.nextInt();
		int halfgames = games/2; 
		boolean turns = true;
		int runs = 0;
		
		int userWins =0;
		int compWins =0;
		
		
		while (turns)
		{
			
		int computerChoice = 0 + (int)(Math.random()*(3-0)+1);	
		// ROCK = 1 PAPER = 2 SCISSORS = 3	
		String choice = JOptionPane.showInputDialog("Choose: ROCK, PAPER, SCISSORS (all CAPS) ?");
	
		//String choice = input.next();
		runs ++;
		turns = runs <games;
			
	//	System.out.println(computerNum);
		
			
			
		if ((computerChoice == 1))
		{	
			JOptionPane.showMessageDialog(null,"The computer chose ROCK");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie");
				compWins = compWins +0;
				userWins = userWins +0;
			}
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"You win!");
			}	userWins++;
			
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"You lose");
				compWins++;
			}
		}
			
			
		else if ((computerChoice == 2))
		{	
			JOptionPane.showMessageDialog(null,"The computer chose PAPER");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"You lose");
			
				compWins++;
			}
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie!");
				compWins = compWins +0;
				userWins = userWins +0;
			}
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"You win");
		
				userWins++;
			}
		}
			
		
		else if ((computerChoice == 3))
		{	
			JOptionPane.showMessageDialog(null,"The computer chose SCISSORS");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"You win!");
				userWins++;
			}
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"You lose!");
				compWins++;
			}
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie");
				compWins = compWins +0;
				userWins = userWins +0;
				
			}
			
			
		}
		
			if (userWins == compWins)
			{	
				JOptionPane.showMessageDialog(null,"Its a tie! Game over...");
			}
			
				
	
		if (userWins > halfgames)
		{	
			JOptionPane.showMessageDialog(null,"Yaay you win, you won "+ userWins +" times");
			turns = false;
		}
		
		if (compWins > halfgames)
		{
			JOptionPane.showMessageDialog(null,"You lose, you lost " + compWins+ " times");
			turns = false;
		}
	}
		

	  
	  }
	
	

}

