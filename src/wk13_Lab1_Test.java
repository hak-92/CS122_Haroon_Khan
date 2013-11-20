import javax.swing.JOptionPane;


public class wk13_Lab1_Test {
	public static void main(String[] args) {
		
	
	
	wk13_Lab1_GenNum[] InterfaceObjects = new wk13_Lab1_GenNum[2];
	wk13_Lab1_Dice dice = new wk13_Lab1_Dice();
	wk13_Lab1_Card card = new wk13_Lab1_Card();
	
	InterfaceObjects[0] = dice;
	InterfaceObjects[1] = card;
	
	

	
	for (wk13_Lab1_GenNum i : InterfaceObjects)
	{
		int num = i.generate();
		System.out.println(" The  number is: " + num);
		
		System.out.println("  History is: ");
		
		System.out.println(i.GetHistory());
		
	
		}

	
	
	
	}
}
