import javax.swing.JOptionPane;


public class Test2_GamePlay {
	
	public static void main(String[] args) {
		
	
		int guess = 0;
		int value = 0;
		int turns =0;
		
		
		int play =1;
		int showscore;
		
		String instructions = null;
		Test2_History Hist = new Test2_History();
		Test2_Dice Dicenum = null; //makes an empty object of type dice
		
		
		while (play ==1){
		
			
		
		
	
		
		int dice_amt =  Integer.parseInt(JOptionPane.showInputDialog("How many dice do you want to use (1,2, or 3 Dice)?"));
		
		if (dice_amt == 1)
		{
			Dicenum = new Test2_SingleDice(1);
			instructions = "Between 1-6";
		}
		
		if (dice_amt == 2)
		{
			Dicenum = new Test2_DoubleDice(2);
			instructions = "Between 1-12";
		}
		
		if (dice_amt == 3)
		{
			Dicenum = new Test2_TripleDice(3);
			instructions = "Between 1-18";
		}
		

		
		
		turns++;
		
		guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number " + instructions));
		value = Dicenum.Throw();
		
		
		JOptionPane.showMessageDialog(null,"The total is : " + Dicenum);
		
		Hist.score(turns,guess,value);
	
			
		
	play = Integer.parseInt(JOptionPane.showInputDialog("Do you want to play again? (1 for yes, 0 for no)"));
	
	
	if(play ==0)
	{
	showscore = Integer.parseInt(JOptionPane.showInputDialog("Do you want to see your score? (1 for yes, 0 for no)"));
	
	if (showscore == 1){
	
	
	Hist.scorecard(turns, guess);
	System.out.println(Hist);
	}
	
	
	
			}
		}
}
}
