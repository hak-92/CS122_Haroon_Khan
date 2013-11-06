
public class wk11_lab3_ThreeDice {
	
	wk11_lab3_Dice D1 = new wk11_lab3_Dice();
	wk11_lab3_Dice D2 = new wk11_lab3_Dice();
	wk11_lab3_Dice D3 = new wk11_lab3_Dice();
	
	int D1val;
	int D2val;
	int D3val;
	int avg;
	
	public void roll()
	{
		D1val = D1.Throw();
		D2val = D2.Throw();
		D3val = D3.Throw();
		
		System.out.println("D1: " + D1val +" D2: " + D2val +" D3: "+  D3val);
	}
	
	public int avg()
	{
		int avgVal = (D1val + D2val + D3val)/3;
		avg = avgVal;
		return avg;
	}
}
