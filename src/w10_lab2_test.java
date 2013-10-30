import javax.swing.JOptionPane;


public class w10_lab2_test {
	public static void main(String[] args) {
		
		wk10_lab2_Dice test = new wk10_lab2_Dice();
		int bounces;
		
		
		 bounces = (int)( Math.random()*(2)) + 1;
		
		 
		test.Throw(bounces);
		
		JOptionPane.showMessageDialog(null,"The number is " + test.Value());
	
	
	}

}
