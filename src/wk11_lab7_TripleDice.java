
public class wk11_lab7_TripleDice extends wk11_lab7_Dice{
	int Dice_num;

	public wk11_lab7_TripleDice(int dices)
	{
		
		super(dices);
		
	}
	//wk11_lab6_Dice Dice = new wk11_lab6_Dice(Dice_num);
	


	@Override
	public int Throw(int dices, int bounces)
	{
		int num =0;
		int tripledice = 0;
		int totalval = 0;
		
		 for (int i =0; i < dices; i++)
         {
			 
         
		
		for (int j=0; j<3; j++)
		{
		int dicenum =  (int)( Math.random()*(6-1)) + 1;
		 num = dicenum+num;
		}
		
		tripledice = num/3;
		
         }
		
		 totalval = tripledice + totalval;
		return totalval;
		
	
		
	
}
}
