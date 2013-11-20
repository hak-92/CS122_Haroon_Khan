import java.util.ArrayList;


public class wk13_Lab1_Dice implements wk13_Lab1_GenNum{
	
	int num;
	
	ArrayList<Integer> hist = new ArrayList<Integer>();
	

	@Override
	public int generate() {
		
		num =  (int) ((Math.random() * (6 - 1)) + 1);
		
		hist.add(num);
		return num;
	}


	@Override
	public String GetHistory() {
		
		
		String history = "Dice: ";
		
		for (int i: hist){
			history += i ;
		}
		
		return history;
	}
	
	

}
