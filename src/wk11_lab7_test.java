import javax.swing.JOptionPane;


public class wk11_lab7_test {

	public static void main(String[] args) {
		
		int dices = Integer.parseInt(JOptionPane
				.showInputDialog("How many dice do you want to use?"));
		
		wk11_lab7_TripleDice test = new wk11_lab7_TripleDice(dices);
		
		int val = test.Throw(dices,0);
		
		JOptionPane.showMessageDialog(null,"The total is : " + val);
		System.out.println(test);
		
	
}
}
