import javax.swing.JOptionPane;


public class wk13_Lab2_Test {
	public static void main(String[] args) {
		
	
	
	wk13_Lab2_GenNum[] InterfaceObjects = new wk13_Lab2_GenNum[10];
	wk13_Lab2_Dice dice = new wk13_Lab2_Dice();
	wk13_Lab2_Card card = new wk13_Lab2_Card();
	
	InterfaceObjects[0] = dice;
	InterfaceObjects[1] = card;
	InterfaceObjects[2] = dice;
	InterfaceObjects[3] = card;
	InterfaceObjects[4] = dice;
	InterfaceObjects[5] = card;
	InterfaceObjects[6] = dice;
	InterfaceObjects[7] = card;
	InterfaceObjects[8] = dice;
	InterfaceObjects[9] = dice;

	
	

	
	for (wk13_Lab2_GenNum i : InterfaceObjects)
	{
		int num = i.generate();
		System.out.println(" The  number is: " + num);
		
		System.out.println("  History is: ");
		
		System.out.println(i.GetHistory());
		
	
		}

	
	
	
	}
}
