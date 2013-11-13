
public class Test2_DoubleDice extends Test2_Dice {
	
	int dice_num;
	int bounce_num;
	int value;
	
	//Constructor: Expects to have the number of dice passed to the class
	public Test2_DoubleDice(int dices)
	{
		super(dices);
	}
	
	@Override
	public int Throw() {
		
		
		value =  (int) (Math.random() * (12 - 1)) + 1;
		return value;
		
	}

@Override
	
	public String toString()
	{
		return String.format("" + Throw());
	}
}
