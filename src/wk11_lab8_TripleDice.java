public class wk11_lab8_TripleDice extends wk11_lab8_Dice {
	int Dice_num;

	public wk11_lab8_TripleDice(int dices) {

		super(dices);

	}

	// wk11_lab8_Dice Dice = new wk11_lab8_Dice(Dice_num);

	@Override
	public int Throw(int dices, int bounces) {
		int num = 0; // Keeps track of the cumulative value of the three throws per dice
		int tripledice = 0; //This is the average after the three throws per dice
		int totalval = 0; // The total value after averaging each dice and adding up the value for the total number of dice

		
		for (int i = 0; i < dices; i++) { // Throw the following number of dice
			
			// For each dice, throw it three times, and find the total sum after each throw
			
			for (int j = 0; j < 3; j++) {
				int dicenum = (int) (Math.random() * (6 - 1)) + 1;
				num = dicenum + num;
			}

			tripledice = num / 3;
			totalval = tripledice + totalval;
		}

		
		return totalval;

	}
}
