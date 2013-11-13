
public class Test2_TripleDice extends Test2_Dice{
	
	int dice_num;
	int bounce_num;
	int value;
	
	//Constructor: Expects to have the number of dice passed to the class
	public Test2_TripleDice(int dices)
	{
		super(dices);
	}
	
	@Override
	public int Throw() {
		
		
		value =  (int) (Math.random() * (18 - 1)) + 1;
		return value;
		
	}

@Override
	
	public String toString()
	{
		return String.format("" + Throw());
	
}

}
