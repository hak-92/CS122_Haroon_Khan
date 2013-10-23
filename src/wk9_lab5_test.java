import javax.swing.JOptionPane;

public class wk9_lab5_test {
	public static void main(String[] args) {
		
	int tries =0;
		
		
		//int computerNum;
		
		int [] userWins = new int [100];
		int [] compWins = new int [100]; 
		
		
		String [] userChoice = new String [100];
		int [] compChoice = new int [100];
		
		int choice = 1;
		int scorecard;
		
	
		
		while (choice == 1){
									
		wk9_lab5_OddorEven comp = new wk9_lab5_OddorEven();
		
		String guess = JOptionPane.showInputDialog("Guess if its even or odd. (All lower case)");
		userChoice[tries] = guess;
		compChoice[tries] = comp.compval();
		
JOptionPane.showMessageDialog(null,"The number is " + comp.compval());
		
		if (guess.equals(comp.oddeven()))
		{
				
					JOptionPane.showMessageDialog(null,"Good Guess! The number was " + comp.oddeven());
					userWins[tries]=1;
					compWins[tries]=0;
		}
	  
			else if (guess != comp.oddeven())
				{	
					JOptionPane.showMessageDialog(null,"Bad guess! The number was " + comp.oddeven());
					userWins[tries]=0;
					compWins[tries]=1;
				}
		
		
		
		choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to keep playing? 1 for yes, 0 for no"));
		
		if (choice ==  0) {
		scorecard =  Integer.parseInt(JOptionPane.showInputDialog("Do you want to see the scorecard? 1 for yes, 0 for no"));
		
			if (scorecard == 1)
			{	
				int wins=0;
				int loses=0;
				
				for (int i : userWins)
				{	
					wins +=i; 
				}
				
				for (int i : compWins)
				{	
					loses +=i; 
				}
				
				JOptionPane.showMessageDialog(null, "You had " + wins + 
						" correct guesses. And  " + loses + " wrong guesses!");
				
				JOptionPane.showMessageDialog(null, "The following are your guesses and the computers number");
				
				for(int i =0; i<=tries; i++)
				{	
					
					JOptionPane.showMessageDialog(null, "Try:" + (i+1) + " Your guess was: " + userChoice[i] + " The actual number was: " + compChoice[i]);
				}
				
				scorecard =1;
				}	
			}
			
			tries++;
	
		}
	  
		
	
		
		
			

		
		

		
	}

	} // End of main


