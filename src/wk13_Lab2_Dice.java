import java.util.ArrayList;


public class wk13_Lab2_Dice implements wk13_Lab2_GenNum{
	
	int num;
	int turns =1;
	
	 Exception myException = new ArithmeticException("More than three turns");
	
	ArrayList<Integer> hist = new ArrayList<Integer>();
	

	@Override
	public int generate() {
		
		try{
		
		num =  (int) ((Math.random() * (6 - 1)) + 1);
		
		hist.add(num);
		
		if(turns >3){
		throw new Exception();
	
		}
	
		}
		
		catch( Exception exception){
			
			System.err.println("More than three turns");
			
			
		}
		
		finally{
			turns ++;
			return num;
			
		}
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
