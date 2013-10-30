import javax.swing.JOptionPane;


public class w10_lab1_test {
	public static void main(String[] args) {
		
		wk10_lab1_Dice test = new wk10_lab1_Dice();
		
		test.Throw();
		
		JOptionPane.showMessageDialog(null,"The number is " + test.Value());
	
	
	}

}
