import java.util.Scanner;

import javax.swing.JOptionPane;

public class  wk7_lab2 {

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
		
		String comp = null;
		
		int [] userWins = new int [games];
		int [] compWins = new int [games];
		int [] ties = new int [games];
		
		int totalTies =0;
		int totalWins =0;
		int totalLose =0;
		
		String [] userChoice = new String [games];
		String [] compChoice = new String [games];
		
		
				
		while (turns)
		{
			
		int computerChoice = 0 + (int)(Math.random()*(3-0)+1);	
		// ROCK = 1 PAPER = 2 SCISSORS = 3	
		String choice = JOptionPane.showInputDialog("Choose: ROCK, PAPER, SCISSORS (all CAPS) ?");
		
		if ( computerChoice == 1)
		{
			comp = "Rock";
		}
		if ( computerChoice == 2)
		{
			comp = "Paper";
		}
		if ( computerChoice == 3)
		{
			comp = "Scissors";
		}
		
	
		//String choice = input.next();
		runs ++;
		turns = runs <games;
			
	//	System.out.println(computerNum);
		
		userChoice[runs -1]= choice;
		compChoice[runs-1]= comp;
			
		if ((computerChoice == 1))
			
			//for (int i=runs; i < (games - runs); i++)
		{	
			JOptionPane.showMessageDialog(null,"The computer chose ROCK");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie");
				
				
				ties[runs -1] = 1;
				userWins[runs -1 ]=0;
				compWins[runs -1]=0;
			}
			
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"You win!");
				ties[runs -1] = 0;
				userWins[runs -1]=1;
				compWins[runs -1]=0;
				
			}	
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"You lose");
				ties[runs -1] = 0;
				userWins[runs -1]=0;
				compWins[runs -1]=1;	
			}
		}
			
			
		else if ((computerChoice == 2))
		{	
			JOptionPane.showMessageDialog(null,"The computer chose PAPER");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"You lose");
			
				ties[runs -1] = 0;
				userWins[runs -1]=0;
				compWins[runs -1]=1;
			}
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie!");
				//compWins = compWins +0;
				//userWins = userWins +0;
				ties[runs -1] = 1;
				userWins[runs -1]=0;
				compWins[runs -1]=0;
			}
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"You win");
		
				ties[runs -1] = 0;
				userWins[runs -1 ]=1;
				compWins[runs -1]=0;
			}
		}
			
		
		else if ((computerChoice == 3))
		{	
			JOptionPane.showMessageDialog(null,"The computer chose SCISSORS");
			
			if ((choice.equals("ROCK")))
			{
				JOptionPane.showMessageDialog(null,"You win!");

				ties[runs -1 ] = 0;
				userWins[runs -1]=1;
				compWins[runs -1]=0;
			}
			if ((choice.equals("PAPER")))
			{
				JOptionPane.showMessageDialog(null,"You lose!");

				ties[runs -1 ] = 0;
				userWins[runs -1]=0;
				compWins[runs -1]=1;
			}
			if ((choice.equals("SCISSORS")))
			{
				JOptionPane.showMessageDialog(null,"Its a tie");
				//compWins = compWins +0;
				//userWins = userWins +0;

				ties[runs -1] = 1;
				userWins[runs -1]=0;
				compWins[runs -1]=0;
			}
			
			
		}
		
		for (int i : ties)
		{
			totalTies +=i;
		}
		
		for (int i : userWins)
		{
			totalWins +=i;
		}
		
		for (int i : compWins)
		{
			totalLose +=i;
		}
			if (totalWins == totalLose)
			{	
				JOptionPane.showMessageDialog(null,"Its a tie! Game over...");
			}
			
				
	
		if (totalWins > halfgames)
		{	
			JOptionPane.showMessageDialog(null,"Yaay you win! You won "+ totalWins +" times, and the computer won " + totalLose + " times! and there were " + totalTies + " ties");
			turns = false;
		}
		
		if (totalLose > halfgames)
		{
			JOptionPane.showMessageDialog(null,"You lost! You won "+ totalWins +" times, and the computer won " + totalLose + " times! and there were " + totalTies + " ties");
			turns = false;
		}
	}
		JOptionPane.showMessageDialog(null, "Here is a review of the game");
		for (int i =0; i <userChoice.length; i++)
		{	
			JOptionPane.showMessageDialog(null, "Your choice was for turn: " + runs + " was " + userChoice[i] + " the computers choice was " + compChoice[i]);
		}

	//	JOptionPane.showMessageDialog(null, ""
	  
	  }
	
	

}

