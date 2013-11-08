public class wk11_lab8_TripleDiceHistory extends wk11_lab8_TripleDice {

	int val_throw[] = new int[100];
	int throw_count = 0;
	String data_all = "";

	public wk11_lab8_TripleDiceHistory(int dices) {
		super(dices);

	}

	@Override
	public int Throw(int dices, int bounces) {
		// Returns the total value after throwing n amount of dice, and throwing
		// each dice three times and taking the average

		int num = 0; // Keeps track of the cumulative value of the three throws
						// per dice
		int tripledice = 0; // This is the average after the three throws per
							// dice
		int totalval = 0; // The total value after averaging each dice and
							// adding up the value for the total number of dice

		for (int i = 0; i < dices; i++) { // Throw the following number of dice

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

	@Override
	public String toString() {

		for (int i = 0; i < throw_count; i++) {
			data_all += "Throw#:" + (i + 1) + " The value was: " + val_throw[i]
					+ "\n";

		}
		return data_all;
	}
}
