import javax.swing.JOptionPane;

public class wk11_HW_TripleDiceHistory extends wk11_HW_Dice implements Cloneable {

	int val_throw[] = new int[1000000];
	int wins[] = new int [100];
	int loses[] = new int [100];
	int totalwins=0;
	int totallose=0;
	int userchoice[] = new int [100];
	int compvalue[] = new int [100];
	
	 int dices;
	 int Dice_amt;
	
	int throw_count = 0;
	String data_all = "";
	int totalval = 0; // The total value after averaging each dice and
	// adding up the value for the total number of dice

	int bounces = (int) (Math.random() * (100)) + 1;
	
	public wk11_HW_TripleDiceHistory(int dices) {
		super(dices);
		Dice_amt = dices;
	//	bncs = bounces; 
	}

	

	



	@Override
	public int Throw() {
		// Returns the total value after throwing n amount of dice, and throwing
		// each dice three times and taking the average

		int num = 0; // Keeps track of the cumulative value of the three throws
						// per dice
		int tripledice = 0; // This is the average after the three throws per
							// dice
		int totalval = 0; // The total value after averaging each dice and
							// adding up the value for the total number of dice
		
		System.out.println(Dice_amt);

		for (int i = 0; i < Dice_amt; i++) { // Throw the following number of dice

			// For each dice, throw it three times, and find the total sum after
			// each throw

			for (int j = 0; j < 3; j++) {
				int dicenum = (int) (Math.random() * (6 - 1)) + 1;
				num = dicenum + num;

				count_throws(dicenum);
			}

			tripledice = num / 3;

			totalval = tripledice + totalval;
		}

		
		return totalval;
	}

	// The following method will be called every time the dice is thrown. It
	// will be called from the throw method

	public void count_throws(int dicenum) {
		// Here, throw_count is for the iteration for the array

		val_throw[throw_count] = dicenum;
		throw_count++;

	}

	public void score(int guess, int turns){
		
		
		if ( guess == totalval)
		{
			wins[turns] =1;
			loses[turns] = 0;
		}
		
		else if (guess != totalval)
		{
			wins[turns] =0;
			loses[turns] = 1;
			
		}
		
		userchoice[turns] = guess;
		compvalue[turns] = totalval;
	}
	
	public void scorecard(int turns,int guess)
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
	
	
	@Override
	public String toString() {

		for (int i = 0; i < throw_count; i++) {
			data_all += "Throw#:" + (i + 1) + " The value was: " + val_throw[i]
					+ "\n";

		}
		return data_all;
	}
	
	@Override

	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
}
