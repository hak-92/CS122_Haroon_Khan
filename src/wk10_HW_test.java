import javax.swing.JOptionPane;

public class wk10_HW_test {
	public static void main(String[] args) {
		
		int userchoice[] = new int [100];
		int compvalue[] = new int [100];
		
		int wins[] = new int [100];
		int loses[] = new int [100];
		
		int turns = 0;
		int play = 1;
		int totalwins=0;
		int totallose=0;
		
		int score=1;
		
		while (play == 1){
			
				
		// The dice can bounce atleast 100 times
		int bounces = (int) (Math.random() * (100)) + 1;

		int dices = Integer.parseInt(JOptionPane
				.showInputDialog("How many dice do you want to use?"));

		wk10_HW_Dice test = new wk10_HW_Dice(bounces, dices);

		test.Throw();

		int guess = Integer.parseInt(JOptionPane
				.showInputDialog("Guess the final number!"));
		
		userchoice[turns] = guess;
		
		JOptionPane.showMessageDialog(null,
				"The final number is " + test.Value());
		
		compvalue[turns] = test.Value();
		
		if ( guess == test.Value())
		{
			wins[turns] =1;
			loses[turns] = 0;
		}
		
		else if (guess != test.Value())
		{
			wins[turns] =0;
			loses[turns] = 1;
			
		}
		
		
		turns++;
		play = Integer.parseInt(JOptionPane.showInputDialog("Do you want to play again? (1 for yes, 0 for no)"));
	}
	
		score = Integer.parseInt(JOptionPane.showInputDialog("Do you want to see your score? (1 for yes, 0 for no)"));
		
		if (score == 1)
		{
			for (int j = 0; j< turns; j++)
			{
				totalwins = totalwins + wins[j];
				totallose = totallose + loses[j];
			}
			
			JOptionPane.showMessageDialog(null, "The total number of wins: " + totalwins + " and the total number of loses: " + totallose);
			
			for (int i = 0; i< turns; i++)
			{
				
				JOptionPane.showMessageDialog(null, "Turn #" + (i+1) + " Your guess was: " + userchoice[i] + " The actual number was: " + compvalue[i]);
			}
		}
		
	}
}
