
public abstract class Test2_Dice {
	
	 int Dice_num;
	 
	 public Test2_Dice(int dices){
		 Dice_num = dices;
	 }
		
		
		public abstract int Throw();

		public int Value()
		{
			 
			return (int) (Math.random() * (6 - 3)) + 1;
			
		}

}
