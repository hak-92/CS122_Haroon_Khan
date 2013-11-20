
public class wk13_Lab1_Card implements wk13_Lab1_GenNum{
	
	int cardnum;

	@Override
	public int generate() {
		
		cardnum = (int) ((Math.random() * (52 - 1)) + 1);
		return cardnum;
	}

}
