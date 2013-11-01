import javax.swing.JOptionPane;

public class wk10_HW_Dice {

	int Dice_num;
	int num;
	int bounces;
	int dices;

	// Constructor
	// bounce_num is the number of bounces, this value comes from main
	public wk10_HW_Dice(int bounce_num, int dices_num) {
		bounces = bounce_num;
		dices = dices_num;
	}

	// Determines the value of the dice based on the number of bounces
	public int Throw() {
		JOptionPane.showMessageDialog(null, "The number of bounces are "
				+ bounces);

		// Min + (int)(Math.random() * ((Max - Min) + 1))
		int totalval = 0;

		for (int i = 0; i < dices; i++) {

			if (bounces == 1 || bounces == 0) {
				totalval = (int) (Math.random() * (6 - 1)) + 1;

			}

			else {
				int num1 = 0;
				for (int j = 0; j < bounces; j++) {
					num1 = num1 + (int) (Math.random() * (6 - 1)) + 1;
				}
				totalval = (num1) / bounces;
			}

			num = num + totalval;

		}

		return num;
	}

	public int Value() {
		Dice_num = num;
		return Dice_num;

	}
}
