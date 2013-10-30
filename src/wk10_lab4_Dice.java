import javax.swing.JOptionPane;


public class wk10_lab4_Dice {
	
	
	 static int dnum;
	 
	 
		
	public static void OneThrow()
	{
	
		dnum = (int)( Math.random()*(6-1)) + 1;
		JOptionPane.showMessageDialog(null,"The number is " + dnum);
		
	}
}
