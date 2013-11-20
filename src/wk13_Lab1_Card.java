import java.util.ArrayList;


public class wk13_Lab1_Card implements wk13_Lab1_GenNum{
	
	int cardnum;
	
	ArrayList<Integer> hist = new ArrayList<Integer>();

	@Override
	public int generate() {
		
		cardnum = (int) ((Math.random() * (52 - 1)) + 1);
		hist.add(cardnum);
		return cardnum;
	}

	@Override
	public String GetHistory() {
		
		
		String history = " Card: ";
		
		for (int i: hist){
			history += i ;
		}
		
		return history;
	}

}


