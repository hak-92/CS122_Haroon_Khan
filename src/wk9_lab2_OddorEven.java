import javax.swing.JOptionPane;

public class wk9_lab2_OddorEven {

	
	private int m_val;
	
//	public String even;
	//public String odd;
	
	public void setval( int val)
	{
		m_val = val;
	}
	
	public String oddeven()
	{
		if (m_val%2 ==0) {
			return "even";
		}
		
		else
			return "odd";
	}
	
	public static void odd() {
		JOptionPane.showMessageDialog(null, "Odd");
	}

	public static void even() {
		JOptionPane.showMessageDialog(null, "Even");
	}
}
