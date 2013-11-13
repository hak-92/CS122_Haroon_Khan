
public class wk12_Lab2_DoubleDice extends wk12_Lab2_Dice {
	
	
	@Override
	public int Throw()
	{
		return 2;
	}

	@Override
	
	public String toString()
	{
		return String.format("The value is: " + Throw());
	}
}
