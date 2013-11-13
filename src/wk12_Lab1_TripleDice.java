
public class wk12_Lab1_TripleDice extends wk12_Lab1_Dice {

	@Override
	public int Throw() {
		
		return 3;
	}
	
	@Override
	public String toString()
	{
		return String.format("The value is " +Throw());
		
	}
	

}
