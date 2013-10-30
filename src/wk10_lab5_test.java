import javax.swing.JOptionPane;


public class wk10_lab5_test {
	public static void main(String[] args) {
		
		int bounces  = (int)( Math.random()*(100)) + 1;
		int dices =  Integer.parseInt(JOptionPane.showInputDialog("How many dice do you want to use?"));
		wk10_lab5_Dice test = new wk10_lab5_Dice(bounces);
		 
		test.Throw(dices, bounces);
		
		JOptionPane.showMessageDialog(null,"The final number is " + test.Value());
	
	
	}

}
