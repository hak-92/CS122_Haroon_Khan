
public abstract class wk12_Lab2_Dice {

	 int Dice_num;
	 
	
	
		public abstract int Throw();

		public int Value()
		{
			 
			return (int) (Math.random() * (6 - 3)) + 1;
			
		}
}



