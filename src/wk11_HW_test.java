import javax.swing.JOptionPane;


public class wk11_HW_test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		int turns = 0;
		
		int play = 1;
		int showscore = 1;
		int dices =0;
		int bounces =0;
		
	int bigloop =1;
	
	while (bigloop ==1){
		
		
		//	
		
		//wk11_HW_TripleDiceHistory test = new wk11_HW_TripleDiceHistory(dices);
		//wk11_HW_TripleDiceHistory clone = (wk11_HW_TripleDiceHistory) test.clone();
		
		while (play ==1){
			
			dices = Integer.parseInt(JOptionPane
					.showInputDialog("How many dice do you want to use?"));

		 bounces = (int) (Math.random() * (100)) + 1;
		
		wk11_HW_TripleDiceHistory test = new wk11_HW_TripleDiceHistory(dices);
	    wk11_HW_TripleDiceHistory clone = (wk11_HW_TripleDiceHistory) test.clone();
		
		int val = test.Throw();
		clone.Throw(); 
		
		int guess = Integer.parseInt(JOptionPane
				.showInputDialog("Guess the final number!"));
		
			
			JOptionPane.showMessageDialog(null,"The total is : " + val);
		System.out.println(test);
		
		test.score(guess, turns);
		
		/* Checks the clone object */
		//-------------------------------------
		System.out.println(clone);
		
		if(test.equals(clone))
		{
			System.out.println("The two objects are equal");
		}
		else
		{
			System.out.print("Not equal, the memory location is not the same!");
			
		}
		//------------------------------------------
		
		
		turns++;
		play = Integer.parseInt(JOptionPane.showInputDialog("Do you want to play again? (1 for yes, 0 for no)"));
		
		
		if(play ==0)
		{
		showscore = Integer.parseInt(JOptionPane.showInputDialog("Do you want to see your score? (1 for yes, 0 for no)"));
	
		test.scorecard(turns, guess);
		
		bigloop =0;
		}
		
		}
		
	}
}
}

// Acceptable, but if this is a TrippleDice, there is no need to pass in the number of dices.
