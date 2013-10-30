
public class wk10_lab1_Dice {
	
	 int Dice_num;
	
	public int Throw()
	{
	
		//Min + (int)(Math.random() * ((Max - Min) + 1))
		
		int num =  (int)( Math.random()*(6-1)) + 1;
		return num;
	}

	public int Value()
	{
		 Dice_num = Throw();
		return Dice_num;
		
	}
}
