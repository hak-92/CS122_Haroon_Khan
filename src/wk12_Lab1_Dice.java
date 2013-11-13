
public abstract class wk12_Lab1_Dice {

	 int Dice_num;
	 
	 
	
		public abstract int Throw();

		public int Value()
		{
			 Dice_num = Throw();
			return Dice_num;
			
		}
}
