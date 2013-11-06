import javax.swing.JOptionPane;


public class wk11_lab5_test {
	public static void main(String[] args) {
	wk11_lab5_ThreeDice test = new wk11_lab5_ThreeDice();
	
	int val = test.Throw();
	
	JOptionPane.showMessageDialog(null,"The average of the three rolls is : " + val);
	
}
}