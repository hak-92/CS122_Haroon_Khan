import javax.swing.JOptionPane;

public class wk9_lab3_OddorEven {

	private int m_val;

	public wk9_lab3_OddorEven(int val) {
		m_val = val;
	}

	public void setval(int val) {
		m_val = val;
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
