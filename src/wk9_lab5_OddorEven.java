import javax.swing.JOptionPane;


public class wk9_lab5_OddorEven {
	
	private int m_val;

	public wk9_lab5_OddorEven(int val) {
		m_val = val;
	}

	public wk9_lab5_OddorEven() {
		m_val =  0 + (int)(Math.random()*10);
	}
	
	public void setval(int val) {
		m_val = val;
	}

	public int compval()
	{
		return m_val;
	}
	public String oddeven() {
		if (m_val % 2 == 0) {
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
