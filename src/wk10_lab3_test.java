import javax.swing.JOptionPane;


public class wk10_lab3_test {
	public static void main(String[] args) {
		
		int bounces  = (int)( Math.random()*(2)) + 1;
		wk10_lab3_Dice test = new wk10_lab3_Dice(bounces);
		 
		test.Throw(bounces);
		
		JOptionPane.showMessageDialog(null,"The number is " + test.Value());
	
	
	}

}
