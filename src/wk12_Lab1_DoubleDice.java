
public class wk12_Lab1_DoubleDice extends wk12_Lab1_Dice {
	

	@Override
	public int Throw() {
		
		return 2;
	}
	
	

	@Override
	public String toString()
	{
		return String.format("The value is " +Throw());
		
	}
}
