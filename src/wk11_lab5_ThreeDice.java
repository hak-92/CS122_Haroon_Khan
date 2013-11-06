import javax.swing.JOptionPane;


public class wk11_lab5_ThreeDice extends wk11_lab5_Dice{
	wk11_lab5_Dice Dice = new wk11_lab5_Dice();
	


	@Override
	public int Throw()
	{
		int num =0;
		for (int i=0; i<3; i++)
		{
		int dicenum =  (int)( Math.random()*(6-1)) + 1;
		 num = dicenum+num;
		}
		
		return num/3;
		
	}
	
	
}
