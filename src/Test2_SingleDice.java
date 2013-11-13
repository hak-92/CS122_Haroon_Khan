
public class Test2_SingleDice extends Test2_Dice {

	int dice_num;
	int bounce_num;
	
	
	//Constructor: Expects to have the number of dice passed to the class
	public Test2_SingleDice(int dices)
	{
		super(dices);
	}
	
	@Override
	public int Throw() {
		
		
		return (int) (Math.random() * (6 - 1)) + 1;
	
		
	}
	
@Override
	
	public String toString()
	{
		return String.format("" + Throw());
	}

}
