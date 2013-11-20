
public class wk13_Lab1_Dice implements wk13_Lab1_GenNum{
	
	int num;
	

	@Override
	public int generate() {
		
		num =  (int) ((Math.random() * (6 - 1)) + 1);
		return num;
	}
	
	

}
