import javax.swing.JOptionPane;


public class wk13_Lab1_Test {
	public static void main(String[] args) {
		
	
	
	wk13_Lab1_GenNum[] Hist = new wk13_Lab1_GenNum[2];

	wk13_Lab1_Dice dice = new wk13_Lab1_Dice();
	wk13_Lab1_Card card = new wk13_Lab1_Card();
	
	Hist[0] = dice;
	Hist [1] =card;
	
	int turns = 0;
	
	int [] history = new int [100];
	
	for (wk13_Lab1_GenNum i : Hist)
	{
		int num = i.generate();
		System.out.println(" The number is: " + num);
		history[turns]= num;
		turns++;
	}
	
	for (int i = 0; i < turns; i++){
		System.out.println(" The History number is: " + history[i]);
	}
	
		
		
	
	
	
	}
}
