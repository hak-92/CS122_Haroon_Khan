import javax.swing.JOptionPane;


public class wk9_lab2_test {

	
	public static void main (String [] args)
	{
		wk9_lab2_OddorEven test = new wk9_lab2_OddorEven();	
		
		int val = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		test.setval(val);
		
		JOptionPane.showMessageDialog(null, "Your number is " + test.oddeven() );
	
	
	} // End of main
	
}

