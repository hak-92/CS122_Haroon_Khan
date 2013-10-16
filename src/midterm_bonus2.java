import javax.swing.JOptionPane;


public class midterm_bonus2 {
public static void main ( String [] args)
	
	{
		int n =  Integer.parseInt(JOptionPane.showInputDialog(" Enter a number! "));
		
		int m =1;
		int f=1;
		
		int run =0;
		
		while (run == 0)
		{
			
		f = f*m;
	// The following output statement is to keep track of how the values are changing
		System.out.println("f =" + f);
		
		if (m == n)
		{
			JOptionPane.showMessageDialog(null, "F = " + f);
			run =1;
			
		}
		
		else
		{
			
			m = m+1;
			// The following output statement is to keep track of how the values are changing
			System.out.println("m = " +m);
			run =0;
			
		}
		}
		
	}
}


