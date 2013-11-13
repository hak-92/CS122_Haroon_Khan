import javax.swing.JOptionPane;


public class Test2_History {
	
	public int m_turns;
	public int m_guess;
	public int m_val;
	
	int wins[] = new int [100];
	int loses[] = new int [100];
	int totalwins=0;
	int totallose=0;
	int userchoice[] = new int [100];
	int compvalue[] = new int [100];
	
	String data_all = "";
	


public void score(int turns, int guess, int value){
	
	int m_turns = turns;
	int m_guess = guess;
	int m_val = value;
	
	if ( guess == value)
	{
		wins[turns] =1;
		loses[turns] = 0;
	}
	
	else if (guess !=value)
	{
		wins[turns] =0;
		loses[turns] = 1;
		
	}
	
	//userchoice[turns] = guess;
	//compvalue[turns] = value;
	
	for (int i = 0; i < turns; i++)
	{
		userchoice[i] = guess;
		compvalue[i] = value;
	}
}
		
public void scorecard(int turns,int guess)
{
	for (int j = 0; j< turns; j++)
	{
		totalwins = totalwins + wins[j];
		totallose = totallose + loses[j];
	}
	
	JOptionPane.showMessageDialog(null, "The total number of wins: " + totalwins + " and the total number of loses: " + totallose);
	
	for (int i = 0; i< turns; i++)
	{
		
		JOptionPane.showMessageDialog(null, "Turn #" + (i+1) + " Your guess was: " + userchoice[i] + " The actual number was: " + compvalue[i]);
	}
}


@Override
public String toString() {

	
	for (int j = 0; j< m_turns; j++)
	{
		totalwins = totalwins + wins[j];
		totallose = totallose + loses[j];

	
	//data_all = "The total number of wins: " + totalwins + " and the total number of loses: " + totallose + "  ";
	

		
		data_all +=  "Turn #" + (j+1) + " Your guess was: " + userchoice[j] + " The actual number was: " + compvalue[j];
	}

	return data_all;
}

		

}
