import javax.swing.JOptionPane;


public class wk11_lab3_test {
	public static void main(String[] args) {
	wk11_lab3_ThreeDice test = new wk11_lab3_ThreeDice();

	test.roll();
	JOptionPane.showMessageDialog(null,"The average of the three die is : " + test.avg());
}
}